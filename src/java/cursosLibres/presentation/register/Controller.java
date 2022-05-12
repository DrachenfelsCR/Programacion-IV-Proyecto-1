/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosLibres.presentation.register;

import cursosLibres.data.databaseConnection;
import cursosLibres.logic.UserStudent;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import cursosLibres.data.databaseConnection;
/**
 *
 * @author David
 */
@WebServlet(name = "Controller", urlPatterns = {"/register"})
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             response.setContentType("text/html;charset=UTF-8");        
            //Plantilla para crear Servlets!!
           //request.setAttribute("model", new cursosLibres.presentation.register.Model(new UserStudent()));
            RequestDispatcher reqDispatcher = request.getRequestDispatcher("presentation/RegisterPageView.jsp");
            reqDispatcher.forward(request, response);
            
            
            
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Se crea conector BD
            databaseConnection connector = databaseConnection.getInstance();
             java.sql.Statement dbStatement = null;
            try {
                dbStatement = connector.getConnection();
            } 
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            //
        processRequest(request, response);
        //Introducimos estudiante en la DB         
            UserStudent nStudent = new UserStudent();
            nStudent.setId(request.getParameter("id"));
            nStudent.setName(request.getParameter("user_name"));
            nStudent.setRol("Student");
            nStudent.setEmail(request.getParameter("email"));
            nStudent.setPhoneNumber(request.getParameter("phoneNumber"));
            String password = request.getParameter("pswrd");
            
            //Insert en la DB
            if (nStudent.getId() != null && nStudent.getName() != null) {
                String instruccionSql = "INSERT INTO USUARIO(id,clave,rol,email,telefono,user_name) VALUES('"+ nStudent.getId() +"','"+ password +"','"+ "Student" +"','"+nStudent.getEmail()+"','"+nStudent.getPhoneNumber()+"','"+nStudent.getName()+"')";
                try{
                dbStatement.executeUpdate(instruccionSql);
                }
                catch(SQLException exc){
                    System.out.println(exc.getMessage());
                }
             }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
