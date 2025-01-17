<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Incorrect Page</title>
</head>
<body>
    <h1>Incorrect Page</h1>
    <%
        String answer = request.getParameter("answer");
    %>
    <h1>正确的结果是<%=answer%></h1>
    <a href="calculatorPage">继续答题</a>
</body>
</html>