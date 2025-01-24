<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Fail Page</title>
</head>
<body>
    <h1>Login Out Page</h1>
    <%
        String deleteUsername = request.getParameter("deleteUsername");
        if(deleteUsername != null){
            session.removeAttribute("username");
        }
        response.sendRedirect("serverInteraction");
    %>
</body>
</html>