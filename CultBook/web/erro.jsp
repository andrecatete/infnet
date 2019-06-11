<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro</title>
    </head>
    <body>
        <h1>Erro</h1>

        <% 
        ArrayList<String> erros = (ArrayList<String>)request.getAttribute("erros");        
        %>            
        
        <ul>            
            <% for(String erro : erros) {%>
            <li><%=erro%></li> <!-- é a mesma coisa que "out.print(erro)"-->
            <% }%>
        </ul>
            
    </body>
</html>
