<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
		<tr>
			<th>bookId</th>
			<th>author</th>
			<th>bookName</th>
			<th>category</th>
		</tr>
		<c:forEach items="${sessionScope.selectedBooks}" var="listOfBooks">

			<tr>
				<td>${listOfBooks.bookId}</td>
				<td>${listOfBooks.getAuthor()}</td>
				<td>${listOfBooks.bookName}</td>
				<td>${listOfBooks.category}</td>
			</tr>


		</c:forEach>

	</table>
	<a href="index.html"><input type="button" value="logout"></a>
</body>
</html>