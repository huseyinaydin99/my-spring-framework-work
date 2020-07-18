<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Müşteri listesi</title>
</head>
<body>
	<c:if test="${empty musteriListesi}">
		Henüz kayıt yok
	</c:if>
	<c:if test="${not empty musteriListesi}">
		<div class="container">
			<div class="alert alert-warning">
				Müşteri<br /> <a href="createmusteri">Ekle</a> | <a
					href="findallmusteri">Listele</a>
			</div>
			<form class="form-horizontal" action="/searchmusteri" method="post">

				<div class="form-group">
					<label path="musteriAdi" class="control-label col-sm-2"
						for="musteriAdi">Müşteri adı:</label>
					<div class="col-sm-10">
						<input type='text' class="form-control"
							placeholder="Müşteri adı giriniz." name='searchAdi'
							id='searchAdi' />
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" id="saveMusteri" class="btn btn-default">Ara</button>
					</div>
				</div>
			</form>


			<table class="table">
				<thead>
					<tr>
						<th>Id:</th>
						<th>Adı:</th>
						<th>Soyadı:</th>
						<th>No:</th>
						<th>Düzenle:</th>
						<th>Sil:</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${musteriListesi}" var="m">
						<tr>
							<th><c:out value="${m.musteriId}"></c:out></th>
							<th><c:out value="${m.musteriAdi}"></c:out></th>
							<th><c:out value="${m.musteriSoyadi}"></c:out></th>
							<th><c:out value="${m.musteriNo}"></c:out></th>
							<th><a
								href="/editmusteri?musteriId=<c:out value='${m.musteriId}' />">Düzenle</a></th>
							<th><a
								href="/deletemusteri?musteriId=<c:out value='${m.musteriId}' />">Sil</a></th>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:if>
</body>
</html>
