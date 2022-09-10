<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JstlCoreTag</title>
</head>
<body>

	<%
		int p = 10;
	%>
	<%=p%>
	<%
		if (p % 2 == 0) {
			out.print("EVEN");
		}
	%>
	<br>
	<%
		for (int i = 1; i <= 5; i++) {
			out.print(i + "<br>");
		}
	%>
	----------------------
	<Br>
	<c:set var="a" value="10"></c:set>
	<c:out value="${a}"></c:out>
	<c:if test="${a%2==0}">EVEN</c:if>
	<br>
	<c:forEach var="i" begin="1" end="5" step="1">
		${i}<br>
	</c:forEach>
	<br> ----------------------
	<br>
	<c:set var="days" value="mon,tue,wen,thus,fri,sat,sun"></c:set>

	<c:forTokens items="${days}" delims="," var="x">
      ${x}<br>
	</c:forTokens>

     <c:remove var="days"/>
     
	<br>
	<c:set var="names" value="ram shyam ganshyam ravan bahubali"></c:set>

	<c:forTokens items="${names}" delims=" " var="x">
      ${x}<br>
	</c:forTokens>

<c:catch var="x">
	<%
		int a = 90, b = 0;
		int c = a / b;
		out.print(c);
	%>

</c:catch>
<c:out value="${x }"></c:out>

<br>



</body>
</html>