<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="atj.Sumator"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="langExt" value="en"/>
<c:if test="${param.lang!=null}">
<c:set var="langExt" value="${param.lang}"/>
</c:if>
<fmt:setLocale value="${langExt}"/>
<fmt:setBundle basename="atj.i18n.CalcBundle" var="lang" scope="session"/>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<title><fmt:message key="calc.title" bundle="${lang}"/></title>
</head>
<body>

<jsp:useBean type="atj.SumatorVO" id="vo" scope="request" />

<div class="container">
<h2><b><fmt:message key="arguments.add two numbers" bundle="${lang}"/></h2></b>

<form method="post" class="was-validated">

    <div class="form-group">
      <label for="uname">arg0:</label>
      <input type="text" class="form-control" id="arg0" placeholder="Enter arg0" name="arg0" value="${vo.arg0}" required >
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>

    <div class="form-group">
      <label for="uname">arg1:</label>
      <input type="text" class="form-control" id="arg1" placeholder="Enter arg0" name="arg1" value="${vo.arg1}" required >
      <div class="valid-feedback">Valid.</div>
      <div class="invalid-feedback">Please fill out this field.</div>
    </div>
    <input type="submit" name="btn" value="<fmt:message key="calc.calculate" bundle="${lang}"/>" class="btn btn-primary">
</form>

<br>

<h2><fmt:message key="calc.choose" bundle="${lang}"/></h2>
<a href="CalcServlet?lang=en">
<fmt:message key="calc.english" bundle="${lang}"/>
</a>
&nbsp;
<a href="CalcServlet?lang=pl">
<fmt:message key="calc.polish" bundle="${lang}"/>
</a>
&nbsp;
<a href="CalcServlet?lang=de">
<fmt:message key="calc.german" bundle="${lang}"/>
</a>

</div>