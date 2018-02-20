<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Camera Zone</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">CameraZone</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="index">Home</a></li>
        <li><a href="getallproducts">AllProducts</a></li>
        
        <li><a href="Contact">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
<h2 style="color:white;font-family:courier;"><b>Cart Information</b></h2>
<div style="color:red; text-align:center;">Cart Total:${grandtotal}</div>
<br><br><br><br><br>
<div align="center" >
<div class="container">
<table class="table table-striped" border="1px">
<thead>
  		<tr>
  		<th>Product ID</th>
  			<th>ProductName</th>
			<th>Quantity</th>
			<th>SubTotal</th>
			<th>Image</th>
			<th>Operation</th>
			
			
			</tr>
			</thead>
			<tbody>
			<c:forEach var="list1" items="${cart1}">
                <tr>
                <td><c:out value="${list1.productId}"/></td>
                 <td><c:out value="${list1.productName}" /></td>
                 <td><c:out value="${list1.quantity}" /></td>
                  <td><c:out value="${list1.productPrice*list1.quantity}" /></td>
                  <td style="width:171px;"><img src="${pageContext.request.contextPath}/images/${list1.productId}.png" style="width:100px; height:90px;"/></td>
                  <td><form>
                  <button  class="btn btn-info btn-lg" name = "ProductId" value = "${list1.productId}" type = "submit" formmethod="post" formaction="/pmaven1/delete1"> <span class="glyphicon glyphicon-trash"></span></button></form></td>
                </tr>
            </c:forEach>
            </tbody>
            </table>
            <i class="fa fa-cart-plus" aria-hidden="true"></i>
            </div>
            </div>