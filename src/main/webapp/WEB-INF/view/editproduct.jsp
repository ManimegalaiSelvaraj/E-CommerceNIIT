<html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <body>
<div class="collapse navbar-collapse" id="navbar-collapse-4">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="index">Home</a></li>
            <li><a href="Aboutus">About</a></li>
            <li><a href="contents">Contents</a></li>
            <li><a href="login">LogIn</a></li>
            <li><a href="signup">SignUp</a></li>
            <li><a href="contact">Contact</a></li>
            </ul>
        </div>
<form:form class="form-horizontal" action="AddProduct" method="POST"  commandName="AddProduct">
<fieldset>
<!-- Form Name -->
<legend>PRODUCTS</legend>
<div class="form-group">
  <label class="col-md-4 control-label" for="product_name">PRODUCT ID</label>  
  <div class="col-md-4">
  <form:input id="product_id" path="pid" name="product_id" placeholder="PRODUCT ID"  class="form-control input-md" type="text" path="pid" hidden=true></form:input>
    </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_name">PRODUCT NAME</label>  
  <div class="col-md-4">
  <form:input id="product_name" path="pName" name="product_name" placeholder="PRODUCT NAME" class="form-control input-md" type="text"></form:input>
    </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="available_quantity">AVAILABLE QUANTITY</label>  
  <div class="col-md-4">
  <form:input id="available_quantity" path="pQuantity" name="available_quantity" placeholder="AVAILABLE QUANTITY" class="form-control input-md" type="text"></form:input>    
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="available_quantity">PRODUCT PRIZE</label>  
  <div class="col-md-4">
  <form:input id="product_prize" path="pPrize" name="product_prize" placeholder="PRODUCT PRIZE" class="form-control input-md" type="text"></form:input>    
  </div>
</div>
<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_description">PRODUCT DESCRIPTION</label>
  <div class="col-md-4">                     
    <form:textarea class="form-control" path="pDes" id="product_description" name="product_description"></form:textarea>
  </div>
</div>
 <!-- Button -->
<div class="form-group">
   <div class="col-md-4">
    <form:button id="update" name="update" value="update" class="btn btn-primary">Update</form:button>
  </div>
  </div>
</fieldset>
</form:form>
