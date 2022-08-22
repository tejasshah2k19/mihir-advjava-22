<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Output</title>
</head>
<body>

	Name => ${sessionScope.name}<br>
	Email => ${sessionScope.email }
	
	<br>
	<%String email= (String)session.getAttribute("email"); %>
	<%=email %>
	
	
	<br><br>
	
	<a href="LogoutServlet">Logout</a>

</body>
</html>