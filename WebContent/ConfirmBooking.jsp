<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
<style>
	.error
	{
		align:right;
		color:red;
	}
</style>
<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.9.1.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
$(function() {
$( ".datepicker" ).datepicker({ dateFormat: "mm/dd/yy",changeMonth: true, changeYear: true, yearRange: '1990:2000' });
});
</script>
<style>
div.ui-datepicker
{
 margin-left:180px;
}
</style>
</head>

<body>

<form:form id="form" method="post" action="success.jsp" commandName="temp">
<table>

<tr>
<td>
Pick-Up:
</td>
<td>
 ${sessionScope.pickup}
<td>
Return
</td>
<td>
B
</td>
</tr>

<tr>
<td>
Pick-Up At:
</td>
<td>
A
</td>
<td>
Return At:
</td>
<td>
B
</td>
</tr>

<tr>
<td>
Vehicle Type:
</td>
<td>
A
</td>
<td>
Rental Add-On:
</td>
<td>
B
</td>
</tr>

<tr>
<td>
First Name 
</td>
<td>
<form:input path="firstname"/> 
</td>
<td>
<form:errors path="firstname" cssClass="error"/>
</td>
<td>
Last Name 
</td>
<td>
<form:input path="lastname"/> 
</td>
<td>
<form:errors path="lastname" cssClass="error"/>
</td>
</tr>
 <td>
userName 
</td>
<td>
<form:input path="name"/> 
</td>
<td>
<form:errors path="name" cssClass="error"/>
</td>
<td>
password
</td>
<td>
<form:input path="password"/> 
</td>
<td>
<form:errors path="password" cssClass="error"/>
</td>
<td>
confirmPassword
</td>
<td>
<form:input path="confirmPassword"/> 
</td>
<td>
<form:errors path="confirmPassword" cssClass="error"/>
</td>

<tr>
<td>
Address1 
</td>
<td>
<form:input path="address1"/> 
</td>
<td>
<form:errors path="address1" cssClass="error"/>
</td>
</tr>

<tr>
<td>
Address2 
</td>
<td>
<form:input path="address2"/> 
</td>
<td>
<form:errors path="address2" cssClass="error"/>
</td>
</tr>

<tr>
<td>
Email id
</td>
<td>
<form:input path="email"/>
</td>
<td>
<form:errors path="email" cssClass="error"/>
</td>
</tr>

<tr>
<td>
city
</td>
<td>
<form:input path="city"/>
</td>
<td>
<form:errors path="city" cssClass="error"/>
</td>


<td>
zip
</td>
<td>
<form:input path="zip"/>
</td>
<td>
<form:errors path="zip" cssClass="error"/>
</td>
</tr>

<tr>
<td>
Home Phone
</td>
<td>
<form:input path="phone_no"/>
</td>
<td>
<form:errors path="phone_no" cssClass="error"/>
</td>

<td>
Cell
</td>
<td>
<form:input path="mobile"/>
</td>
<td>
<form:errors path="mobile" cssClass="error"/>
</td>
</tr>

<tr>
<td>
Driving License
</td>
<td> 
<form:input path="driving_license"/>
</td>
<td>
<form:errors path="driving_license" cssClass="error"/>
</td>

<td>
Issued by
</td>
<td>
<form:input path="l_issued" cssClass="datepicker"/> 
</td>
<td>
<form:errors path="l_issued" cssClass="error"/>
</td>



<td>
Valid thru
</td>
<td>
<form:input path="l_validthru" cssClass="datepicker"/> 
</td>
<td>
<form:errors path="l_validthru" cssClass="error"/>
</td>
</tr>

<tr>
<td>
IDP no.
</td>
<td> 
<form:input path="IDP"/>
</td>
<td>
<form:errors path="IDP" cssClass="error"/>
</td>

<td>
Issued by
</td>
<td>
<form:input path="i_issued" cssClass="datepicker"/> 
</td>
<td>
<form:errors path="i_issued" cssClass="error"/>
</td>

<td>
Valid thru
</td>
<td>
<form:input path="i_validthru" cssClass="datepicker"/> 
</td>
<td>
<form:errors path="i_validthru" cssClass="error"/>
</td>

</tr>

<tr>
<td>
Passport no.
</td>
<td> 
<form:input path="passport_no"/>
</td>
<td>
<form:errors path="passport_no" cssClass="error"/>
</td>

<td>
Issued by
</td>
<td>
<form:input path="p_issued" cssClass="datepicker"/> 
</td>
<td>
<form:errors path="p_issued" cssClass="error"/>
</td>

<td>
Valid thru
</td>
<td>
<form:input path="p_validthru" cssClass="datepicker"/> 
</td>
<td>
<form:errors path="p_validthru" cssClass="error"/>
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