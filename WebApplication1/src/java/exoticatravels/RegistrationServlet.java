package exoticatravels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TAMOJIT
 */
@WebServlet(urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>"
                    + "<tr>"
                    + "<td bgcolor=#000080' align='center'>"
                    + "<font style='font-family: 'Arial Rounded MT Bold',Gadget,sans-serif;'size='+4' color='#FFE4B5'> Exotica Travels</font>"
                    + "</td>"
                    + "</tr>"
                    + "</table>"
                    + "<form method='post' action='submitservlet'>"
                    + "<table cellspacing='10' align='center' border='2' bordercolor='black'>"
                    + "<tr><td bordercolor='white'>User Name:<td COLSPAN='2'bordercolor='white'><input type='text' name='tt1'>"
                    + "<tr><td bordercolor='white'>User Id:<td COLSPAN='2' bordercolor='white'>"
                    + "<input type='text' name='tt2'>"
                    + "</tr>"
                    + "<tr><td bordercolor='white'>Password:<td COLSPAN='2' bordercolor='white'>"
                    + "<input type='password' name='tt3'>"
                    + "</tr>"
                    + "<tr><td bordercolor='white'>Re-enter Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='tt4'>"
                    +"<tr><td bordercolor='white'>Address:<td COLSPAN='2' bordercolor='white'"
                    + "><input type='textArea' name='tt5'>"
                    + "<tr><td bordercolor='white'>State:<td COLSPAN='2' bordercolor='white'><input type ='text' name='tt6'");
            
            out.println("<h1>Servlet RegistrationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
