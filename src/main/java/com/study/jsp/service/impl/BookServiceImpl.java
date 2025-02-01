package com.study.jsp.service.impl;

import com.study.jsp.dao.BookDAO;
import com.study.jsp.dao.DatabaseResource;
import com.study.jsp.dao.impl.BookDAOImpl;
import com.study.jsp.entity.Book;
import com.study.jsp.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Resource
    private BookDAO bookDAO = new BookDAOImpl(new DatabaseResource().getJdbcTemplate());

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
}
