<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Get Information</title>
</head>
<body>
    <h1>Get Information Homework</h1>
    <%
        Map<String, String[]> map = request.getParameterMap();
        for(Map.Entry<String, String[]> entry : map.entrySet()){
            out.print(entry.getKey() + ":" + Arrays.toString(entry.getValue()) + " ");
        }
    %>
</body>
</html>