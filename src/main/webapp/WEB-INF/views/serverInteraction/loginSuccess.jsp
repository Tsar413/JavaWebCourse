<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Success</title>
</head>
<body>
    <h1>Login Success Page</h1>
    <%
        String username = request.getParameter("username");
    %>
    <h1>欢迎用户<%=username%></h1>
</body>
</html>