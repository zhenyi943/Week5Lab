/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;
        
/**
 *
 * @author 797494
 */
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
  HttpSession session = request.getSession();
        String username = (String) session.getAttribute("admin");
        String logout = request.getParameter("logout");

        if (logout == null) {
            if (username != null) {
                response.sendRedirect("home");
            } else {
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                        .forward(request, response);
            }
        } else if (logout.equals("")) {
            session.invalidate();
            request.setAttribute("message", "You have successfully logged out");

            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);
        }
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession();
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         User a=AccountService.Login(username, password);
         if (a==null)
         {
            request.setAttribute("message", "Invalided"); 
             getServletContext()
                    .getRequestDispatcher("/WEB-INF/login.jsp")
                    .forward(request, response);
         }
         else {
            session.setAttribute("user", a.getUsername());
            session.setAttribute("username", username);
            session.setAttribute("message", username);
            response.sendRedirect("home");
         }
        
        
        
    }

}
