<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Agenda</title>
	</head>
	<body>
		<form action="ServletAgenda" method="get">
			<h3>AGENDA</h3>
			<table>
				<tr>
					<td>Nome</td>
					<td><input type="text" name="nome"/></td>
				</tr>
				<tr>
					<td>Telefone</td>
					<td><input type="text" name="telefone"/></td>
				</tr>
				<tr>
					<td>Data Nascimento</td>
					<td><input type="text" name="data"/></td>
				</tr>
					
					<td>
						<input type="submit" value="enviar"/>
					</td>
			</table>
				
		</form>
	</body>
</html>