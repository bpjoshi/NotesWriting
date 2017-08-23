<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sticky Notes Login</title>
</head>
<body>
	<center>Please login!</center>
	<div>
	<!-- Check the network console, it will give 405 error in the beginning since doPost doesn't exist-->
	<form action="welcome.do" method="post">
		<div id="errorMsg">
		<p style="color: red">${errMsg}</p>
		</div>
		Name: <input type="text" name="name">
		Pass: <input type="password" name="password">
		<input type="submit" value="Submit">
	</form>
	</div>
</body>
</html>