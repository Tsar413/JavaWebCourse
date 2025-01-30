<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaBean Trans Data1</title>
</head>
<body>
    <h1>Hello JavaBean Trans Data1</h1>
    <form method="post" action="javaBeanReceiveData5">
        <input type="text" name="id" placeHolder="作业编号">
        <input type="text" name="name" placeHolder="作业名">
        <input type="submit" value="提交">
    </form>
    <br />
    <form method="post" action="javaBeanReceiveData6">
        <input type="text" name="homeworkId" placeHolder="作业编号">
        <input type="text" name="homeworkName" placeHolder="作业名">
        <input type="submit" value="提交">
    </form>
</body>
</html>