<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Trans Data1</title>
</head>
<body>
    <h1>Hello JavaBean Trans Data1</h1>
    <form method="post" action="javaBeanReceiveData3">
        <input type="text" name="productName" placeHolder="商品名">
        <input type="text" name="introduction" placeHolder="介绍">
        <input type="text" name="price" placeHolder="价格">
        <input type="text" name="storage" placeHolder="库存">
        <input type="text" name="sales" placeHolder="销量">
        <input type="submit" value="提交">
    </form>

    <br />
    <form method="post" action="javaBeanReceiveData4">
        <input type="text" name="name" placeHolder="商品名">
        <input type="text" name="intro" placeHolder="介绍">
        <input type="text" name="unitPrice" placeHolder="价格">
        <input type="text" name="stock" placeHolder="库存">
        <input type="text" name="sales" placeHolder="销量">
        <input type="submit" value="提交">
    </form>
</body>
</html>