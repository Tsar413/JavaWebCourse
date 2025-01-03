<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- %@ page import="com.study.jsp.utils.TestUtils" % -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Course1</title>
</head>
<body>
    <!-- 声明 -->
    <%!
        public static final String INFO = "测试1！";

        public int sum(int a, int b){
            return a + b;
        }
    %>
    <%
        out.println("<h1>" + INFO + "</h1>");
        out.println("<h1> 1 + 2 = " + sum(1,2) + "</h1>");
    %>
    <!-- 代码段 -->
    <%
        String info2 = "测试2！";

        int num2 = 20;

        out.println("<h1> info2 = " + info2 + "</h1>");
        out.println("<h1> nun2 = " + num2 + "</h1>");
    %>
    <!-- 表达式 -->
    <h1> info = <%=INFO%> </h1>
    <h1> info1 = <%=3+2%> </h1>
    <!-- 课堂练习1 -->
    <%
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                out.print("<p>" + i + " * " + j + " = " + i * j + " </p>");
            }
            out.print("</br>");
        }
    %>
    <!-- 作业 -->
    <%!
        public int getSum(int a, int b){
            return a + b;
        }

        public int getDiff(int a, int b){
            return a - b;
        }

        public int getProduct(int a, int b){
            return a * b;
        }

        public String getQuotient(int a, int b){
            if(b == 0){
                return "除数不能为0";
            }
            return String.valueOf(a / b);
        }
    %>
    <%
    out.println("<h1> sum 调用" + getSum(2,1) + "</h1>");
    out.println("<h1> diff 调用" + getDiff(2,1) + "</h1>");
    %>
    <h1>product 调用 <%=getProduct(2,3)%></h1>
    <h1>quotient 调用 <%=getQuotient(10,0)%></h1>
    <h1>quotient 调用 <%=getQuotient(10,2)%></h1>
</body>
</html>