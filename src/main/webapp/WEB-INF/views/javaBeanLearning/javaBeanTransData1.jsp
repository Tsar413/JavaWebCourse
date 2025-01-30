<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Trans Data1</title>
</head>
<body>
    <h1>Hello JavaBean Trans Data1</h1>
    <form method="post" action="javaBeanReceiveData1">
        <input type="text" name="username" placeHolder="用户名">
        <input type="text" name="userPassword" placeHolder="密码">
        <input type="text" name="sex" placeHolder="性别">
        <input type="text" name="age" placeHolder="年龄">
        <input type="text" name="address" placeHolder="地址">
        <input type="submit" value="提交">
    </form>

    <br />
    <form method="post" action="javaBeanReceiveData2">
        <input type="text" name="username" placeHolder="用户名">
        <input type="text" name="psw" placeHolder="密码">
        <input type="text" name="gender" placeHolder="性别">
        <input type="text" name="birth" placeHolder="年龄">
        <input type="text" name="address" placeHolder="地址">
        <input type="submit" value="提交">
    </form>
</body>
</html>