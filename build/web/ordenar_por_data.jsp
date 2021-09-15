<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ordenação de Estudantes por data de nascimento</title>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <h4>Estudantes por Data de Nascimento</h4>
        <c:forEach items="${ordenar_data}" var="estudanteData"> <!--criando variaveis q receberão os valores das expressoes-->
           <!--- <fmt:formatDate value="${estudanteData.dataNascimento}" pattern="dd/MM/yyyy" var="dataFormatada"/>--->
            <li>${dataFormatada} ${estudanteData.nome}  </li>
            
        </c:forEach>
    </body>
</html>
