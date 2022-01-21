
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Genero;
import com.Lucas.webjavalibro.model.dao.GenerosDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Genero_servlet", urlPatterns = {"/Genero"})
public class Genero_servlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {




            GenerosDAO  generosDAO = new  GenerosDAO();
            
            ArrayList<Genero> listagenero = generosDAO.getlistadogenero();

            System.out.println("pas opor aca ");
            
         request.setAttribute("listagenero", listagenero);
      
         
//         sesion
      HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));
         
            
         request.getRequestDispatcher("generos.jsp").forward(request, response);
         
   

    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
