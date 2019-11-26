<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table{
  border-collapse: collapse;
}

th{
text-align: Center;
padding: 8px;
border-bottom: 1px solid #ddd;
color: white;
background-color: #4CAF50;
}

td{
text-align: left;  
padding: 8px;
border-bottom: 1px solid #ddd;
}



th{
background-color: #4CAF50;
color: white;
}

body{
font-family: arial;
}

</style>
</head>
<body>
<center>

<form  action="/OnlineShoppingProject/payment">
<table >
<th colspan="2" >Order Details</th>
<tr><td><b>Order Id</b></td><td>${order.order_id}</td></tr>
<tr><td><b>Order Ship Name</b></td><td>${order.user2.first_name}</td></tr>
<tr><td><b> Address Line 1</b></td><td>${order.useraddress.addressline_1}</td></tr>
<tr><td><b>Address Line 2</b></td><td>${order.useraddress.addressline_2}</td></tr>
<tr><td><b>State</b></td><td>${order.useraddress.state}</td></tr>
<tr><td><b>City</b></td><td>${order.useraddress.city}</td></tr>
<tr><td><b>Country</b></td><td>${order.useraddress.country}</td></tr>
<tr><td><b>Zip Code</b></td><td>${order.useraddress.zipcode}</td></tr>
<tr><td><b>Placed On</b></td><td>${order.order_date}</td></tr>
<tr><td><b>Delivery Charges</b></td><td>${order.delivery_charges}</td></tr>
<tr><td><b>Order Tracking Number</b></td><td>${order.order_tracking_no}</td></tr>
<tr><td><b>Order Status</b></td><td>${order.order_status}</td></tr>
<tr><td><b>Delivery Date</b></td><td>${order.order_delivery_date}</td></tr>
<tr><td><b>Order Amount</b></td><td>${order.order_amount}</td></tr>
<tr><td><b>Remarks</b></td><td>${order.remark}</td></tr>
<input type="hidden" name="amount" value="${order.order_amount}">
</table>

<input type="submit" value="Procced to Pay">
</form>
</center>
</body>
</html>