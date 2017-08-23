<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sopra Steria</title>
</head>
<body>
	<h3>Hello ${name}!</h3> 
	<p> Welcome to Java EE Tutorial. This is the first JSP!</p>
	<p>Date: <%=new java.util.Date() %></p>
	<div>
	<form action="welcome.do">
		Name: <input type="text" name="name">
		<input type="submit" value="Submit">
	</form>
	</div>
</body>
</html>