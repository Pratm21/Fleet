<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style>
	.error
	{
		color:red;
	}
</style>
</head>
<body>
<h1>Login Page</h1>
<form:form  method="post" commandName="mylogin">
<table>
<tr>
<td>
User Name 
</td>
<td>
<form:input path="username"/>
</td>
<td>
<form:errors path="username" cssClass="error"/><br>
</td>
</tr>
<tr>
<td>
Password
</td>
<td>
<form:password path="password"/>
</td>
<td>
<form:errors path="password" cssClass="error"/><br><br>



</td>
</tr>
<tr>
<td>
<input type=submit value="Submit"/>
</td>
</tr>
</table>
</form:form>	
</body>
</html>