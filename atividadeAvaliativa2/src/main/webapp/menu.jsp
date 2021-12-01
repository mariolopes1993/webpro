

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
	<a href="control?ac=cadastrar">Cadastro disciplina e nota</a><br><br> <!-- link para voltar a página cadastro de disciplinas -->

	<a href="control?ac=listar">Consultar disciplinas e notas</a><br><br> <!-- link para voltar a página consultar disciplinas -->

	<jsp:include page="header.jsp">
    <jsp:param name="teste" value="Parâmetro de teste" />
</jsp:include>
</body>
</html>