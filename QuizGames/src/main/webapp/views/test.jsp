<html><head>
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
<body>
	<form action="<%=request.getRequestURL()%>" name="forma">
	Seconds remaining: 00:<input type="text" name="clock" value="<%=clock%>" style="border:0px solid white">
	</form>
	<script>
	<!--
	timer();
	//-->
	</script>
	
	<a type="button" id="mybutton" href="/easy" onclick="myFunction()">Submit</a>
</body>
</html>