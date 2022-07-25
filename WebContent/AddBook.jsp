<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>
<form method="post" action="AddBookServlet">
	BookName:<input type="text" name="bookName"/><br>
	Price : <input type="text" name="price"/><br>
	
	<input type="submit" value="Save Book"/>
</form>

</body>
</html>