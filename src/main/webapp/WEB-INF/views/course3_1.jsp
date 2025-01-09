<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String stu = request.getParameter("stu");
    out.println("Student name is " + stu);

    String age = request.getParameter("age");
    out.println("Student age is " + age);
%>