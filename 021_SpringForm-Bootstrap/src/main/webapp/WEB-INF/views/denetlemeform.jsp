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
<head>
<title>Home</title>
</head>
<body>
<div class="container">
  <div class="jumbotron">
    <h1>Hoşgeldin sayın misafir!</h1>      
    <p>Hayırlı günler dileriz.</p>
  </div>
  <p>Kullanıcı adı ve şifreni gir.</p>      
  <p>Aşağıdaki formu doldur.</p>   
  <form:form action="/sonuc" commandName="kullanici">
		<div class="form-group">
			<label for="email">Kullanıcı adı:</label>
			<form:input path="kullaniciAdi" class="form-control" id="user"
				placeholder="kullanıcı adı gir" name="user" />
			<font color="red"><form:errors path="kullaniciAdi" /></font>
		</div>
		<div class="form-group">
			<label for="pwd">Şifre:</label>
			<form:password path="sifre" class="form-control" id="email"
				placeholder="Şifreyi gir" name="email" />
			<font color="red"><form:errors path="sifre" /></font>
		</div>
		<button type="submit" class="btn btn-primary">Gönder</button>
	</form:form>   
</div>
	
</body>
</html>
