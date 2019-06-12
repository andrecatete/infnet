<%@page import="java.util.ArrayList"%>
<%@page import="br.edu.infnet.model.Livro"%>
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
                
                <%
                ArrayList<Livro> livros = (ArrayList<Livro>)request.getAttribute("livros");
                for(Livro livro : livros){ %>
                    
                <tr>
                    <td><%=livro.getIsbn()%></td>
                    <td><%=livro.getTitulo()%></td>
                    <td><%=livro.getPreco()%></td>
                    <td><%=livro.getEstoque()%></td>
                    <td><a href="CultBookServlet?tarefa=detalhar&isbn=<%=livro.getIsbn()%>">ver detalhe</a></td>
                </tr>
                <%
                }
                %>
                
                
            </tbody>            
        </table>
    </body>
</html>
