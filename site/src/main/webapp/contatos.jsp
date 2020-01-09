<%@ page import="br.com.site.dao.ContatoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.*"%>
<%@ page import="br.com.site.dao.*"%>
<%@ page import="br.com.site.entidades.Contato"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:useBean id="contatoDAO" class="br.com.site.dao.ContatoDAO" />


<title>Página de contatos</title>
</head>
<body>

	<table>
		<c:forEach var="contato" items="${contatoDAO.selecionar()}">
			<tr>
				<td>${contato.nomeContato }</td>
			</tr>
		</c:forEach>
	</table>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>