<%@ page import="java.util.List" %>
<%@ page import="com.example.exam_client.Employee" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2022
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Employee p = (Employee) request.getAttribute("d");
%>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<style>
    .imgupload {
        width: 200px;
    }
    .imgupload_hide {
        display: none;
    }
</style>

<body>

<div class="w3-container w3-blue">
    <h2>luong</h2>
</div>

<form class="w3-container" action="/edit" method="post" name="From_Create">
    <input class="w3-input" type="hidden" name="Id" value="<%=p.getId()%>"></p>
    <p>
        <label>Tên</label>
        <input class="w3-input" type="text" name="Name" value="<%=p.getName()%>"></p>
    <p>
    <p>
        <label>Giá </label>
        <input class="w3-input" type="text" name="Price" value="<%=p.getSalary()%>"></p>
    <p>
    <p>
<button class="w3-button w3-light-green" type="submit">Thêm</button></p>
</form>
</div>

</body>
</html>
