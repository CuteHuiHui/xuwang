package com.xw.xuwang.controller;

import com.github.pagehelper.PageInfo;
import com.xw.xuwang.bean.PageResultBean;
import com.xw.xuwang.dao.EmployeeCopy1DAO;
import com.xw.xuwang.easyPoi.FileWithExcelUtil;
import com.xw.xuwang.entity.Employee;
import com.xw.xuwang.entity.EmployeeCopy1;
import com.xw.xuwang.entity.EmployeeMode;
import com.xw.xuwang.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huixia.hu
 * Date:     2019/12/13 16:48
 * @version 1.0
 */
@RestController
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;
    @Resource
    private EmployeeCopy1DAO employeeCopy1DAO;

    @RequestMapping("/getEmployeeList")
    public PageResultBean<List<Employee>> getEmployeeList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) throws Throwable {
        logger.error("error级别日志");
        logger.warn("warning级别日志");
        logger.info("info级别日志");
        return new PageResultBean<List<Employee>>(new PageInfo(employeeService.getEmployeeList(pageNum, pageSize)));
    }

    @RequestMapping("hello")
    public String test() {
        logger.info("欢迎学习切面");
        return "i love java";
    }

    //redis作为二级缓存。alue可以是任意值，只是与key组成redis中的key，例如：employeeCopy1::1    真正的value是返回的对象。  unless条件的不加入缓存
    @Cacheable(value = "employeeCopy1", key = "#id", unless = "#result.age < 23")
    //@CachePut//修改缓存
    //@CacheEvict//删除缓存
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public Object getEmployee(@PathVariable Long id) {
        logger.info("查员工信息根据id:{}", id);
        return employeeCopy1DAO.findById(id);
    }

    /**
     * 导出excel
     *
     * @param response
     */
    @RequestMapping("/exportExcel/model")
    public void export(HttpServletResponse response) {
        List<EmployeeMode> personList = new ArrayList<>();
        List<EmployeeCopy1> all = employeeCopy1DAO.findAll();
        for (EmployeeCopy1 employeeCopy1 : all) {
            EmployeeMode mode = new EmployeeMode();
            BeanUtils.copyProperties(employeeCopy1, mode);
            personList.add(mode);
            FileWithExcelUtil.exportExcel(personList, "客户信息表", "客户表", EmployeeMode.class, "客户表.xls", response);
        }
    }

    /**
     * 导入excel
     */
    @RequestMapping(value = "/importExcelForType", method = RequestMethod.POST)
    public void importExcel(@RequestParam("file") MultipartFile file) {
        try {
            List<EmployeeMode> personList = FileWithExcelUtil.importExcel(file, 1, 1, EmployeeMode.class);
            System.out.println("导入数据一共【" + personList.size() + "】行");

            for (int i = 0; i < personList.size(); i++) {
                EmployeeMode excel = personList.get(i);
                EmployeeCopy1 customer = new EmployeeCopy1();
                customer.setName(excel.getName());
                customer.setAge(excel.getAge());
                employeeCopy1DAO.save(customer);
            }
            logger.info(personList.toString());
        } catch (Exception e) {
            logger.error(e.toString());
        }
    }
}
