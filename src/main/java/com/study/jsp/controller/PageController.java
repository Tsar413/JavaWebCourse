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

    @RequestMapping("/dataPage")
    public String getDataPage(){
        return "sessionTeaching/dataPage";
    }

    @RequestMapping("/dataTransfer")
    public String getDaraTransferPage(){
        return "sessionTeaching/dataTransfer";
    }

    @RequestMapping("/messageBoard")
    public String getMessageBoardPage(){
        return "serverInteraction/messageBoard";
    }

    @RequestMapping("/writeMessage")
    public String getWriteMessagePage(){
        return "serverInteraction/writeMessage";
    }

    @RequestMapping("/logout")
    public String getLogoutPage(){
        return "serverInteraction/logout";
    }
}
