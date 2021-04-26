<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Hard Quiz </title>
<script>
	<%
	String clock = "30";
	%>
	var timeout = <%=clock%>;
	function timer()
	{
	if( --timeout > 0 )
	{
	document.forma.clock.value = timeout;
	window.setTimeout( "timer()", 1000 );
	}
	else
	{
		document.getElementById("mybutton").click(); 
	}
	}
</script>
</head>
<body>
<div class="container">
	<div class="row">
	  <div class="column">
	   	<h1>Welcome Hard Quiz Game</h1>
		<p>Please Attempt All Question And make Sure you Select At least one option in every question
		<form action="hardform" method="post" >
		<c:forEach items="${hardQuestion }" var="p" >
	    <b>Q.${p.id } ${p.question }</b><br>
	    <p>A.<input name="a${p.id }" type="radio" value="${p.option1}" > ${p.option1 } </p>
	    <p>B.<input name="a${p.id }" type="radio" value="${p.option2}" > ${p.option2 } </p>
	    <p>C.<input name="a${p.id }" type="radio" value="${p.option3}" > ${p.option3 } </p>
	    <p>D.<input name="a${p.id }" type="radio" value="${p.option4}" > ${p.option4 } </p>
	    	 <input type="hidden" name="a${p.id }" value="xyz" />
	    </c:forEach><br>
	    <button type="reset" class="btn btn-success">Reset</button>
	    <button type="submit" class="btn btn-success" id="mybutton" onclick="myFunction()" >Submit</button>
		</form>
	  </div>
	  <div class="column">
	    <form action="<%=request.getRequestURL()%>" name="forma">
		Seconds remaining: 00:<input type="text" name="clock" value="<%=clock%>" style="border:0px solid white">
		</form>
		<script>
		<!--
		timer();
		//-->
		</script>
	  </div>
	</div>
</div>
</body>
</html>