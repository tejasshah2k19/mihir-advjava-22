<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<%
		String ageError = (String) request.getAttribute("ageError");
	%>

	<form action="VotingServlet">
		Age <input type="text" name="age">
		<%=ageError == null ? "" : ageError%>
		<br>
		<br> <input type="submit" value="Result">
	</form>
</body>
</html>