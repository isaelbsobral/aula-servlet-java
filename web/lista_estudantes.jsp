

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %><!--importando biblioteca de formatar-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estudantes Cadastrados</title>
    </head>
    <body>
        
        <%@include file="menu.jsp" %><!--add arquivos na página-->
         <h4>Estudantes Cadastrados</h4>
        <c:forEach items="${estudantes}" var="estudante"> <!--criando variaveis q receberão os valores das expressoes-->
            <fmt:formatDate value="${estudante.dataNascimento}" pattern="dd/MM/yyyy" var="dataFormatada"/>
            <li>${estudante.nome} ${dataFormatada} </li>
            
        </c:forEach>
        
        
    </body>
</html>
