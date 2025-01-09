<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.study.jsp.utils.FunctionsForCourse3"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Course3</title>
</head>
<body>
    <h1>Hello Course3</h1>
    <%!
        FunctionsForCourse3 functions = new FunctionsForCourse3();
        String result = functions.largestGoodInteger("2222333339990");
    %>
    <%
        out.println(functions.largestGoodInteger("2222333339990"));
    %>
    <h1>23344777的结果是<%=functions.largestGoodInteger("23344777")%></h1>
    <jsp:include page="course3_1.jsp">
        <jsp:param name="stu" value="Tom"/>
        <jsp:param name="age" value="18"/>
    </jsp:include>
    <br/>
    <jsp:include page="resultPage.jsp">
        <jsp:param name="result" value="123456"/>
    </jsp:include>
</body>
</html>