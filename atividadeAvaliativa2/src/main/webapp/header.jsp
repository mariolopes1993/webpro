<%@page import="DTHR.Data" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Data e hora</title>
	</head>
	<body>	
Bem vindo!<br><br>

 <%=Data.horaAtual() %>
	</body>
</html>