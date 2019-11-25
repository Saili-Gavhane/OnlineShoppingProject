<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" type="text/css" href="css/stylelogin.css">
<style>

body {font-family: Arial;
    position:center;}
    	
    	* {
 			 box-sizing: border-box;
			}
    
    	error_form{
    		color:red;
    	}
    	
    	
      form {border: 3px solid #f1f1f1;}
    
      #myform{    
            margin-top: 5%;
            margin-left: 40%;
      }

      #detail{
        line-height: 25px;
      }
      .open-button {  
        color: white;
          cursor: pointer;
        }
        
      .form-popup {
          position: center;
        }
      
      .form-container {
        max-width: 300px;
        padding: 10px; 
      }

      .form-container input[type=text], .form-container input[type=password], .form-container input[type=number],.form-container input[type=email] {
        margin-top: 20%;
        width: 100%;
        height: 35px;
        margin: 5px 0 22px 0;
        border: none;
        background: #f1f1f1;
      }
      
      .form-container .btn {
        background-color: #3c7de6;
        color: white;
        padding: 16px 20px;
        border: none;
        cursor: pointer;
        width: 100%;
        margin-bottom:10px;
        opacity: 0.8;
      }
      
      .form-order{
        max-width: 100%;
    }

    .form-order .btn{
      background-color: #3c7de6;
      color: white;
      padding: 6px 10px;
      border: none;
      cursor: pointer;
      margin-left: 50%;
      margin-bottom:10px;
      opacity: 0.8;
  }

		
	.column {
	  float: left;
	  width: 33.33%;
	  padding: 5px;
		}
	
	
	.row::after {
	  content: "";
	  clear: both;
	  display: table;
	}
		
      .form-container .btn:hover, .open-button:hover {
        opacity: 5;
      }

    
    
      a:hover {
        color: #4CAF50;
      }
      
      a{
        padding: 3px;
      }
      
     
      
      ul {
        
        list-style-type: none;
        margin: 0;
        padding: 6px;
        overflow: hidden;
        background-color: #111;
      }

      li {
        float: left;
      }

      
      li a {
        color: white;
        text-align: center;
        padding: 14px 6px;
        text-decoration: none;
      }

      li a:hover {
        background-color: #111;
      }

      .header{
        margin-top: 0.5px; 
        float: center;
       
        display: block;
        color: black;
        text-align: center;
        font-weight:bold;
        padding: 4px 16px;
        text-decoration: none;
        background-color: #4CAF50;
        cursor: pointer;
      }


      #search{
        display: inline;
        width: 300px; 
      }

      #top{
        margin-left: 3%;
        margin-top: 15%;
        width: 22%;
        border: 3px solid #f1f1f1;
      }

      #border{
        margin-top: 10px;
        height: 20%;
        border: 2px solid #f1f1f1;  
        display: flex;
        margin-bottom: 10px;
      }

     
      #img-align{
        margin-top: 1.33em;
        height: 120px;
        width:225px;
      }
      #img-desc{
        display: flex;
     
      } 

      #bottom{
       margin-left: 45%;
      
       width: 80px;
      }

      #align{
        margin-left: 5%;
        max-width: 50%;
      }

      .a-spacing-top-base {
        margin-top: 14px!important;
    }
    .a-spacing-base, .a-ws .a-ws-spacing-base {
        margin-bottom: 14px!important;
    }
    .a-row {
        width: 100%;
    }

    #price{
      color: #b12704;
    }
   
    .buy{
      background-color: #f0c14b;
      border-color: #a88734;
      color: #111;
      border-style: solid;
      border-width: 1px;
      border-radius: 3px; 
    }

    #edit{
      text-align: right;
    }

    
    .cart-align{
      margin-top: 32px;	 
      color: white;
      text-align: center;
      padding: 0px 10px;
      text-decoration: none;
      float: right;
    }

    #filter{
      margin-left: 60px;
    }

    #search{
      margin-top: 32px;
      }	
    .outline{
      float: left;
      margin-top:0%;
      
      width:100%;
      border: solid 2px #f1f1f1;
    }

    .prod-align{
      
      float: left;
      width: 1110px;
      height: 100%;
      border: solid 2px #f1f1f1;
    }

    .logo-size{
      height: 45px;
      width:  45px; 
    }

    .logo{  font-family: serif;
        font-size: 36px; 
        font-weight: bold;
        display: block;
        color: white;
        text-align: center;
       
        text-decoration: none;
        background-color: #111;
        cursor: pointer;
    
    }

    #img-height{
      height: 330px;
      width:100%;
    }
    
    .slide-display-left{
    position: absolute;
    top: 40%;
    left: 0%;;
    }
    .slide-black{
      color: #fff!important;
      background-color: #000!important;
    }

    .slide-display-right{
    position: absolute;
    top: 40%;
    right: 0%;
    transform: translate(0%,-50%);
    }

    .slide-button{
    border: none;
    display: inline-block;
    padding: 8px 16px;
    vertical-align: middle;
    overflow: hidden;
    text-decoration: none;
    color: inherit;
    background-color: inherit;
    text-align: center;
    cursor: pointer;
    white-space: nowrap;
    }

    .ret-top{
      float: left;
    }

    .proddesc{
      width: 50%; 
      padding: 2px;
      border: solid 2px #f1f1f1;
    }

    .column {
      float: left;
      width:50%;
    }

    #img-prod-desc{
     
      height: 300px;
      width:60%;
    }

    .desc-align{
      float: left;
      width: 650px;
      height: 200px;
      border: solid 2px #f1f1f1;
    }

    .table-align{
      table-layout: auto;
      margin-top: 5px;
      border: solid 2px black;
      border-collapse: collapse;
    }
    
    td, th {
      <!-- border: 1px solid black; -->
      text-align: left;
      padding: 8px;
    }

    .retailer-form {
      float: left;
      width:30%;
    }

    #del{
      margin-left: 24px;
    }

    #add{
      margin-left: 40%;
    }

    #table{
      margin-left: 33%;
    }

    #total{
      margin-left: 3%;
      float:left;
      margin-top: 40px;
      width: 180px;
      height: 80px;
      border: 2px solid  #f1f1f1;
     
     }

     #sub-total{
      margin-left:26px;  
      margin-top: 40px;
      
     }

     #sub-btn{
      margin-left: 34px;
     }

     #sub-width{
      width: 1100px;
     }
   
     #sub-float{
      float: left;
     }
    
    #retailer-align{
    margin-left:15%;
    }
	
	#retailer-display{
	display:inline;
	}
    
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
}</style>
<meta charset="ISO-8859-1">
<title>User Sign Up Page</title>
</head>
<body>
        <div>
                <ul>
                    <li><div class="logo">
                            <img class="logo-size" src="resources/images/logo.jpg">ShopDrop
                        </div></li>
            </div>
        </ul>
	</div>
	<div class="header">Join the ShopDrop Community</center></div>
<form action="" method="Post" autocomplete="off">

<table align="center" border="0px" >
<tr>
<td>First Name</td>
<td><input class="input" type="text" name="first_name"></td>
<td>Last Name</td>
<td><input class="input" type="text" name="last_name"></td>
</tr>
<tr>
<td>Email Id</td><td><input class="input" type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>



<td>Contact Number</td><td><input class="input" type="text" name="mobile_no" pattern="[7-9]{1}[0-9]{9}" maxlength="10"></td>
</tr>
<tr>
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
<td>Zip Code</td><td><input class="input" type="text" name="zipcode" pattern="[0-9]{6}" maxlength="6"></td>

<td>Country</td><td><select class="input" name="country">
<option value="India">India</option>
</select>
</td>
</tr>
<tr>
<td>Password</td><td><input class="input" type="password" name="password"></td>

<td>Confirm Password</td><td><input  class="input" type="password" name="confirm_password"></td>
<tr>

<tr>

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