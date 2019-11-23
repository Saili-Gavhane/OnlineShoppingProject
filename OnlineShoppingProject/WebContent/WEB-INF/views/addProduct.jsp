<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
        <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet" href="resources/css/text.css"  type="text/css">

 <script type="text/javascript">
        var subcategory = {
            Womens_Fashion: ["Panash","Manyawar Mohey"],
            Electronics: ["Samsung","Motorola","Nokia"],
            Mens_Fashion: ["Adiddas","Fastrack",],
            Home_Decoration: ["Borosil","Cello","RiddhieR","Homebuddy","KitchenPro","Butterfly","Prestige","Kitchoff","Solimo","Hawkins","Russell","Bajaj","Lifelong","Signora","SheetKart","Bharat","Cortina"],
        }

        function makeSubmenu(value) {
            if (value.length == 0) document.getElementById("categorySelect").innerHTML = "<option></option>";
            else {
                var citiesOptions = "";
                for (categoryId in subcategory[value]) {
                    citiesOptions += "<option>" + subcategory[value][categoryId] + "</option>";
                }
                document.getElementById("categorySelect").innerHTML = citiesOptions;
            }
        }

        function displaySelected() {
            var country = document.getElementById("category").value;
            var city = document.getElementById("categorySelect").value;
            
        }

        
    </script>
</head>
<body>

       <center><h1>Add Product</h1></center> 

        <br>

<form action="/OnlineShoppingProject/addProduct" method="POST" enctype="multipart/form-data"> 

<table align="center"> 
<tr><td>Retailer Id</td><td><input class="input" type="text" name="id" value="${retailer.retailer_id}" size="20"></td></tr> 
<tr><td>Product Name</td><td><input class="input" type="text" name="name" size="20"></td></tr> 
<tr><td>Product Description</td><td><input class="input" type="text" name="description" size="30"></td></tr> 


<tr><td>Category</td>
<td><select class="input" id="category" name="category" onchange="makeSubmenu(this.value)">
<option value="" disabled selected>Choose Category</option>
<option>Electronics</option>
<option>Womens_Fashion</option>
<option>Mens_Fashion</option>
<option>Home_Decoration</option>
</select>
</td>
</tr>


<tr>
<td>Brand</td>
<td>
 <select class="input" id="categorySelect" name="brand_name">
<option value="" disabled selected>Choose Brand</option>
<option></option>
</select>
</td>
</tr>

<tr><td>Product Base Price</td><td><input class="input" type="text" name="base_price" size="15"></td></tr>  
<tr><td>Product Count</td><td><input class="input" type="number" name="product_count"  ></td></tr> 
<tr><td>Product Image</td><td><input class="input" type="file" name="image"></td></tr> 
<tr><td colspan="2"><input class="button" type="submit" href="" name="Add Product" value="Send for approval"></td></tr>
</table>




 
</form> 

</body>
</html>