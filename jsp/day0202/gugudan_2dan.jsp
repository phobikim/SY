<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int dan = 2;
	for(int i=1; i<=9; i++){
		%>
		<%=dan %>*<%=i %>=<%=dan*i %><br>
		<%
	}
%>
</body>
</html>
