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
		<title>Müşteri formu</title>
</head>
<body>
	<div class="container">
		<div class="alert alert-warning">
			Müşteri<br /> <a href="createmusteri">Ekle</a> | <a
				href="findallmusteri">Listele</a>
		</div>
		<form:form class="form-horizontal" action="/savemusteri"
			id="musteriRegisterForm" modelAttribute="musteri" method="post">
			<div class="form-group">
				<form:label path="musteriNo" class="control-label col-sm-2"
					for="musteriNo">Müşteri no:</form:label>
				<div class="col-sm-10">
					<form:input path="musteriNo" value="${musteriObject.musteriNo}"
						class="form-control" id="musteriNo"
						placeholder="Müşteri no giriniz." name="musteriNo" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="musteriAdi" class="control-label col-sm-2"
					for="musteriAdi">Müşteri adı:</form:label>
				<div class="col-sm-10">
					<form:input path="musteriAdi" value="${musteriObject.musteriAdi}"
						class="form-control" id="musteriAdi"
						placeholder="Müşteri adı giriniz." name="musteriAdi" />
				</div>
			</div>
			<div class="form-group">
				<form:label path="musteriSoyadi" class="control-label col-sm-2"
					for="musteriSoyadi">Müşteri soyadı:</form:label>
				<div class="col-sm-10">
					<form:input path="musteriSoyadi" value="${musteriObject.musteriSoyadi}"
						class="form-control" id="musteriSoyadi"
						placeholder="Müşteri adı giriniz." name="musteriSoyadi" />
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" id="saveMusteri" class="btn btn-default">Gönder</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
