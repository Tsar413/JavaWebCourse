<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Receive Data1</title>
</head>
<body>
    <h1>Hello JavaBean Receive Data1</h1>
    <jsp:useBean id="shop" class="com.study.jsp.dto.Shop" />
    <jsp:setProperty name="shop" property="*" />
    <jsp:getProperty name="shop" property="productName" />
    <jsp:getProperty name="shop" property="introduction" />
    <jsp:getProperty name="shop" property="price" />
    <jsp:getProperty name="shop" property="storage" />
    <jsp:getProperty name="shop" property="sales" />

</body>
</html>