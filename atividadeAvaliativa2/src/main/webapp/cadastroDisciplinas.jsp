<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro disciplinas e nota</title>
</head>
<body>
	<h2> Cadastro de disciplinas e nota</h2>                       <%-- Tela para cadastrar as disciplinas e notas --%>
	<form action="control" method="post">
		<input type="hidden" name="ac" value="confirmarCadastro">
		Nome da disciplina: <input type="text" id="addDisciplina" name="nomeDi"><br>
		Nota: <input type="text" id="nota" name="nota1"><br>       
		
		<input type="submit" value="Cadastrar">						 <%-- Quando clicar no bot�o cadastrar enviar os dados para a control.java --%>
	</form>
	<a href="control">Voltar</a><br><br>

		<jsp:include page="header.jsp">
    <jsp:param name="teste" value="Par�metro de teste" />
</jsp:include>
</body>
</html>