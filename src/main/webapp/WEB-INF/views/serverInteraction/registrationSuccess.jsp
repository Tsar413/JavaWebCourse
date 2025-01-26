<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Fail Page</title>
</head>
<body>
    <h1>注册成功，请返回登录</h1>
    <%
        response.setHeader("refresh","5;url=serverInteraction");
    %>
</body>
</html>