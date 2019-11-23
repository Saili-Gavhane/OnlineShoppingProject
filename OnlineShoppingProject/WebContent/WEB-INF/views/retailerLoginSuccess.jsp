<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/text.css"  type="text/css">
</head>
<body>
<form action="/OnlineShoppingProject/Id" method="post">
    Retailer Id: <input type="text" name="id" value="${retailer.retailer_id}">
    <input class="button" type="submit" value="Add Product" />
</form>

<form  class="button"  action="updateProduct.jsp">
     
    <input type="submit" value="Update Product" />
</form>
<form  class="button" action="deleteProduct.jsp">
     
    <input type="submit" value="Delete Product" />
</form>

</body>
</html>