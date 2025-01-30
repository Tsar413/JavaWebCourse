package com.study.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/javaBeanLearning1")
    public String getJavaBeanLearningPage1(){
        return "javaBeanLearning/javaBeanLearning1";
    }

    @RequestMapping("/javaBeanTransData1")
    public String getJavaBeanTransDataPage1(){
        return "javaBeanLearning/javaBeanTransData1";
    }

    @RequestMapping("/javaBeanReceiveData1")
    public String getJavaBeanReceiveDataPage1(){
        return "javaBeanLearning/javaBeanReceiveData1";
    }

    @RequestMapping("/javaBeanReceiveData2")
    public String getJavaBeanReceiveDataPage2(){
        return "javaBeanLearning/javaBeanReceiveData2";
    }

    @RequestMapping("/javaBeanTransData2")
    public String getJavaBeanTransDataPage2(){
        return "javaBeanTesting/javaBeanTransData2";
    }

    @RequestMapping("/javaBeanReceiveData3")
    public String getJavaBeanReceiveDataPage3(){
        return "javaBeanTesting/javaBeanReceiveData3";
    }

    @RequestMapping("/javaBeanReceiveData4")
    public String getJavaBeanReceiveDataPage4(){
        return "javaBeanTesting/javaBeanReceiveData4";
    }
}
