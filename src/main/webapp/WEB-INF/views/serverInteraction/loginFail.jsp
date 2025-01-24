<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Fail Page</title>
</head>
<body>
    <h1>Login Fail Page. Please login again in 5 seconds</h1>
    <%
        response.setHeader("refresh","5;url=serverInteraction");
    %>
    <a href="serverInteraction">重新登录</a>
</body>
</html>