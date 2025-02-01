<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.study.jsp.entity.Book,com.study.jsp.controller.BookController"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Books</title>
</head>
<body>
<center>
<a href="foods">食品区</a>  <a href="shopCart">购物车</a>
<%
    BookController bookController = new BookController();
    List<Book> list = bookController.getAllBooks();
    for(Book book : list){
%>
    <h3><%=book.getName()%></h3>
    <p>作者: <%=book.getAuthor()%></p>
    <p>售价: ￥<%=book.getPrice()%></p>
    <form method="post" action="deals">
        数量: <input type="text" name="number">
        <input type="hidden" name="from" value="1">
        <input type="hidden" name="id" value=<%=book.getId()%>>
        <input type="hidden" name="name" value=<%=book.getName()%>>
        <input type="hidden" name="price" value=<%=book.getPrice()%>>
        <input type="submit" value="购买">
    </form>
    <hr>
<%
    }
%>
<!--
    <h3>书1</h3>
    <p>作者</p>
    <p>售价￥</p>
    <form method="post" action="deals">
        数量: <input type="text" name="number">
        <input type="hidden" name="name" value="书1">
        <input type="hidden" name="price" value="10">
        <input type="submit" value="购买">
    </form>
    <hr>
    <h3>书2</h3>
    <p>作者</p>
    <p>售价￥</p>
    <form method="post" action="deals">
        数量: <input type="text" name="number">
        <input type="hidden" name="name" value="书2">
        <input type="hidden" name="price" value="20">
        <input type="submit" value="购买">
    </form>
    -->
</center>
</body>
</html>