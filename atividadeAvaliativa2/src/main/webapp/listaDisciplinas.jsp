<%@page import="cadastrarDisciplina.cadastrarDiscipl" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de disciplinas</title>

</head>
<body>
	<h3> Lista de disciplinas e nota</h3>
<table border ="2">
	<tr>
		<td>Disciplina</td>
		<td>nota</td>
		<td>Situacao</td>
	</tr>
	<% 
	
	List<cadastrarDiscipl> disciplinas = (List<cadastrarDiscipl>) request.getAttribute("lista");
		for(cadastrarDiscipl cadi : disciplinas){			
		
	%>
	<tr>
		<td><%=cadi.getNomeDi() %> </td><br/>
		<td><%=cadi.getNota1() %> </td><br/>
		<td><%=cadi.getSituacao() %> </td><br/>
	</tr>
	<%
	}
	%>
</table>	
	<form>
	<a href="cadastroDisciplinas.jsp">Voltar</a><br><br>
	
	</form>
		<jsp:include page="header.jsp">
    <jsp:param name="teste" value="Parâmetro de teste" />
</jsp:include>
</body>
</html>