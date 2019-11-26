<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
text-align: center;  
}

body{
font-family: arial;
}
button{
    font-family: arial;
}


        </style>
</head>
<body><center>
<h3>My Cart</h3>
	<table cellpadding="2" cellspacing="2" >
		<tr>
		
			
			<th>Name</th>
	
			<th>Price</th>
			<th>Quantity</th>
			<th>Total Price</th>
			<th >Actions</th>
		</tr>
		<c:set var="total" value="0"></c:set>
		<c:forEach var="item" items="${sessionScope.cart }">
			<c:set var="total"
				value="${total + item.product.product_base_price * item.quantity }"></c:set>
			<tr>
		
				<td>${item.product.product_name }</td>
				<td>${item.product.product_base_price }</td>
				
				
				<td>${item.quantity }</td>
				<td>${item.product.product_base_price * item.quantity }</td>
				<td><a href="/OnlineShoppingProject/removeFromCart?id=${item.product.product_id }"><button>Remove</button></a></td>
				
			
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4" align="right">Cart Total</td>
			<td>${total}</td>
		</tr>
	</table>
	<br>
	<a href="/OnlineShoppingProject/placeOrder?total=${total}"><button>Place Order</button></a> 
	<a href="/OnlineShoppingProject/viewProductCart"><button>Continue
		Shopping</button></a>
		
		</center>
</body>
</html>