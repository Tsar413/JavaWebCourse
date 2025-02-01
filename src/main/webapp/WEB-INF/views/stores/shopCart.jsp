<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.study.jsp.entity.ShopCart,com.study.jsp.controller.ShopCartController"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shop Cart</title>
</head>
<body>
<center>
<a href="books">书本区</a>  <a href="foods">食品区</a>
    <h1>Hello Shop Cart</h1>
    <table border = "1">
    <tr>
        <th style = "display:none">商品ID</th>
        <th style = "display:none">来自</th>
        <th>商品名</th>
        <th>单价</th>
        <th>数量</th>
        <th>小计</th>
        <th>操作</th>
    </tr>
    <%
        ShopCartController shopCart = new ShopCartController();
        List<ShopCart> list = shopCart.getAllProducts();
        // out.print(list);
        double sum = 0.0;
        for(ShopCart cart : list){
        sum += cart.getGoodPrice() * cart.getGoodCount();
    %>
        <tr>
        <form method="post" action="deals">
            <td style = "display:none"><input type="text" name="id" value=<%=cart.getGoodId()%>></td>
            <td style = "display:none"><input type="text" name="from" value="2"></td>
            <td><input type="text" name="name" readonly value=<%=cart.getGoodName()%>></td>
            <td><input type="text" name="price" readonly value=<%=cart.getGoodPrice()%>></td>
            <td><input type="text" name="number" value=<%=cart.getGoodCount()%>></td>
            <td><%=cart.getGoodPrice() * cart.getGoodCount()%></td>
            <td><input type="submit" value="修改"></td>
        </form>
        </tr>

    <%
        }
    %>
    </table>
    <h3>商品总和为: <%=sum%></h3>
</center>
</body>
</html>