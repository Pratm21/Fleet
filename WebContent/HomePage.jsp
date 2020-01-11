<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="jquery-1.8.2.js"></script>
<script src="jquery-ui.js"></script>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.error
	{
		align:right;
		color:red;
	}
</style>

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
<script>
 function call()
 { 
	 sel=document.getElementById("city");
	 var city= sel.options[sel.selectedIndex].text;
	 window.location.href = "location.do?city="+city+"";
 }
$(document).ready(function() {
   
	$('#state').change(function(event) {
        var state = $("select#state").val();
       // alert(actors);
        var select = $('#city');
        $.ajax({
					type : "GET",
					url : "/Fleet/second.do?statename="+state+"",
					success : function(data) {
								console.log("SUCCESS: ", data);
								$('#city option').remove();
								$('#city').append("<option value='Select Value'>Select Value</option>");
								for(var i=0;i<data.length;i++)
								{
			    		        	$('<option>').val(data[i]).text(data[i]).appendTo(select);
								};
        					}
				});  
			});
});

$(document).ready(function() {
	   
	$('#state1').change(function(event) {
        var state1 = $("select#state1").val();
       // alert(actors);
        var select = $('#city1');
        $.ajax({
					type : "GET",
					url : "/Fleet/second.do?statename="+state1+"",
					success : function(data) {
								console.log("SUCCESS: ", data);
								$('#city1 option').remove();
								$('#city1').append("<option value='Select Value'>Select Value</option>");
								for(var i=0;i<data.length;i++)
								{
			    		        	$('<option>').val(data[i]).text(data[i]).appendTo(select);
								};
        					}
				});  
			});
});
</script>





<form:form method="post" action="/Fleet/VehicleSelection.do" commandName="myregister">
<table>
<tr>
<td>
<input name="rentDate"  type="date"/> 
</td>
<td>
<form:errors path="rentDate" cssClass="error"/>
</td>
<td>
<input name="returnDate" type="date" /> 
</td>
<td>
<form:errors path="returnDate" cssClass="error"/>
</td>
<td>
Pick-Up Location:
</td>
<td>
 <select id="aircode" name="aircode">
		<option>Select AIRPORT</option>
        <c:forEach items="${key1}" var="c">
		<option value="${c}">${c}</option>
    	</c:forEach>	
         </select>
  </td>
   </tr>
  
 <tr><td> State:
 <select id="state" name="state">
		<option>Select STATE</option>
        <c:forEach items="${key2}" var="c">
		<option value="${c}">${c}</option>
    	</c:forEach>	
        </select></td><td>
          Select City:  
        <select id="city" name="city">
                <option>Select Value</option>
        </select>
        </td><td>
     
     <button type="button" onclick="call()" >Search</button>
    
    <tr><td>
Return Location:</td>
<td>     
 <select id="aircode1" name="aircode1">
		<option>Select AIRPORT</option>
        <c:forEach items="${key1}" var="c">
		<option value="${c}">${c}</option>
    	</c:forEach>	
         </select>
     </td>
       </tr>
       
       <tr>
       <td> State:
      
 <select id="state1" name="state1">
		<option>Select STATE</option>
        <c:forEach items="${key2}" var="c">
		<option value="${c}">${c}</option>
    	</c:forEach>	
         </select></td>
         <td>
          Select City:  
        <select id="city1" name="city1">
                <option>Select Value</option>
        </select>
        </td></tr></table>

        
 <input type=submit value="Continue Booking"> 
      
</form:form>
<c:if test="${key4!=null}">
   <p>Your Location is <c:out value="${key4}"/><p>
</c:if>

</body>
</html>