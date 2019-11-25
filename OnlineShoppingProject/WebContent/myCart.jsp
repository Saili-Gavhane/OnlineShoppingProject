<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Cart</title>
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
button{
    font-family: arial;
}


        </style>
</head>
<body>

 <table cellpadding="5">
                    <tr>
                        <th>Product Id</th>
                        <th>Product Name</th>
                        <th>Quantity</th>
                        <th>Total Price</th>
                        <th colspan="3">Actions</th>
                    
                       
                    </tr>
                    <c:forEach items="${listRetailer}" var="Retailer">
                    <tr>
            
                        <td>${for prod id}</td>
                        <td>${for prod id name}</td>
                        <td><input type="number">${for prod quantity}</input></td>
                        <td>${for prod total price}</td>
                        <td>
                        <button ><a href="link to remove">Remove</a></button>
                        </td>
                        
                        <td>
                    <button ><a href="link to update">Update</a></button>
                        </td>
                        <td>
                     <button><a href="link to place order">Buy</a></button>
                        </td>
                    
            
                    </tr>
                    </c:forEach>
                    
                </table>
                <button>Back to Shopping</button>

    </body>

</body>
</html>