<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<form action="ServletLogin" method="post">
			<td><input type="text" name="usuario"/></td><br>
			<td><input type="password" name="senha"/></td>
			<input type="submit" value="Autenticar">
		</form>
</body>
</html>