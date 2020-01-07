package com.xw.xuwang.service.impl;

import com.github.pagehelper.PageHelper;
import com.xw.xuwang.dao.EmployeeDAO;
import com.xw.xuwang.entity.Employee;
import com.xw.xuwang.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huixia.hu
 * Date:     2019/12/13 16:51
 * @version 1.0
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getEmployeeList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return employeeDAO.selectAll();
    }
}
