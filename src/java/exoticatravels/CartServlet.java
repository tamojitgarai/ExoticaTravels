/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exoticatravels;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name="CartServlet", urlPatterns={"/CartServlet"})
public class CartServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void displayCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter pw = response.getWriter();
        HttpSession session = request.getSession(false);
        String destination = session.getAttribute("selDestination").toString();
        String hotel = session.getAttribute("selHotel").toString();
        String totalDays = session.getAttribute("numDays").toString();
        String Airline = session.getAttribute("selAirline").toString();
        pw.println("<table>");
        pw.println("<tr><td>");
        pw.println("<font color='darkblue'>Destination: </font></td>");
        pw.println("<td><font color='darkblue'>"+destination+"</font></td></tr>");
        pw.println("<tr><td>");
        pw.println("<font color='darkblue'>Hotel: </font></td>");
        pw.println("<td><font color='darkblue'>"+hotel+"</font></td></tr>");
        pw.println("<tr><td>");
        pw.println("<font color='darkblue'>Total number of days for stay: </font></td>");
        pw.println("<td><font color='darkblue'>"+totalDays+"</font></td></tr>");
        pw.println("<tr><td>");
        pw.println("<font color='darkblue'>Airline: </font></td>");
        pw.println("<td><font color='darkblue'>"+Airline+"</font></td></tr>");
        pw.println("</table>");
   }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CartPage</title>");
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
               out.println("<font align='center' color='darkblue' size='+2'>You have added the following contents to your cart:");
               displayCart(request, response);
               

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
