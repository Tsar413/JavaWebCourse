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
        Map<Integer, String[]> map = new HashMap<Integer, String[]>();
        map.put(1, new String[]{"a","123"});
        map.put(2, new String[]{"b","123"});
        String username = request.getParameter("userid");
        String password = request.getParameter("psw");
        boolean flag = false;
        for (String[] user : map.values()){
            if(user[0].equals(username) && user[1].equals(password)){
                flag = true;
            }
        }
        if(flag){
            response.sendRedirect("loginSuccess?username=" + username);
        } else {
            response.sendRedirect("loginFail");
        }
    %>
</body>
</html>