package com.study.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/regist")
    public String getRegistrationPage(){
        return "regist";
    }

    @RequestMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping("/emplist")
    public String getEmpListPage(){
        return "emplist";
    }
}
