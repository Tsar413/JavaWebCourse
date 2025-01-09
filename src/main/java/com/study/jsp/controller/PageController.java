package com.study.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/index1")
    public String getWebsiteIndexPage(){
        return "website/index1";
    }

    @RequestMapping("/course3")
    public String getWebsiteCoursePage(){
        return "course3";
    }

    @RequestMapping("/course3_4")
    public String getWebsiteCoursePage2(){
        return "course3_4";
    }

    @RequestMapping("/course3_5")
    public String getWebsiteCoursePage3(){
        return "course3_5";
    }

    @RequestMapping("/serverInteraction")
    public String getWebsiteServerInteractionPage(){
        return "serverInteraction/serverInteraction";
    }

    @RequestMapping("/getInformation")
    public String getInformationPage(){
        return "serverInteraction/getInformation";
    }
}
