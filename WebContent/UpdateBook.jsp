<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>
</head>

 <body>
<form action="UpdateBookServlet">

 <input type="hidden" name="bookId"  value="${book.bookId}">
  BookName: <input type="text" name="bookName"   value="${book.bookName}"><br><br>
  Price:<input type="text" name="price" value="${book.price}" ><br><br>
  <input type="submit" value="Update">
  
</form>
</body>
</html>