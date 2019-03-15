<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Lista Filme</title>
</head>
<body>
Listando Filme:
<br>
Url da Imagem: ${filme.capa}
<!-- <img src=${detalhes.capa}/><br> -->
<br>
Nome: ${filme.titulo}<br>
Ano: ${filme.ano}<br>
Rated:	${filme.rated}}<br>
Lançamento:	${filme.lancamento}<br>
Tempo:	${filme.tempo}<br>
Genero:	${filme.genero}<br>
Diretor:	${filme.diretor}<br>
Escritor:	${filme.escritor}<br>
Atores:	${filme.atores}<br>
Descrição:	${filme.descricao}<br>
Linguagem:	${filme.linguagem}<br>
Pais:	${filme.pais}<br>
Oscar:	${filme.oscar}<br>
	
	<table border="1">
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
	</table>
Metascore:	${filme.metascore}<br>
ImdbRating:	${filme.imdbRating}<br>
ImdbVotes:	${filme.imdbVotes}<br>
ImdbId:	${filme.imdbID}<br>
Tipo:	${filme.tipo}<br>
DVD:	${filme.dvd}<br>
Box Office:	${filme.boxOffice}<br>
Produção:	${filme.production}<br>
Website:	${filme.website}<br>
Response:	${filme.response}<br>

</body>
</html>