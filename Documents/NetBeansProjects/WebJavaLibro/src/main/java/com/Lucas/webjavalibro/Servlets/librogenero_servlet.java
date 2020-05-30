
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Genero;
import com.Lucas.webJabalibro.model.entities.Libro;
import com.Lucas.webjavalibro.model.dao.GenerosDAO;
import com.Lucas.webjavalibro.model.dao.LibrosDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "librogenero_servlet", urlPatterns = {"/librogenero"})
public class librogenero_servlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
//        
        String id = request.getParameter("ID");
        int id_genero = Integer.parseInt(id);
        
//        
        LibrosDAO librosDAO = new LibrosDAO();
            ArrayList<Libro> librobygenero = librosDAO.getlibrobygenero(id_genero);
            request.setAttribute("librobygenero", librobygenero);
            
            
             
             
//            
        GenerosDAO  generosDAO = new  GenerosDAO();
             ArrayList<Genero> listagenero = generosDAO.getlistadogenero();
             request.setAttribute("listagenero", listagenero);
        
      
        
         
                HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));
        
        request.getRequestDispatcher("librogenero.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        
        

        
        request.getRequestDispatcher("librogenero.jsp").forward(request, response);
    }

 

}
