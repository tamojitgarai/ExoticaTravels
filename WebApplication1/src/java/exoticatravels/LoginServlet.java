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
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border='0' bgcolor='#000080' align='top' width='100' style='height:100px'>"
                    + "<tr>"
                    + "<td bgcolor='#000080' align='center'>"
                    + "<font style='font-family:'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'> Exotica Travels</font>"
                    + "</td>"
                    + "<td bgcolor=#000080' align='left' width='180'>"
                    + "<img src='Images/companyLogo.png' width='180' height='120' align='right'/>"
                    + "</td>"
                    + "</tr>"
                    + "</table>"
                    + "<form action='ValidationServlet' method='Post'>"
                    + "<table cellspacing='10' align='center'>"
                    + ""
                    + "<tr>"
                    + "<td><font color='darkblue' size='+2'>Login Form"
                    + "</tr>"
                    + "</tde>"
                    + "</table>"
                    + "<table cellspacing='10' align='center' border='2' bordercolor='black'>"
                    + "<tr><td bordercolor='white'> User Id:<td COLSPAN='2'bordercolor='white'><input type='text' name='uid'>"
                    + "<tr><td  bordercolor='white'> Password:<td COLSPAN='2'bordercolor='white'><input type='password' name='pwd'>"
                    + "<tr><td bordercolor='white'> Role:<td bordercolor='white'><input type='Radio' value='administrator' name='r1'>Administrator"
                    + "<td bordercolor='white'><input type='Radio' value='customer' name='r1'>Customer"
                    + "<tr><td bordercolor='white'></br>"
                    + "<tr><td bordercolor='white'<input type='SUBMIT' value='Submit'>"
                    + "<td bordercolor='white'<input type='RESET' value='Reset'>"
                    + "</table>"
                    + "</body>"
                    + "</html>");
           
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
