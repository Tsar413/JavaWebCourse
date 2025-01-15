<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Request Page</title>
</head>
<body>
    <h1>Result Page</h1>
    <%
        String info1 = request.getParameter("info1");
    %>
    <h1>info1的结果是<%=info1%></h1>
    <h1>所有的name为</h1>
    <%
    Enumeration<String> parameterNames=request.getParameterNames();
    while(parameterNames.hasMoreElements()){
       out.print(parameterNames.nextElement());
       out.print("<br>");
    }
    %>
     <h1>info4的结果是</h1>
    <%
        String[] values1 = request.getParameterValues("info4");
        for(String s : values1){
            out.println(s);
        }
        out.print("<br>");
    %>
    <h1>获取全部的name和value</h1>
    <%
        Map<String, String[]> map = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : map.entrySet()){
            out.print(entry.getKey() + ":" + Arrays.toString(entry.getValue()) + " ");
        }
    %>
    <h1>当前请求的MINE类型</h1>
    <%=request.getContentType()%>
    <h1>客户端IP地址</h1>
    <%=request.getRemoteAddr()%>
    <h1>客户端端口号</h1>
    <%=request.getRemotePort()%>
    <h1>服务器主机名</h1>
    <%=request.getServerName()%>
    <h1>服务器端口号</h1>
    <%=request.getServerPort()%>
</body>
</html>