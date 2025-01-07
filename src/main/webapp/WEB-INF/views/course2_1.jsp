<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--@ page language="java" contentType="application/msword; charset=UTF-8" pageEncoding="UTF-8" --%>
<%@ page import="com.study.jsp.utils.FunctionsForJSP"  %>
<%@ page import="com.study.jsp.utils.GetSubStringFunction"  %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Course2_1</title>
</head>
<body>
    <h1>Import Packages</h1>
    <%!
        FunctionsForJSP functions = new FunctionsForJSP();
        GetSubStringFunction subStrings = new GetSubStringFunction();
    %>
    <%
        functions.getMul();
    %>
    <h1>求和结果是<%=functions.sum(1,2)%></h1>
    <h1>获取字串的结果是<%=subStrings.getSubStringFunction("sqwq")%></h1>

    <%@include file="course2_2.html"%>
    <%@include file="course2_3.jsp"%>
    <%@include file="course2_4.txt"%>
</body>
</html>