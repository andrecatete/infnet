<%@page import="br.edu.infnet.model.Cliente"%>
<%@page import="java.lang.String"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="erros" scope="request" class="java.util.ArrayList" />
<jsp:useBean id="cliente" scope="request" class="br.edu.infnet.model.Cliente" />
<!--substitui linhas 11, 12, 13-->
<% 
//        ArrayList<String> erros = request.getAttribute("erros")== null
//        ? new ArrayList<String>()        
//        : (ArrayList<String>(request.getAttribute("erros")));
//        Cliente c = request.getAttribute("cliente") == null
//        ? new Cliente()
//        : (Cliente) request.getAttribute("cliente");
%>     

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <form action="CultBookServlet" method="POST">
            nome:<input type="text" name="nome" value="<jsp:getProperty name="cliente" property="nome" />"/><br />
            email:<input type="text" name="email" value="<%=cliente.getEmail()%>"/><br />
            fone:<input type="text" name="fone" value="${cliente.fone}"/><br />
            endereço:<input type="text" name="endereco" value="<%=cliente.getEndereco()%>"/><br />
            login:<input type="text" name="login" value="<%=cliente.getLogin()%>"/><br />
            senha:<input type="text" name="senha"/><br />
            <input type="submit" name="Enviar"/><br />
        </form>
        <% 
//        ArrayList<String> erros = request.getAttribute("erros")== null
//        ? new ArrayList<String>()        
//        : (ArrayList<String>(request.getAttribute("erros")));
        %>            
        <!-- as linhas acima permitem nao ter q criar duas classes iguais, uma com msg de erro e outra sem-->
        <ul>            
            <% for(Object erro : erros) {%>
            <li><%=erro%></li> <!-- é a mesma coisa que "out.print(erro)"-->
            <% }%>
        </ul>
    </body>
</html>
