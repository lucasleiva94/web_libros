
package com.Lucas.webjavalibro.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "logout_servlet", urlPatterns = {"/logout"})
public class logout_servlet extends HttpServlet {





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
               HttpSession session = request.getSession();
               session.invalidate();
        
         request.getRequestDispatcher("index.html").forward(request, response);
        
        
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
