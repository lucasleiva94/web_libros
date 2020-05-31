
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Libro;
import com.Lucas.webjavalibro.model.dao.LibrosDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "busqueda_servlet", urlPatterns = {"/busqueda"})
public class busqueda_servlet extends HttpServlet {

    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
       HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));

       
        LibrosDAO librosDAO = new LibrosDAO();
        
        String nombre = request.getParameter("nombre");
        
        ArrayList<Libro> librosbynombre = librosDAO.getlistalibrobytitulo(nombre);
        
        
        request.setAttribute("librosbynombre", librosbynombre);
        
             //System.out.println(nombre);
             
          request.getRequestDispatcher("busqueda.jsp").forward(request, response);
        
    }
    
    
    
    


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        
        
        request.getRequestDispatcher("busqueda.jsp").forward(request, response);

    }

   


}
