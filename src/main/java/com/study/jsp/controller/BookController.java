package com.study.jsp.controller;


import com.study.jsp.entity.Book;
import com.study.jsp.service.IBookService;
import com.study.jsp.service.impl.BookServiceImpl;

import java.util.List;

public class BookController {

    private IBookService iBookService = new BookServiceImpl();

    public String hello(){
        return iBookService.hello();
    }

    public List<Book> getAllBooks(){
        return iBookService.getAllBooks();
    }
}
