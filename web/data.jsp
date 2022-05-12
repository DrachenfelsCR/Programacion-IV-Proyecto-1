<%-- 
    Document   : data
    Created on : abr 22, 2021, 1:54:33 a.m.
    Author     : beto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <%
            String id = request.getParameter("id");
            String password = request.getParameter("pswrd");
            String email = request.getParameter("email");
            String phoneNumber = request.getParameter("phoneNumber");
            String user_name = request.getParameter("user_name");
Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection miConexion = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto1?useSSL=false&user=root&password=root&serverTimezone=UTC");
java.sql.Statement miStatement = miConexion.createStatement();
String rol="Student";
String instruccionSql = "INSERT INTO USUARIO(id,clave,rol,email,telefono,user_name) VALUES('"+ id +"','"+ password +"','"+ rol +"','"+email+"','"+phoneNumber+"','"+user_name+"')";
miStatement.executeUpdate(instruccionSql);        
        %>
    </body>
</html>
