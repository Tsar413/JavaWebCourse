<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Receive Data1</title>
</head>
<body>
    <h1>Hello JavaBean Receive Data1</h1>
    <jsp:useBean id="user" class="com.study.jsp.dto.User" />
    <jsp:setProperty name="user" property="*" />
    <jsp:getProperty name="user" property="username" />
    <jsp:getProperty name="user" property="userPassword" />
    <jsp:getProperty name="user" property="sex" />
    <jsp:getProperty name="user" property="age" />
    <jsp:getProperty name="user" property="address" />

</body>
</html>