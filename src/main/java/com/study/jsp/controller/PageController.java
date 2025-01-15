package com.study.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/serverInteraction")
    public String getWebsiteServerInteractionPage(){
        return "serverInteraction/serverInteraction";
    }

    @RequestMapping("/getInformation")
    public String getInformationPage(){
        return "serverInteraction/getInformation";
    }

    @RequestMapping("/getInformationHomework")
    public String getInformationHomeworkPage(){
        return "serverInteraction/getInformationHomework";
    }

    @RequestMapping("/requestPage")
    public String getRequestPage(){
        return "pageRequest/requestPage";
    }

    @RequestMapping("/requestResult")
    public String getRequestResult(){
        return "pageRequest/result";
    }
}
