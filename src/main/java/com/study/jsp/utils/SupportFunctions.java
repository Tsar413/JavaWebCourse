package com.study.jsp.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class SupportFunctions {
    public void generatingOperation(){
        Random random = new Random();
        int answer = 0;
        int firstNum = random.nextInt(100);
        int secondNum = random.nextInt(100);
        if(secondNum == 0){
            secondNum = random.nextInt(100);
        }
        int ops = random.nextInt(4);
        System.out.println(firstNum);
        if(ops == 0){
            answer = firstNum + secondNum;
            System.out.println("+");
        }
        if(ops == 1){
            answer = firstNum - secondNum;
            System.out.println("-");
        }
        if(ops == 2){
            answer = firstNum * secondNum;
            System.out.println("*");
        }
        if(ops == 3){
            answer = firstNum / secondNum;
            System.out.println("/");
        }
        System.out.println(secondNum);
        System.out.println("=");
    }

    public void judgeUser(){
        Map<Integer, String[]> map = new HashMap<Integer, String[]>();
        map.put(1, new String[]{"a","123"});
        map.put(2, new String[]{"b","123"});
        String username = "a";
        String password = "123";
        for (String[] user : map.values()){
            if(user[0].equals(username) && user[1].equals(password)){
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);
    }
}
