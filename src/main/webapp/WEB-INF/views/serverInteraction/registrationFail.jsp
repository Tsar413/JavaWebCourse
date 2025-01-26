<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Fail Page</title>
</head>
<body>
    <h1>用户名重复，请更换用户名</h1>
    <%
        response.setHeader("refresh","5;url=serverInteraction");
    %>
</body>
</html>