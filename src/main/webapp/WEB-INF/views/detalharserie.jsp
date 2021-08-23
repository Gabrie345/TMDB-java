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
				width="50" height="40" class="d-inline-block align-text-top">
				BRQ Filmes
				<div>
					<a class="btn btn-primary" href="https://google.com" role="button">Favoritos</a>
				</div>
			</a>
		</div>
	</div>

	<div class="container">
		<div class="jumbotron mb-0">
			<div class="card">
				<div class="card-header">
					<h4>${serie.getTitulo()}</h4>
				</div>
				<div class="card-body">
					<div class="row">
						<div class="col-12 col-sm-8 mb-3">
							<div class="row ">
								<div class="col-md-6">
									Titulo Original: <span>${serie.getTituloOriginal()}</span> <span></span>
								</div>
								<div class="col-md-6">
									Data da lançamento: <span>${serie.getDataLancamento()}</span>
								</div>
							</div>
							<div>Descrição</div>
							<div>
								<textarea class="form-control" id="disabledInput" rows="10"
									disabled="">${serie.getDescricao()}</textarea>
							</div>
						</div>
						<div class="col-12 col-sm-4">
							<div>
								<a> <img class="img-fluid" style="height: 50%"
									src="${serie.getPoster()}" />
								</a>
								<div>
									<p>
										Avaliação:&#x2B50;<span>${serie.getVotos()}</span>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>