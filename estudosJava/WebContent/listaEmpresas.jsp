<%@page import="java.util.List"%>
<%@page import="br.com.alura.estudosJava.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>    
<c:url value="/formNovaEmpresa.jsp" var="fNovaEmpresa"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
<a href="${fNovaEmpresa}">cadastrar novas empresas</a></br></br>

	Lista de empresas: <br />
		<ul>
		<c:forEach items="${empresas}" var="empresa">
		<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}"/></li>
		</c:forEach>
		</ul>
	
</body>
</html>