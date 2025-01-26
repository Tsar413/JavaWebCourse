<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.study.jsp.utils.JDBCUsing"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index</title>
</head>
<body>
    <h1>Hello JSP</h1>
    <%
        JDBCUsing jdbcUsing = new JDBCUsing();
        out.println(jdbcUsing.queryTest());
        out.println(jdbcUsing.queryTest2("a", "123456"));
    %>
</body>
</html>