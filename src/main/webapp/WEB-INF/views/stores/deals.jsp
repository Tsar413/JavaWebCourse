<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.study.jsp.entity.ShopCart,com.study.jsp.controller.DealsController"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Deals</title>
</head>
<body>
    <h1>Hello JSP</h1>
    <%
        String id = request.getParameter("id");
        String from = request.getParameter("from");
        String name = request.getParameter("name");
        String number = request.getParameter("number");
        String price = request.getParameter("price");
        out.print(id);
        out.print(from);
        out.print(name);
        out.print(number);
        out.print(price);
        DealsController deals = new DealsController();
        Integer num = 0;
        if(from.equals("1")){
             num = deals.addNewProducts(id, name, Double.parseDouble(price), Integer.parseInt(number));
             response.sendRedirect("books");
        } else if(from.equals("2")){
             num = deals.changeProducts(id, name, Integer.parseInt(number));
             response.sendRedirect("shopCart");
        } else {
            num = deals.addNewProducts(id, name, Double.parseDouble(price), Integer.parseInt(number));
            response.sendRedirect("foods");
        }

    %>
</body>
</html>