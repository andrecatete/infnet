<%@page import="br.edu.infnet.model.Livro"%>
<jsp:useBean id="livro" scope="request" class="Livro"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Livro</title>
    </head>
    <body>
        <h1>Livro</h1>
        <div>
            <span>ISBN:${livro.isbn}</span><br />
            <span>TITULO:${livro.titulo}</span><br />
            <span>PRECO:${livro.preco}</span><br />
            <span>ESTOQUE:${livro.estoque}</span><br />            
        </div>
    </body>
</html>
