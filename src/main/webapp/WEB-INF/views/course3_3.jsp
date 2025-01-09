<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<h1>Jump to Page</h1>
<%
    String classId = request.getParameter("classId");
    out.println("班级号是" + classId);
%>
