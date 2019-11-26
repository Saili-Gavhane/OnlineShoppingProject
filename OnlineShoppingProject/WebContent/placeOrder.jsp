<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/OnlineShoppingProject/addOrder" method="Post" autocomplete="on">
<center><h2>Orders</h2></center>
<table align="center">

<td>OrderShip Name</td><td><input type="text" class="input" name="name"></td>

<tr>
<td>Delivery Charges</td><td><input type="text" class="input" name="name" placeholder="50" readonly></td>
</tr>

<tr>
<td><input type="submit" class="input" name="submit" value="Place Order" readonly></td>
</tr>

</body>
</html>