<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,java.text.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Refresh</title>
</head>
<body>
    <h1>Refresh Page</h1>
    <%
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        out.print(format.format(date));
        response.setHeader("Refresh","5");
    %>
</body>
</html>