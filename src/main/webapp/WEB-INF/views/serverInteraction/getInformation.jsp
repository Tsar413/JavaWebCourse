<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.study.jsp.utils.JDBCImpl" %>
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
        JDBCImpl impl = new JDBCImpl();
        String usernameCheck = impl.checkLogin(username, password);
        if(usernameCheck.equals("1")){
            session.setAttribute("username", username);
            response.sendRedirect("loginSuccess?username=" + username);
        } else {
            response.sendRedirect("loginFail");
        }
    %>

</body>
</html>