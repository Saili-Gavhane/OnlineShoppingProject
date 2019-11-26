<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/text.css"  type="text/css">
<meta charset="ISO-8859-1">
<title>Admin Sign In </title>
</head>
<body>
<form action="/OnlineShoppingProject/AdminLogin" method="Post" autocomplete="off">
<center><h1>Admin Login</h1></center>
<table align="center">
<tr>
<td>Email Id</td><td><input class="input" type="text" name="username" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>
</tr>
<tr>
<td>Password</td><td><input class="input" type="password" name="password" required></td>
</tr>
<tr>
<td colspan ="2" align="center"><input type="submit" class="button"  value="Sign In"></td>
</tr>

</table>
</form>
</body>
</html>