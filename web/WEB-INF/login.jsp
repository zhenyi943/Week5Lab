<%-- 
    Document   : login
    Created on : Oct 2, 2019, 1:10:53 PM
    Author     : 797494
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <br>
        <form action="login" method="post">
        <label>Username </label>&nbsp;<input type="text" size="20" name="username">
        <br>
        <label>Password </label>&nbsp;<input type="text" size="20" name="password" value="${password}">
        <br>
        <input type="submit" value="Login">
        ${message}
        </form>
    </body>
</html>
