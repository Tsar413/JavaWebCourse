<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.study.jsp.utils.JDBCImpl,com.study.jsp.entity.User" %>
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
    <%
        JDBCImpl impl = new JDBCImpl();
        List<User> list = impl.getPersonInformation(username);
        out.print("登录次数: " + list.get(0).getTimes() + " 上次登录时间: " + list.get(0).getTime());
    %>
</body>
</html>