package com.study.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/books")
    public String getBooksPage(){
        return "stores/books";
    }

    @RequestMapping("/foods")
    public String getFoodsPage(){
        return "stores/foods";
    }

    @RequestMapping("/shopCart")
    public String getShopCartPage(){
        return "stores/shopCart";
    }

    @RequestMapping("/deals")
    public String getDealsPage(){
        return "stores/deals";
    }
}
