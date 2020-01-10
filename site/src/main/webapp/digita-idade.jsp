<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
	<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" />
  
<title>Digita idade</title>
</head>
<body>

	<h2>Digite sua idade e pressione o botão:</h2>
	
	<form action="mostra-idade.jsp">
		Idade: <input type="text" name="idade"/>
		
		<input type="submit" class="btn btn-secondary"/>
	
	</form>
</body>
</html>