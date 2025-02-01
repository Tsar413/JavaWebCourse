package com.study.jsp.controller;

import com.study.jsp.entity.Employee;
import com.study.jsp.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    //返回员工列表
    @RequestMapping("list")
    public String listEmployee(HttpServletRequest request, Model model){
        // 获取员工列表
        List<Employee> list = employeeService.getList();
        // request.setAttribute("employees", list);
        model.addAttribute("employees", list);
        return "emplist";
    }
}
