<%@page import="cursosLibres.logic.UserStudent"%>
<%@page import="java.sql.SQLException"%>
<%@page import="cursosLibres.data.databaseConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cursos libres registro de usuario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/Proyecto1/CSS/style-registro.css">
    </head>
    <body>
      
    <div class="center">
        <div class="header">
            Registro</div>
        <form action="/Proyecto1/register " method="POST">
            <input type="text" placeholder="Cedula" name="id">
            <input type="text" placeholder="NombreCompleto" name="user_name">
            <input type="text" placeholder="Telefono" name="phoneNumber">
            <input type="text" placeholder="Correo electrónico" name="email">
            <input name="pswrd" type="password" placeholder="Contraseña">
            <input type="submit" value="Registrar" name="registroDB">
        </form>      
    </body>
</html>


