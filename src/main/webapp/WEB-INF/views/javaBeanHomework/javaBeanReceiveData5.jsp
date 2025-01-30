<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Receive Data1</title>
</head>
<body>
    <h1>Hello JavaBean Receive Data1</h1>
    <jsp:useBean id="work1" class="com.study.jsp.dto.Homework" />
    <jsp:setProperty name="work1" property="*" />
    <jsp:getProperty name="work1" property="id" />
    <jsp:getProperty name="work1" property="name" />

</body>
</html>