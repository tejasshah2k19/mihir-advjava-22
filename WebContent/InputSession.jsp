<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Session</title>
</head>
<body>
	<form action="SaveSessionServlet" method="post">
		Data Name : <input type="text" name="dataName" /><br> <BR>
		Data Value : <input type="text" name="dataValue" /><br> <br>
		<input type="submit" value="Save" />
	</form>
	<br>
	<a href="SessionOutput.jsp">View Session Data</a>
</body>
</html>