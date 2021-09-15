
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ordenação de Estudantes por nome</title>
    </head>
    <body>
        
        <%@include file="menu.jsp"%>
        <h4>Nome dos estudantes</h4>
         <c:forEach items="${ordenar}" var="estudante"> <!--criando variaveis q receberão os valores das expressoes-->
           <!--- <fmt:formatDate value="${estudante.dataNascimento}" pattern="dd/MM/yyyy" var="dataFormatada"/>--->
            <li>${estudante.nome} ${dataFormatada} </li>
            
        </c:forEach>
    </body>
</html>
