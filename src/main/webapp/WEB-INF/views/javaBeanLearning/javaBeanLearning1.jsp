<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.study.jsp.dto.User" %>
<%@ page import="com.study.jsp.dto.Shop" %>
<%@ page import="com.study.jsp.dto.Homework" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Learning1</title>
</head>
<body>
    <h1>Hello JavaBean Learning1</h1>
    <jsp:useBean id="user" class="com.study.jsp.dto.User" scope="page" />
    <jsp:setProperty name="user" property="username" value="userA" />
    <jsp:setProperty name="user" property="userPassword" value="123456" />
    <jsp:setProperty name="user" property="sex" value="男" />
    <jsp:setProperty name="user" property="age" value="20" />
    <jsp:setProperty name="user" property="address" value="北京市朝阳区" />

    <jsp:getProperty name="user" property="username" />
    <jsp:getProperty name="user" property="userPassword" />
    <jsp:getProperty name="user" property="sex" />
    <jsp:getProperty name="user" property="age" />
    <jsp:getProperty name="user" property="address" />
    <%
        User user1 = new User();
        user1.setUsername("userB");
        user1.setUserPassword("123456");
        user1.setSex("女");
        user1.setAge(19);
        user1.setAddress("上海市静安区");
    %>
    <p><%=user1.getUsername()%></p>
    <p><%=user1.getUserPassword()%></p>
    <p><%=user1.getSex()%></p>
    <p><%=user1.getAge()%></p>
    <p><%=user1.getAddress()%></p>

    <%
        Shop shop1 = new Shop();
        shop1.setProductName("苹果");
        shop1.setIntroduction("豪吃");
        shop1.setPrice(5.2);
        shop1.setStorage(10);
        shop1.setSales(5);
    %>
    <p><%=shop1.getProductName()%></p>
    <p><%=shop1.getIntroduction()%></p>
    <p><%=shop1.getPrice()%></p>
    <p><%=shop1.getStorage()%></p>
    <p><%=shop1.getSales()%></p>
    <jsp:useBean id="shop2" class="com.study.jsp.dto.Shop" scope="page" />
    <jsp:setProperty name="shop2" property="productName" value="橙子" />
    <jsp:setProperty name="shop2" property="introduction" value="甘甜" />
    <jsp:setProperty name="shop2" property="price" value="4.3" />
    <jsp:setProperty name="shop2" property="storage" value="6" />
    <jsp:setProperty name="shop2" property="sales" value="6" />
    <jsp:getProperty name="shop2" property="productName" />
    <jsp:getProperty name="shop2" property="introduction" />
    <jsp:getProperty name="shop2" property="price" />
    <jsp:getProperty name="shop2" property="storage" />
    <jsp:getProperty name="shop2" property="sales" />

    <%
        Homework work1 = new Homework();
        work1.setId(1);
        work1.setName("作业1");
    %>
    <p><%=work1.getId()%></p>
    <p><%=work1.getName()%></p>
    <jsp:useBean id="work2" class="com.study.jsp.dto.Homework" scope="page" />
    <jsp:setProperty name="work2" property="id" value="2" />
    <jsp:setProperty name="work2" property="name" value="作业2" />
    <jsp:getProperty name="work2" property="id" />
    <jsp:getProperty name="work2" property="name" />
</body>
</html>