<%@page import="com.bean.BookBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Books</title>
</head>
<body>
	<%
		ArrayList<BookBean> books = (ArrayList<BookBean>) request.getAttribute("books");
	%>

	<table border="1">
		<tr>
			<td>Bookid</td>
			<td>BookName</td>
			<td>Price</td>
			<td>Action</td>
		</tr>

		<%
			for (BookBean b : books) {
		%>
		<tr>
			<td><%=b.getBookId() %></td>
			<td><%=b.getBookName() %></td>
			<td><%=b.getPrice() %></td>
			<td><a href="DeleteBookServlet?bookId=<%=b.getBookId() %>">Delete</a></td>
		</tr>
		<%
			}
		%>

	</table>

</body>
</html>