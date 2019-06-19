<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<jsp:useBean id="usuario" class="br.edu.infnet.model.Usuario"></jsp:useBean>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuário</title>
    </head>
    <body>
        <f:form action="${pageContext.request.contextPath}/usuario/criar" method="POST" modelAttribute="usuario">
            
        </f:form>
    </body>
</html>
