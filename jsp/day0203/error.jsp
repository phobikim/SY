<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
죄송합니다. 서비스중에 다음과 같은 문제가 발생하였습니다.<br>
<%= exception.getMessage() %>
</body>
</html>