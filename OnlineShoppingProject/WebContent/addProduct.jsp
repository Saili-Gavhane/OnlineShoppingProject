<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/text.css"  type="text/css">
<meta charset="ISO-8859-1">
<title>Add Product</title>


 <script type="text/javascript">
        var subcategory = {
            WomensFashion: ["Panash","Manywar Mohey",],
            Electronics: ["Samsung","Motorola",],
            MensFashion: ["Adiddas","Fastrack",],
            HomeDecoration: ["DHomes","Naptol",],
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

<form action="/OnlineShoppingProject/addProduct" method="POST"> 

<table align="center"> 

<tr><td>Product Name</td><td><input class="input" type="text" name="name" size="20"></td></tr> 
<tr><td>Product Description</td><td><input class="input" type="text" name="description" size="30"></td></tr> 


<tr><td>Category</td>
<td><select class="input" id="category" name="category" onchange="makeSubmenu(this.value)">
<option value="" disabled selected>Choose Category</option>
<option>Electronics</option>
<option>WomensFashion</option>
<option>MensFashion</option>
<option>HomeDecoration</option>
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
<tr><td>Product Image</td><td><input class="input" type="file" name="image" accept="image/*"></td></tr> 
<tr><td colspan="2"><input class="button" type="submit" href="" name="Add Product" value="Send for approval"></td></tr>
</table>




 
</form> 

</body>
</html>