<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Please Login </title>
</head>

<body>

<spring:url var="loginUrl" value="/login"/>

<form action="${loginUrl}" method="post">
	UserName : <input type="text" name="username" placeholder="UserName" value="admin"> <br>
	Password : <input type="password" name="password" placeholder="Password" value="test123"><br>
<input type="submit" value="Login">

<c:if test="${not empty error}">
<p>UserName and/or password incorrect.</p>
</c:if>

</form>

</body>
</html>