
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--importando o JSTL-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estudante</title>
    </head>
    <body>
        <!--chamando o prefixo q possui a biblioteca core do jstl-->
    <c:if test="${not empty estudante}"> <!--atributo estudante criado em NovoCadstrarJSTL.jsp-->
        <h3>Estudante ${estudante} cadastrado!</h3>
    </c:if> 
    <c:if test="${empty estudante}">
        <h3>Estudante não cadastrado</h3>
    </c:if>
    </body>
</html>
