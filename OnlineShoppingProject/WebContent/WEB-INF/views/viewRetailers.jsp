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
            <th>Retailer Id</th>
            <th>Retailer Name</th>
            <th>E-mail</th>
            <th>Contact No</th>
            <th>GST No</th>
            <th>PAN </th>
            <th>Aadhar No</th>
            <th colspan="3">Approval Status</th>
	    <th>Remark</th>
           
        </tr>
        <c:forEach items="${listRetailer}" var="Retailer">
        <tr>

            <td>${Retailer.retailer_id}</td>
            <td>${Retailer.retailer_name}</td>
            <td>${Retailer.retailer_email}</td>
            <td>${Retailer.retailer_mobileno}</td>
            <td>${Retailer.gst_no}</td>
            <td>${Retailer.pan_no}</td>
            <td>${Retailer.aadhar_no}</td>
            <td>${Retailer.approval_status}</td>
	    <td>${Retailer.remark}</td>

        </tr>
        </c:forEach>
    </table>
   

</body>
</html>