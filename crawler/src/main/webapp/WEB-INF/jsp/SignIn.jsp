<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
		<title>Sign In - Overlooked Videos</title>

		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

		<link rel="stylesheet" type="text/css" href="/css/style.css">

		<script type="text/javascript" src="js/script.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body ng-app="overlookedVideosApp">
		
        <form:form  modelAttribute="login" method="POST"
        	action="${pageContext.request.contextPath}/login" class="form-horizontal">
				<br><br><br>
				<div class="form-group">
					<label class="control-label col-sm-2" for="username">Username:<label>
					<div class="col-sm-10">
    					<form:input path="username" type="text" style="width: 50%" ng-model="username" 
    						class="form-control" id="username" placeholder="Enter your username" />
    				</div>
				</div>


				<div class="form-group">
					<label class="control-label col-sm-2" for="password">Password:<label>
					<div class="col-sm-10">
    					<form:input path="password" type="text" style="width: 50%" ng-model="password" 
    					class="form-control" id="password" placeholder="Enter your password" />
    				</div>
				</div>


				<input type="submit" class="btn btn-primary" id="signInButton" value="Sign In">

				<button type="button" class="btn btn-primary" id="forgotPasswordButton" onclick="location.href='forgotPassword.html';">Forgot Password</button>
		</form:form>

</body>
</html>