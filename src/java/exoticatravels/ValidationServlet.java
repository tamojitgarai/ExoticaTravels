

package exoticatravels;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name="ValidationServlet", urlPatterns={"/ValidationServlet"})
public class ValidationServlet extends HttpServlet {

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

        String user=request.getParameter("uid");
        String password=request.getParameter("pwd");
        String role=request.getParameter("r1");
        if (user.equals("admin") && password.equals("password@123") && role.equals("administrator"))
        {
            HttpSession session = request.getSession();
session.setAttribute("User", user);

            RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/WelcomeAdminServlet");

	     dispatch.forward(request, response);


        }
 else {
     if (user.equals("user1") && password.equals("user1@123") && role.equals("customer"))
        {
         HttpSession session = request.getSession();
session.setAttribute("User", user);

         RequestDispatcher dispatch = getServletContext().getRequestDispatcher("/WelcomeCustomerServlet");

	     dispatch.forward(request, response);
            }
   else
     {
       out.println("<html>");
          out.println("<head>");
          out.println("<title>HomePage</title>");
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
          out.println("<font style='font-family: 'Arial Rounded MT Bold;' size='+2' color='red'>Invalid User Credentials!!");

     }
        }

 }

         finally {
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
