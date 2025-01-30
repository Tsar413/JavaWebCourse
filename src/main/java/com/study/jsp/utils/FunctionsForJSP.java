package com.study.jsp.utils;

import org.springframework.stereotype.Component;

@Component
public class FunctionsForJSP {
    public static final String INFO = "测试！";

    public int sum(int a, int b){
        return a + b;
    }

    public void getMul(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    public int getDiff(int a, int b){
        return a - b;
    }

    public int getProduct(int a, int b){
        return a * b;
    }

    public String getQuotient(int a, int b){
        if(b == 0){
            return "除数不能为0";
        }
        return String.valueOf(a / b);
    }
}
