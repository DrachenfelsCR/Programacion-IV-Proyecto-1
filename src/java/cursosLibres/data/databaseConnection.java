/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosLibres.data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class databaseConnection {
    
    private static databaseConnection connector = null;

    public databaseConnection() {
       
    }
    
    public static databaseConnection getInstance()
    {
     if (connector == null) {
            connector = new databaseConnection();
        }
     return connector;
    }       
    
    public Statement getConnection() throws SQLException
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(databaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
       java.sql.Connection dbConnection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto1?useSSL=false&user=root&password=root&serverTimezone=UTC");
       java.sql.Statement dbStatement = dbConnection.createStatement();
        return dbStatement;
    };  
    

/* Plantilla, NO BORRAR
 
 Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection miConexion = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto1?useSSL=false&user=root&password=root&serverTimezone=UTC");
java.sql.Statement miStatement = miConexion.createStatement();
String rol="Student";
String instruccionSql = "INSERT INTO USUARIO(id,clave,rol,email,telefono,user_name) VALUES('"+ id +"','"+ password +"','"+ rol +"','"+email+"','"+phoneNumber+"','"+user_name+"')";
miStatement.executeUpdate(instruccionSql); */ 
}
