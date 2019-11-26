<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
 <link href="<c:url value="/resources/css/navbar.css" />" rel="stylesheet"  type="text/css" /> 
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
table, th, td {
  <!--border: 1px black solid;-->
  border-collapse: collapse;
}
th, td {
  <!--padding: 5px;-->
  text-align: left;    
}


.price {
  color: grey;
  font-size: 22px;
}


.card button {
  border: none;
  outline: 1px;
  padding: 10px;
  color: white;
  background-color: #4CAF50;
  text-align: center;
  cursor: pointer;
  <!-- width: 25%;-->
  font-size: 16px;
}

.card button:hover {
  opacity: 0.7;
}


h2{ 
                color:green; 
                text-align:left; 
            } 



 .card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);

  
  margin: auto;

  font-family: arial;
  padding: 12px;
  
}

pre{
font-size: 16px;
 font-family: arial;
}
</style>
</head>
<body>
  <div>

<div class="topnav">
  
  <a href="#home">Home</a>
  <a href="#home">Compare Products</a>
  
  <div class="dropdown">
      <button class="dropbtn">Categories
      <i class="fa fa-caret-down"></i>
      </button>
     <div class="dropdown-content">
     <a href="#about">Men's Fashion</a>
 	 <a href="#contact">Women's Fashion</a>
 	 <a href="#home">Electronics</a>
     <a href="#about">Home Decor</a>
     </div>
  <div   class="search-container" >
			<form action="/action_page.php">
      		<input type="text" placeholder="Search.." name="search">
     		<button  style="background-color: #4CAF50" class="button" type="submit">Search</button>
     		</form>
    </div>
  
  </div>
  

 <c:forEach items="${listProduct}" var="Product">
 <center>
  <table class ="card" style="width:100%" >

    <tr>
      <td colspan="2"><img src="${pageContext.request.contextPath}/resources/images/9.jpg" alt="Smiley face" height="200" width="130"></td>
      </tr>
      <tr>
      <td colspan="2"><h2>${Product.product_name}</h2></td>
     
      
    </tr>
  <tr >
  <td colspan="2">
  <pre>${Product.description}
  </pre></td>
  </tr>
  
  <tr>
  <td colspan="2">Brand:Gutsy</td>
  </tr>
 
  
  <tr>
  <td class="price" colspan="2">Rs. ${Product.product_base_price}</td>
  </tr>
  
  <tr >
  <td ><a href="/OnlineShoppingProject/addToCart?pid=${Product.product_id}&q=1"><button>Add to Cart</button></a><br><br>
  <a href="/OnlineShoppingProject/addToWishlist?id=${Product.product_id}"><button>Add to Wishlist</button></a><br><br>
  <button>Compare with Similiar Items</button></td>
  </tr>
  </table>
  </center>
 </c:forEach>

<br>
<br>

</body>
</html>
