<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Receive Data2</title>
</head>
<body>
    <h1>Hello JavaBean Receive Data2</h1>
    <jsp:useBean id="user" class="com.study.jsp.dto.User" />
    <jsp:setProperty name="user" property="username" param="username" />
    <jsp:setProperty name="user" property="userPassword" param="psw" />
    <jsp:setProperty name="user" property="sex" param="gender" />
    <jsp:setProperty name="user" property="age" param="birth" />
    <jsp:setProperty name="user" property="address" param="address" />

    <jsp:getProperty name="user" property="username" />
    <jsp:getProperty name="user" property="userPassword" />
    <jsp:getProperty name="user" property="sex" />
    <jsp:getProperty name="user" property="age" />
    <jsp:getProperty name="user" property="address" />

</body>
</html>