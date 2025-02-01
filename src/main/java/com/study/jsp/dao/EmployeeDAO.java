package com.study.jsp.dao;

import com.study.jsp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    //查询员工信息列表
    List<Employee> getList();
}
