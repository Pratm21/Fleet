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


<h1>Vehicle Selection</h1>

<table>



<tr>
<td>CAR CLASS</td><td>CAR TYPE</td><td>BASE RATE</td>
</tr>
<tr><td><td></td><td></td><td>Daily</td><td>Wkly</td><td>Monthly</td><td></td></td></tr>
<form:form method="POST" action="/Fleet/Addon.do" >
<c:forEach var="list" items="${mylist}">
<tr>
<td><img src="${list.imagepath}" height=75 width=140 />
</td>
<td>${list.carName}</td>
<td>
<td><b> ${list.DRate}</b></td>
<td><b> ${list.WRate}</b></td>
<td><b> ${list.MRate}</b></td>
</td>
<td><input type=submit value="Continue Booking">  </td>

</tr>
</c:forEach>
</form:form>
</table>

	
	
</body>
</html>