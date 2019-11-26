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
}

body{
font-family: arial;
}

</style>
</head>
<body>

<table cellpadding="5">
        <tr>
            <th>User Id</th>
            <th>User Name</th>
            <th>E-mail</th>
            <th>Contact No</th>           
        </tr>
        <tr><td>${user.user_id}</td>
            <td>${user.first_name}</td>
            <td>${user.last_name}</td>
            <td>${user.user_email}</td>
            <td>${user.mobileno}</td>

        </tr>
       
    </table>
   <a href="/OnlineShoppingProject/userRedirect?id=${user.user_id}">Go to Homepage</a>

</body>
</html>