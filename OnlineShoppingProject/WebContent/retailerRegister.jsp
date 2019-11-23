<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/text.css"  type="text/css">
<meta charset="ISO-8859-1">
<title>Retailer Sign Up Page</title>
</head>
<body>
<form action="/OnlineShoppingProject/addRetailer" method="Post" autocomplete="on">
<center><h2>Sign Up to Sell Products on ShopDrop</h2></center>
<table align="center">


<tr><td colspan="4"><b><h3>General Details</h3></b></td></tr>
<tr>
<td>Bussiness Name</td><td><input type="text" class="input" name="name"></td>

<td>Email Id</td><td><input type="text" class="input" name="email"></td>
</tr>

<tr>
<td>GST Number</td><td><input type="text"  class="input" name="GSTNo"></td>

<td>Contact Number</td><td><input type="text" class="input" name="mobile_no"></td>
</tr>

<tr>
<td>PAN</td><td><input type="text" class="input" name="PAN_no"></td>

<td>Aadhar Number</td><td><input type="text" class="input" name="aadhar_no"></td>
</tr>
<tr>
<td>Password</td><td><input type="password" class="input" name="password"></td>

<td>Confirm Password</td><td><input  class="input" type="password" name="confirm_password"></td>
</tr>


<tr colspan="4" rowspan="3"><td ></td></tr>


<tr><td colspan="4"><b><h3>Bank Details</h3></b></td></tr>
<tr>
<td>Account No.</td><td><input type="text" class="input" name="account_no"></td>
<td>Account Holder's Name</td><td><input type="text" class="input" name="holder_name"></td>
</tr>
<tr>
<tr>
<td>Bank Name</td><td><input type="text" class="input" name="bank_name"></td>
<td>IFSC Code</td><td><input type="text" class="input" name="code"></td>
<tr>
<td >Branch</td><td><input type="text" class="input" name="branch"></td>
</tr>

<td  colspan="4"><center><br>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</center></td>

<tr>
    
<tr>

<td colspan="4" align="center"><center><input class="button" type="submit" value="Sign Up" ></center></td>

</tr>

<tr><td colspan="4" align="center"><p class="container">Already have an account? <a href="#">Sign In</a>.</p></td></tr>
</table>
</form>
</body>
</html>