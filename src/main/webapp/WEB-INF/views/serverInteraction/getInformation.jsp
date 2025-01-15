<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Get Information</title>
</head>
<body>
    <h1>Get Information</h1>
    <%
        String username = request.getParameter("userid");
        String password = request.getParameter("psw");
    %>
    <h1>用户名为<%=username%></h1>
    <h1>密码为<%=password%></h1>
    <h1>Get Names</h1>
    <%
        Enumeration<String> enum1 = request.getParameterNames();
        while(enum1.hasMoreElements()){
           out.print(enum1.nextElement() + " ");
        }
    %>
    </br>
    <h1>Get Values</h1>
    <%
        String[] values = request.getParameterValues("userid");
        for(String v : values){
            out.println(v + " ");
        }
    %>
    </br>
    <h1>Get Names and Values</h1>
    <%
        Map<String, String[]> map = request.getParameterMap();
        for(Map.Entry<String, String[]> entry : map.entrySet()){
            out.print(entry.getKey() + ":" + Arrays.toString(entry.getValue()) + " ");
        }
    %>
</body>
</html>