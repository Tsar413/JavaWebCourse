<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Message Board</title>
</head>
<body>
    <h1>Message Board</h1>
    <%
        Object data = session.getAttribute("data");
        out.print((String) data);
    %>
    <form id="info" name="info" method="get" action="dataTransfer">
        <input type="hidden" name="deleteData" value=<%=data%>>
        <input type="submit" value="submit">
    </form>
    <%
        Object userObject = session.getAttribute("username");
        if(userObject == null){
            session.removeAttribute("username");
            response.sendRedirect("serverInteraction");
        }
        String username = (String) userObject;
    %>
    <h1>欢迎用户 <%=username%></h1>
    <form id="info" name="info" method="get" action="logout">
        <input type="hidden" name="deleteUsername" value=<%=username%>>
        <input type="submit" value="登出">
    </form>

    <%
        List<String> messageList = (List<String>) application.getAttribute("messageList");
        if(messageList != null){
            for(String message : messageList){
                String[] details = message.split(";");
    %>
        <h3>作者 <%=details[0]%></h3>
        <h3>标题 <%=details[1]%></h3>
        <p>内容 <%=details[2]%></p>
        <h5>时间 <%=details[3]%></h5>
    <%
            }
        }

    %>
    <form id="info" name="info" method="get" action="writeMessage">
        用户名<input type="text" name="username" value=<%=username%>></br>
        标题<input type="text" name="title"></br>
        正文<textarea name="context" row="4" column="30"></textarea></br>
        <input type="submit" value="提交">
    </form>
</body>
</html>