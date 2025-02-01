package com.study.jsp.service;

import com.study.jsp.entity.Book;

import java.util.List;

public interface IBookService {
    String hello();

    List<Book> getAllBooks();
}
