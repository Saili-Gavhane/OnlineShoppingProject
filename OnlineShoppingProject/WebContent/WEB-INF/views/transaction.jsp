<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<form action="http://192.168.101.87:9096/Apna_Bank_Project/transaction" method="POST">
	<body>
		Card No
		<input type="number" name="cardNo" value="5555555555555">
		<br> CVV
		<input type="number" name="cvv" value="123">
		<br> 
		Issue Date<input type="date" name="issueDate" value="22-02-97">
		<br> CVV
		Expiry Date<input type="date" name="expiryDate" value="22-02-98">
		<br> 
		Payee No<input type="number" name="recipentAccountNo" value="1000041">
		<br> 
		Amount<input type="text" name="amount" value="${amount}" readonly>
		<br>
		<input type="submit" value="ok">
</form>
</body>
</html>