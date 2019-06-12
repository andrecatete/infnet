<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.edu.infnet.model.Livro"%>
<jsp:useBean id="livros" scope="request" class="java.util.ArrayList"></jsp:useBean>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Livros</title>
    </head>
    <body>
        <h1>Livros</h1>
        
        <table border="1">
            <thead>
                <tr>
                    <th>Isbn</th>
                    <th>Titulo</th>
                    <th>Preco</th>
                    <th>Estoque</th>
                    <th>--</th>
                </tr>
            </thead>
            <tbody>   
            <c:if test="${empty(livros)}">
                Nenhum livro encontrado!
            </c:if>
                
                <c:forEach var="livro" items="${livros}">                    
                    <tr>
                        <td>${livro.isbn}</td>
                        <td>${livro.titulo}</td>
                        <td>${livro.preco}</td>
                        <td>${livro.estoque}</td>                    
                        <td><a href="CultBookServlet?tarefa=detalhar&isbn=${livro.isbn}">ver detalhe</a></td>
                    </tr>
                </c:forEach>
            </tbody>            
        </table>
    </body>
</html>
