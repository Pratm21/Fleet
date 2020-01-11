<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Location</title>
<style>
	.error
	{
		color:red;
	}
</style>
</head>

<body>
<form:form id="form" method="post" action="/Fleet/location.do" commandName="mylocation">
<h1>Select a Pick-up / Return location.</h1>

<h2>Your location description ${key5} has following matches. Please select one.</h2>

<table>     
<c:forEach items="${loc1}" var="list">
        <tr>
            <td><h3> <INPUT TYPE="radio" NAME="radios" value="${list}"/><c:out value="${list}"/></h3></td>
        </tr>
    </c:forEach>
</table>
<input type=submit value="Continue Booking"/>
</form:form>
</body>
</html>