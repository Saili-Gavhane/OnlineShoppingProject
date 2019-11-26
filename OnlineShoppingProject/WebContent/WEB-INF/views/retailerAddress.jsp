<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="r" %>%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Retailer Sign Up Page</title>
</head>
<body>
<form action="/OnlineShoppingProject/addRetailerAddress" method="POST" autocomplete="off">
<center><h2>Retailer Address</h2></center>
<table align="center">


<tr><td colspan="4"><b><h3>Address Details</h3></b></td></tr>



<td>Address Line 1</td><td><input class="input" type="text" name="address1" required></td>

<td>Address Line 2</td><td><input class="input" type="text" name="address2" required></td>
</tr>
<tr>
<td>City</td><td><input class="input" type="text" name="city" required></td>

<td>State</td><td><select  class="input" name="state">

<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
<option value="Daman and Diu">Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Orissa">Orissa</option>
<option value="Pondicherry">Pondicherry</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Tripura">Tripura</option>
<option value="Uttaranchal">Uttaranchal</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="West Bengal">West Bengal</option>
</select>
</td>
</tr>
<tr>
<td>Zip Code</td><td><input class="input" type="text" name="zipcode" pattern="[1-9]{1}[0-9]{5}" maxlength="6"></td>

<td>Country</td><td><select class="input" name="country">
<option value="India">India</option>

</select>
</td>
<td>Retailer Id <input type="text" name="id" value="${retailer.retailer_id}"></td>



    
<tr>

<td colspan="4" align="center"><center><input class="button" type="submit" value="Sign Up" ></center></td>

</tr>


</table>
</form>
</body>
</html>