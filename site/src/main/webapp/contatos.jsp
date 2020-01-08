<%@page import="br.com.site.dao.ContatoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*" %>
<%@ page import="br.com.site.dao.*" %>
<%@ page import="br.com.site.entidades.Contato" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de contatos</title>
</head>
<body>

<table>
	<% ContatoDAO contatoDAO = new ContatoDAO();
		List<Contato> contatos = contatoDAO.selecionar();
		
		for(Contato contato : contatos){
	%>		
		<tr>
			<td><%= contato.getNomeContato() %></td>
		</tr>	
	<%
		}
	%>
</table>
</body>
</html>