<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>User Registration</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
	
</head>
<body ng-app="overlookedVideosApp">	
        
	<form:form method="POST" action="${pageContext.request.contextPath}/addUser" 
		modelAttribute="user" class="form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="username">Username:</label>
					<div class="col-sm-10">
    					<form:input path="username" type="text" style="width: 50%" ng-model="username" 
    					class="form-control" id="username" placeholder="Enter your username" />
    				</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="email">E-mail:</label>
					<div class="col-sm-10">
    					<form:input path="email" type="text" style="width: 50%" ng-model="email" class="form-control" 
    					id="email" placeholder="Enter your e-mail address" />
    				</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="password">Password:</label>
					<div class="col-sm-10">
    					<form:input path="password" type="text" style="width: 50%" ng-model="password" 
    					class="form-control" id="password" placeholder="Enter your password"/>
    				</div>
				</div>

				<div class="form-group">
					<label class="control-label col-sm-2" for="password2">Confirm Password:</label>
					<div class="col-sm-10">
    					<input type="text" style="width: 50%" ng-model="password2" class="form-control" id="password2" placeholder="Enter your password">
    				</div>
				</div>

				<input type="submit" class="btn btn-primary" id="createAccountButton" value="Create Account">
				
	</form:form>
</body>
</html>