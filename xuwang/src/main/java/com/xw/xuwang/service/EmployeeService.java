package com.xw.xuwang.service;

import com.xw.xuwang.entity.Employee;

import java.util.List;

/**
 * @author huixia.hu
 * Date:     2019/12/13 16:52
 * @version 1.0
 */
public interface EmployeeService {
    List<Employee> getEmployeeList(Integer pageNum, Integer pageSize);
}
