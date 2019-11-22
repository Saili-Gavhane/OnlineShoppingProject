<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <link href="<c:url value="/resources/css/text.css" />" rel="stylesheet"  type="text/css" />
<meta charset="ISO-8859-1">
<title>Retailer Sign In Page</title>
</head>
<body>
<form action="/OnlineShoppingProject/RetailerLogin" method="Post" autocomplete="off">
<center><h2>Retailer Login </h2></center>
<table align="center">
<tr>
<td>Email Id</td><td><input class="input" placeholder="Email"  type="text" name="username"></td>
</tr>
<tr>
<td>Password</td><td><input class="input"   placeholder="Password" type="password" name="password"></td>
</tr>
<tr>
<td colspan="2" align="center"><input class="button" type="submit" value="Sign In"></td>
</tr>

<tr>
<td colspan="2" align="center"><a href="">Forgot Password?</a></td>
</tr>
</table>
</form>
</body>
</html>