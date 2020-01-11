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



<h1>Addon Select</h1>
<%-- <form:form  method="post"  commandName="mylogin"> --%>
 <form:form method="GET" action="/Fleet/Register.do" > 


<table>
<c:forEach var="list" items="${addOnlist}">
<tr>
<td>
<input type="checkbox" name="${list.addonPrice}" value="${list.addonPrice}"/>
</td>
<td><b>Name: ${list.addonName}</b></td>
<td><b>Price: ${list.addonPrice}</b></td>
<td> </td>

</tr>
</c:forEach>



</table>
 <input type=submit value="Continue Booking"> 
<%-- <form:button href="Register.do" ></form:button> --%>
<%-- </form:form> --%>
</form:form>  
	
	
</body>
</html>