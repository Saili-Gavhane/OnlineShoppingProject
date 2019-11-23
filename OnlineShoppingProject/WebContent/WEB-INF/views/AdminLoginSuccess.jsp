<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>E-mail</th>
            <th>Mobile</th>
            <th>GST_No</th>
            <th>PAN_No</th>
            <th>Aadhar_No</th>
            <th>Approval Status</th>
           
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
            <td>
                
                <a href="/OnlineShoppingProject/activateRetailer?id=${Retailer.retailer_id}&status=Active">Active</a>
            </td>
            <td>
                
                <a href="/OnlineShoppingProject/activateRetailer?id=${Retailer.retailer_id}&status=Deactive">Deactive</a>
            </td>
        </tr>
        </c:forEach>
    </table>
    ${retailer.retailer_name} }

</body>
</html>