<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="height: 100%; width: 100%;">
	Welcome

	<%
	int k = 10;
%>
	<%=k%>
	int a;
	<br>

	<%
		Date d = new Date();
		Calendar c = Calendar.getInstance();
	%>
	<%=d%><br>
	<%=d.getHours()%>

	<br>
	<div style="display: flex; flex-wrap: wrap;"><%=c%></div>
	<br>

	<%
		String birtYearError = (String) request.getAttribute("birthYearError");
	%>
	<form action="CalculateAgeServlet">
		BirtYearh : <input type="text" name="birthYear" /><font color="red"><%=birtYearError == null ? "" : birtYearError%></font>
		<br> <input type="submit" value="Find Age" />
	</form>

</body>
</html>