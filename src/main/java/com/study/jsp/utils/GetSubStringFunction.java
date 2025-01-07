package com.study.jsp.utils;

import org.springframework.stereotype.Component;

@Component
public class GetSubStringFunction {
    public String getSubStringFunction(String s){
        if(s.length() < 4){
            return "长度不够";
        }
        return s.substring(1,4);
    }
}
