<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Data Transfer</title>
</head>
<body>
    <h1>Data Transfer</h1>
    <%
        String data = request.getParameter("dataTransfer");
        out.print(data);
        session.setAttribute("data", data);
        String deleteData = request.getParameter("deleteData");
        if(deleteData != null){
            session.removeAttribute("data");
        }
    %>
</body>
</html>