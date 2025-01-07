package com.study.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/course2_1")
    public String getCoursePage1(){
        return "course2_1";
    }

    @RequestMapping("/index1")
    public String getWebsiteIndexPage(){
        return "website/index1";
    }
}
