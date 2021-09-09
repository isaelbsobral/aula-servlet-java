<%-- 
    Document   : cadastrar
    Created on : 09/09/2021, 09:54:06
    Author     : isael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="cadastrarEstudante" var="linkCadastrar"> </c:url>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Estudantes</title>
    </head>
    <body>
        <h1>Cadastrar Estudantes</h1> 
        
    <%@include file="menu.jsp" %>
        <form action="${linkCadastrar}" method="POST">
            <label>Nome</label><br>
            <input type="text" name="txtNome"/><br><br>
            <label> Data de Nascimento</label><br>
            <input type="text" name="txtData"/><br><br>
            <label hidden>Botão</label>
            <input type="submit" name="btnEnviar" value="Enviar"/>
        </form>
    </body>
</html>
