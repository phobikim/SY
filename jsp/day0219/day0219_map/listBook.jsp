<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>도서목록</h2>
	
	<a href="insertBook.do">도서등록</a>
	<table border="1" width="80%">
		<tr>
			<td>도서번호</td>
			<td>도서명</td>
			
		</tr>	
		
		<c:forEach  var="b"   items="${list }">
			<tr>
				<td>${b.no }</td>
				<td><a href="detailBook.do?no=${b.no }"> ${b.name }</a> </td>
				
			</tr>	
		</c:forEach>
		
	</table>
</body>
</html>








