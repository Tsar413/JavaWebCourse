<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.study.jsp.utils.JDBCImpl,com.study.jsp.entity.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Person Information</title>
</head>
<body>
    <h1>Show Person Information</h1>
    <%
        // 分页参数
        int pageSize = 5;
        int id = 1; // 当前页
        int pageNumber = 1; // 页码
        int rowCount = 0;
        int pageCount = 0;
        JDBCImpl impl = new JDBCImpl();
        if(request.getParameter("id") != null){
            try{
                id = Integer.parseInt(request.getParameter("id"));
            } catch (Exception e){
                id = 1;
            }
        }
        rowCount = impl.getMaxNumber(); // 获取数据总数
        if(rowCount % pageSize == 0){ // 获取页码最大值
            pageCount = rowCount / pageSize;
        } else {
            pageCount = rowCount / pageSize + 1;
        }
        pageNumber = id; // 获取页码
        if(pageNumber > pageCount){ // 边界处理
            pageNumber = pageCount;
        }
        if(pageNumber < 1){
            pageNumber = 1;
        }
        List<User> list = impl.getLimitPersonInformation((pageNumber - 1) * pageSize);
    %>
    <center>
        <table>
            <tr>
                <td>用户名</td>
                <td>邮箱</td>
                <td>介绍</td>
                <td>擅长语言</td>
                <td>登录次数</td>
                <td>上次登录时间</td>
            </tr>
            <%
                for(User user : list){
                    out.print("<tr>");
                    out.print("<td>" + user.getUsername() + "</td>");
                    out.print("<td>" + user.getEmail() + "</td>");
                    out.print("<td>" + user.getIntro() + "</td>");
                    out.print("<td>" + user.getLan() + "</td>");
                    out.print("<td>" + user.getTimes() + "</td>");
                    out.print("<td>" + user.getTime() + "</td>");
                    out.print("</tr>");
                }
            %>
        </table>
        <%if(id == 1){%>
        首页
        上一页
        <%} else {%>
        <a href = "showPersonInformation?id=<%=1%>">首页</a>
        <a href = "showPersonInformation?id=<%=(id-1)%>">上一页</a>
        <%
        }
        if(id >= pageCount){
        %>
        下一页
        尾页
        <%} else {%>
        <a href = "showPersonInformation?id=<%=(id+1)%>">下一页</a>
        <a href = "showPersonInformation?id=<%=pageCount%>">尾页</a>
        <%}%>
    </center>
</body>
</html>