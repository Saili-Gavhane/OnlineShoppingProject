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
<td>Address Line 1</td><td><input class="input" type="text" name="address1"></td>

<td>Address Line 2</td><td><input class="input" type="text" name="address2"></td>
</tr>
<tr>
<td>City</td><td><input class="input" type="text" name="city"></td>

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
<td>Zip Code</td><td><input class="input" type="text" name="zipcode"></td>

<td>Country</td><td><select class="input" name="country">
<option value="India">India</option>
</select>
</td>
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