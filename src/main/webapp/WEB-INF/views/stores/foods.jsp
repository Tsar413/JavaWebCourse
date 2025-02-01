<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.study.jsp.entity.Food,com.study.jsp.controller.FoodController"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Foods</title>
</head>
<body>
<center>
<a href="books">书本区</a>  <a href="shopCart">购物车</a>
<%
    FoodController foodController = new FoodController();
    List<Food> list = foodController.getAllFoods();
    for(Food food : list){
%>
    <h3><%=food.getName()%></h3>
    <p>售价: ￥<%=food.getPrice()%></p>
    <form method="post" action="deals">
        数量: <input type="text" name="number">
        <input type="hidden" name="from" value="3">
        <input type="hidden" name="id" value=<%=food.getId()%>>
        <input type="hidden" name="name" value=<%=food.getName()%>>
        <input type="hidden" name="price" value=<%=food.getPrice()%>>
        <input type="submit" value="购买">
    </form>
    <hr>
<%
    }
%>
<!--
    <h3>书1</h3>
    <p>作者</p>
    <p>售价￥</p>
    <form method="post" action="deals">
        数量: <input type="text" name="number">
        <input type="hidden" name="name" value="书1">
        <input type="hidden" name="price" value="10">
        <input type="submit" value="购买">
    </form>
    <hr>
    <h3>书2</h3>
    <p>作者</p>
    <p>售价￥</p>
    <form method="post" action="deals">
        数量: <input type="text" name="number">
        <input type="hidden" name="name" value="书2">
        <input type="hidden" name="price" value="20">
        <input type="submit" value="购买">
    </form>
    -->
</center>
</body>
</html>