<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<html>
<head>
	<title>Home</title>
</head>
<body>
<form:form action="/sonuc" commandName="kullanici">
	<form:input path="kullaniciAdi" /><br />
	<form:password path="sifre" /><br />
	<input type="submit" value="Gönder" /><br />
	<form:errors path="kullaniciAdi" />
	<form:errors path="sifre" />
</form:form>
</body>
</html>
