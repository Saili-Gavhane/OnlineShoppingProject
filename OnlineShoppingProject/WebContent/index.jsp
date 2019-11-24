<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>ShopDrop Homepage</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta  charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">


<style>
* {box-sizing: border-box;}

* {box-sizing: border-box}
.mySlides2 {display: none}
img {vertical-align: middle;}



body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #4CAF50;
  color: white;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  font-color:white;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}



.button {
  background-color: #4CAF50;
  font-size:15px;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
 }
 
}

.dropdown {
  
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: black;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: #4CAF50
  
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}


<!-- For image slide -->
 .showSlide {  
            display: none  
        }  
            .showSlide img {  
                width: 100%;  
            }  
        .slidercontainer {  
            max-width: 1000px;  
            position: relative;  
            margin: auto; 

        }  
        .left, .right {  
            cursor: pointer;  
            position: absolute;  
            top: 50%;  
            width: auto;  
            padding: 16px;  
            margin-top: -22px;  
            color: white;  
            font-weight: bold;  
            font-size: 18px;  
            transition: 0.6s ease;  
            border-radius: 0 3px 3px 0;  
        }  
        .right {  
            right: 0;  
            border-radius: 3px 0 0 3px;  
        }  
            .left:hover, .right:hover {  
                background-color: rgba(115, 115, 115, 0.8);  
            }  
        .content {  
            color: #eff5d4;  
            font-size: 30px;  
            padding: 8px 12px;  
            position: absolute;  
            top: 10px;  
            width: 100%;  
            text-align: center;  
        }  
        .active {  
            background-color: #717171;  
        }  
        /* Fading animation */  
        .fade {  
            -webkit-animation-name: fade;  
            -webkit-animation-duration: 1.5s;  
            animation-name: fade;  
            animation-duration: 1.5s;  
        }  
        @-webkit-keyframes fade {  
            from {  
                opacity: .4  
            }  
            to {  
                opacity: 1  
            }  
        }  
  
        @keyframes fade {  
            from {  
                opacity: .4  
            }  
            to {  
                opacity: 1  
            }  
        }  



</style>
</head>





<body>

  <div><center><h1>ShopDrop</center></h1></div>
<div>

<div class="topnav">
  
  <a href="#home">Home</a>
  
  <a href=>About Us</a>
  <a href=>Help</a>
  <a href="#home">Sign In</a>
  
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
    
  
  </div>


</div>
</div>


<!-- Video Start 
 <div><center>
<video width="400" controls>
  <source src="resources/videos/12.mp4" type="video/mp4">
</video>
</center>
</div>
-->




<!-- image slide -->

 <div class="slidercontainer">  
        <div class="showSlide fade">  
            <img  src="1.jpg" />  
            
        </div>  
        <div class="showSlide fade">  
            <img src="2.jpg" />  
            
        </div>  
  
        <div class="showSlide fade">  
            <img  src="3.jpg" />  
            
        </div>  

        <div class="showSlide fade">  
            <img  src="5.jpg" />  
            
        </div>  
        <div class="showSlide fade">  
            <img src="6.jpg" />  
            
        </div>  
  
        <div class="showSlide fade">  
            <img  src="7.jpg" />  
            
        </div>  
     
        <!-- Navigation arrows -->  
        <a class="left" onclick="nextSlide(-1)"><</a>  
        <a class="right" onclick="nextSlide(1)">></a>  
    </div>  
  
    <script type="text/javascript">  
        var slide_index = 1;  
        displaySlides(slide_index);  
  
        function nextSlide(n) {  
            displaySlides(slide_index += n);  
        }  
  
        function currentSlide(n) {  
            displaySlides(slide_index = n);  
        }  
  
        function displaySlides(n) {  
            var i;  
            var slides = document.getElementsByClassName("showSlide");  
            if (n > slides.length) { slide_index = 1 }  
            if (n < 1) { slide_index = slides.length }  
            for (i = 0; i < slides.length; i++) {  
                slides[i].style.display = "none";  
            }  
            slides[slide_index - 1].style.display = "block";  
        }  
    </script>  

<table border="1" cellpadding="5">
        <c:forEach items="${listProduct}" var="Product">
        <tr><td>${Product.product_name}</td></tr>
            <tr> <td>${Product.product_base_price}</td></tr>
             <tr> <td>${Product.product_image}</td></tr>
               <tr><td>${Product.description}</td></tr>
                <tr><td>${Product.product_brand_id}</td></tr>
        </c:forEach>
    </table>
</body>
</html>