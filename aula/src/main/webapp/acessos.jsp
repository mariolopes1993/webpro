<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostra a quantidade de acessos na p�gina</title>
</head>
<body>
<%! int cont = 1; %>

Quantidade de acessos nesta p�gina: <%= cont %>

<% cont = cont +1; %>
</body>
</html>