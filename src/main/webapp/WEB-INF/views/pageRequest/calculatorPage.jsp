<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator Page</title>
</head>
<body>
<%
        Random random = new Random();
        int answer = 0;
        int firstNum = random.nextInt(100);
        int secondNum = random.nextInt(100);
        if(secondNum == 0){
            secondNum = random.nextInt(100);
        }
        int ops = random.nextInt(4);
        out.print(firstNum);
        if(ops == 0){
            answer = firstNum + secondNum;
            out.print("+");
        }
        if(ops == 1){
            answer = firstNum - secondNum;
            out.print("-");
        }
        if(ops == 2){
            answer = firstNum * secondNum;
            out.print("*");
        }
        if(ops == 3){
            answer = firstNum / secondNum;
            out.print("/");
        }
        out.print(secondNum);
        out.print("=");
%>
<h1>请输入答案</h1>
<form id="info" name="info" method="get" action="judgePage">
    <input type="hidden" name="correctAnswer" value="<%=answer%>">
    <input type="text" name="userAnswer">
    <input type="submit" value="submit">
</form>
</body>
</html>