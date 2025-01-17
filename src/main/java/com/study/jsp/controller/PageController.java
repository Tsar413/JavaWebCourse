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

    @RequestMapping("/loginSuccess")
    public String loginSuccess(){
        return "serverInteraction/loginSuccess";
    }

    @RequestMapping("/loginFail")
    public String loginFail(){
        return "serverInteraction/loginFail";
    }

    @RequestMapping("/getInformationHomework")
    public String getInformationHomeworkPage(){
        return "serverInteraction/getInformationHomework";
    }

    @RequestMapping("/calculatorPage")
    public String getCalculatorPage(){
        return "pageRequest/calculatorPage";
    }

    @RequestMapping("/judgePage")
    public String getRequestResult(){
        return "pageRequest/judge";
    }

    @RequestMapping("/correctPage")
    public String getCorrectResultPage(){
        return "pageRequest/correctPage";
    }

    @RequestMapping("/incorrectPage")
    public String getIncorrectResultPage(){
        return "pageRequest/incorrectPage";
    }

    @RequestMapping("/refreshPage")
    public String getRefreshPagePage(){
        return "refresh";
    }
}
