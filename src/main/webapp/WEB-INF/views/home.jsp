<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<link rel="shortcut icon"
	href="https://img.icons8.com/color/48/000000/popcorn.png"
	type="image/x-icon" />

<title>Brq Filmes</title>

</head>

<body class="p-3 mb-2 bg-secondary text-black">
	<div class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/projeto-jsp-base/home"> <img
				src="https://scontent.fcgh2-1.fna.fbcdn.net/v/t1.6435-9/s110x80/49444806_374312119969630_907610255607726080_n.png.webp?_nc_cat=110&ccb=1-5&_nc_sid=24aabd&_nc_ohc=v5kx8oqI6OMAX-voAAe&_nc_ht=scontent.fcgh2-1.fna&uss=0a8e76d2a6b24051&odm=YnJxZGlnaXRhbC53b3JrcGxhY2UuY29t&oe2=6143B41A&oh=8e34257f565cad12da0973e0de39e4f3&oe=611D8E7A"
				alt="" width="75" height="50" class="d-inline-block align-text-top">
				BRQ Filmes
				<div>
					<a class="btn btn-primary" href=projeto-jsp-base/favoritos
						role="button">Favoritos</a>
				</div>
			</a>
		</div>
	</div>
	<p></p>
	<div >
		<button type="button" class="btn btn-lg btn-primary" disabled>Filmes</button>
	</div>
	<p></p>
	<div>
		<div class="row g-2">
			<c:forEach items="${listaFilmes}" var="filme" varStatus="loop">
				<a class="none" href="detalharfilme/${filme.getIdFilme()}">
					<div class="card" style="width: 17rem;">
						<img href="detalharfilme/${filme.getIdFilme()}"
							class="card-img-top" src="${filme.getPoster()}">
					</div>
				</a>
			</c:forEach>
		</div>
	<p></p>
	<div >
		<button type="button" class="btn btn-lg btn-primary" disabled>Serie</button>
	</div>
	<p></p>
		<div class="row g-2">
			<c:forEach items="${listaSerie}" var="serie" varStatus="loop">
				<a class=none href="detalharserie/${serie.getId()}">
					<div class="card" style="width: 17rem;">
						<img href="detalharserie/${serie.getId()}" class="card-img-top"
							src="${serie.getPoster()}">
					</div>
				</a>
			</c:forEach>
		</div>
	</div>
	</div>
</body>
</html>