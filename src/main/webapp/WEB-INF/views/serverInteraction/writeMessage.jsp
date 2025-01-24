<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Write Message</title>
</head>
<body>
    <%
        // 第一步获取页面传递的内容
        String username = request.getParameter("username");
        String title = request.getParameter("title");
        String context = request.getParameter("context");
        Date date = new Date();
        String message = username + ";" + title + ";" + context + ";" + date.toString();
        // 第二步获取application中存储的内容，如果作为存储的List不存在，则新建
        List<String> list = (List<String>) application.getAttribute("messageList");
        if(list == null){
            list = new LinkedList<String>();
        }
        // 第三步存储新的信息
        list.add(message);
        // 第四步删除超出10条的信息
        if(list.size() > 10){
            list.remove(0);
        }
        // 第五步把List存储回application，直接覆盖
        application.setAttribute("messageList", list);
        response.sendRedirect("messageBoard");
    %>
</body>
</html>