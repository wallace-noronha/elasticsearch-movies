<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Filme</title>
</head>
<body>
<h1>Listando Filme:</h1>
<br>

<table border = "1">
	<thead>
		<tr>
			<th>Id</th>
			<th>Ano</th>
			<th>Título</th>
			<th>Genero</th>
			<th>Rating</th>
			<th>Nota</th>
		</tr>
	</thead>
		<tbody>
			<c:forEach var="filme" items="${filmes}">
				<tr>
					<td>${filme.id}</td>
					<td>${filme.ano}<br></td>
					<td><a href="/filme/${filme.id}"> ${filme.titulo} </a> <br> <img src="${filme.capa}" width="15%"/> </td>					
					<td>${filme.genero}<br></td>
					<td>
						<c:forEach var="rating" items="${filme.ratings}">	
							${rating.source}<br>
						</c:forEach>
					</td>
					<td>
						<c:forEach var="rating" items="${filme.ratings}">	
							${rating.value}<br>
						</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>