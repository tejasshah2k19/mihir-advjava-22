<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false" autoFlush="true" buffer="8kb"
	import="java.util.Date,java.io.File" import="java.applet.Applet"%>

<%@page errorPage="Error.jsp" isELIgnored="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
	<%
		Date d = new Date();
		File f = new File("d.txt");
		Applet app = null;
	%>

	${firstName}
</body>
</html>