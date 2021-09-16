

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editando estudantes</title>
    </head>
    <body>
        <h3>Editar Estudates</h3>
        <form action="" method="POST">
            <input type="hidden" name="txtId" value="${estudante.id}">
            <label>Nome</label>
            <input type="text" name="txtNome" value="${estudante.nome}">
            <br>
            <label>Data de Nascimento</label>
            <input type="text" name="txtNascimento" value="${estudante.dataNascimento}"> 
            <br>
            <fmt:formatDate value="${estudante.dataNascimento}" pattern="dd/MM/yyy"
                            var="dataFormatada"/>
            <input type="text" name="txtData" value="${dataFormatada}"/>
            <br>
            <label hidden>Enviar</label>
            <input type="submit" name="btnEnviar" value="Enviar"/>
            
        </form>
    </body>
</html>
