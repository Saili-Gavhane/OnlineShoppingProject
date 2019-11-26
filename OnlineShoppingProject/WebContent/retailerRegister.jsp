<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Retailer Sign Up Page</title>
<style>
 body {
 font-family: Arial, Helvetica, sans-serif;
  font-size: 15px;}  

           
 .input {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  border-radius: 5px;
}  


.button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;

  
}
.button:hover {
  opacity: 0.8;
 
}

.container {
  padding: 16px;
  background-color: white;
}
</style>

<script> 
          
            // Function to check Whether both passwords 
            // is same or not. 
            function checkPassword(form) { 
                password = form.password.value; 
                confirmpassword = form.confirmpassword .value; 
  
                // If password not entered 
                if (password == '') 
                    alert ("Please enter Password"); 
                      
                // If confirm password not entered 
                else if (password == '') 
                    alert ("Please enter confirm password"); 
                      
                // If Not same return False.     
                else if (password != confirmpassword) { 
                    alert ("\nPassword did not match: Please try again...") 
                    return false; 
                } 
                /*
                // If same return True. 
                else{ 
                    alert(Registered ") 
                    return true; 
                } 
                */
    
            } 
        </script> 
</head>
<body>
<form action="/OnlineShoppingProject/addRetailer" method="Post" onSubmit = "return checkPassword(this)" autocomplete="off">
<center><h2>Sign Up to Sell Products on ShopDrop</h2></center>
<table align="center">


<tr><td colspan="4"><b><h3>General Details</h3></b></td></tr>
<tr>
<td>Bussiness Name</td><td><input type="text" class="input" name="name" required></td>

<td>Email Id</td><td><input type="text" class="input" name="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>
</tr>

<tr>
<td>GST Number</td><td><input type="text"  class="input" name="GSTNo"  pattern="^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$"></td>

<td>Contact Number</td><td><input type="text" class="input" name="mobile_no" pattern="[7-9]{1}[0-9]{9}" maxlength="10"></td>
</tr>

<tr>
<td>PAN</td><td><input type="text" class="input" name="PAN_no" pattern="^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$ "></td>

<td>Aadhar Number</td><td><input type="text" class="input" name="aadhar_no" pattern="[0-9]{12}" maxlength="12"></td>
</tr>
<tr>
<td>Password</td><td><input type="password" class="input" name="password" required></td>

<td>Confirm Password</td><td><input  class="input" type="password" name="confirmpassword"></td>
</tr>


<tr colspan="4" rowspan="3"><td ></td></tr>


<tr><td colspan="4"><b><h3>Bank Details</h3></b></td></tr>
<tr>
<td>Account No.</td><td><input type="text" class="input" name="account_no"  pattern="[0-9]{12}" maxlength="12"></td>
<td>Account Holder's Name</td><td><input type="text" class="input" name="holder_name"></td>
</tr>
<tr>
<tr>
<td>Bank Name</td><td><input type="text" class="input" name="bank_name" required></td>
<td>IFSC Code</td><td><input type="text" class="input" name="code" required></td>
<tr>
<td >Branch</td><td><input type="text" class="input" name="branch" required></td>
<!-- </tr>

<td  colspan="4"><center><br>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</center></td>

<tr>
 -->
    
<tr>

<td colspan="4" align="center"><center><input class="button" type="submit" value="Proceed" ></center></td>

</tr>

<tr><td colspan="4" align="center"><p class="container">Already have an account? <a href="#">Sign In</a>.</p></td></tr>
</table>
</form>
</body>
</html>