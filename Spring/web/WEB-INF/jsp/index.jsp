<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>

    <body>
        <form action="${pageContext.request.contextPath}/login" method="POST">
            <fieldset style="width:300; margin:auto">
                <legend>Login</legend>
                <br />
                Usuário: <input type="text" name="login" /><br>
                Senha: <input type="password" name="senha" /><br>
                <input type="submit" name="entrar" style="float:right"><br>
                <a href="${pageContext.request.contextPath}/login">cadastre-se<a>                        
            </fieldset>
        </form>
    </body>
</html>
