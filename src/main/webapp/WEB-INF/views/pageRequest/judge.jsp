<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Judge Page</title>
</head>
<body>
    <h1>Judge Page</h1>
    <%
        String correctAnswer = request.getParameter("correctAnswer");
        String userAnswer = request.getParameter("userAnswer");
        if(correctAnswer.equals(userAnswer)){
            response.sendRedirect("correctPage");
        } else {
            response.sendRedirect("incorrectPage?answer=" + correctAnswer);
        }
    %>
    <h1>正确答案是<%=correctAnswer%></h1>
    <h1>用户的答案是<%=userAnswer%></h1>
</body>
</html>