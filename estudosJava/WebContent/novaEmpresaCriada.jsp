<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:url value="/formNovaEmpresa.jsp" var="FormNovaEmpresa"/>
<c:url value="/listaEmpresas" var="lista"/> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<a href="${FormNovaEmpresa}">cadastrar novas empresas</a></br>
<a href="${lista}">exibir empresas cadastradas</a></br></br></br>

<c:if test="${not empty empresa}">
Empresa: ${ empresa } cadastrada com sucesso!<!-- ele procura pelo atributo empresa --> 
Data de abertura: ${dataAbertura}
</c:if>

<c:if test="${empty empresa}">
Nenhuma empresa cadastrada<!-- ele procura pelo atributo empresa --> 
</c:if>

   


</body>
</html>