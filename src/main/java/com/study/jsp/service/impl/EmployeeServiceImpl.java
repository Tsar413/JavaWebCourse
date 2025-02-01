package com.study.jsp.service.impl;

import com.study.jsp.dao.EmployeeDAO;
import com.study.jsp.entity.Employee;
import com.study.jsp.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getList() {
        return employeeDAO.getList();
    }
}
