/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exoticatravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 *
 * @author Administrator
 */
@WebServlet(name="TourPackageServlet", urlPatterns={"/TourPackageServlet"})
public class TourPackageServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
              
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TourPackagePage</title>");
            out.println("</head>");
            out.println("<body>");
           out.println("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>");
           out.println("<tr>");
           out.println("<td bgcolor='#000080' align='center'>");
           out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>Exotica Travels</font>");
            out.println("</td>");
                out.println("<td bgcolor='#000080' align='left' width='180'>");
                out.println("<img src='Images/CompanyLogo.png' width='180' height='120' align='right'/>");
             out.println("</td>");
               out.println("</tr>");
               out.println("</table>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td><font color='darkblue' size='+1'><a href='ConstructionServlet'>Domestic Flights</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='ConstructionServlet'>International Flights</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='ConstructionServlet'>Hotels</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='ConstructionServlet'>Car Rentals</a></td>");
            out.println("<td><font color='darkblue' size='+1'><a href='TourPackageServlet'>Tour Packages</a></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<br>");
            out.println("<font align='center' color='darkblue' size='+1'>Please select the destination where you would like to go:");
            out.println("<br>");
            out.println("<br>");
            out.println("<form action='SessionServlet' name='MyForm' Method='POST'>");
            out.println("<table cellspacing='10' align='center'border='2' bordercolor='black'>");
            out.println("<tr>");
            out.println("<td bordercolor='white'><font color='darkblue'> Select Destination: </font></td>");
            out.println("<td bordercolor='white'>");
            out.println("<select name='Destination'>");
            out.println("<option value='Switzerland'>Switzerland</option>");
            out.println("<option value='Bahamas'>Bahamas</option>");
            out.println("<option value='Thailand'>Thailand</option>");
            out.println("<option value='Australia'>Australia</option>");
            out.println("</select>");
            out.println("<input type='hidden' value='Destination' name='PageName'");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td bordercolor='white'>");
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='submit' Value='Next'></input></a>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");              
              
                
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
