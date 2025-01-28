package com.study.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/course1")
    public String getCoursePage1(){
        return "course1";
    }

    @RequestMapping("/javaBeanLearning1")
    public String getJavaBeanLearningPage1(){
        return "javaBeanLearning/javaBeanLearning1";
    }
}
