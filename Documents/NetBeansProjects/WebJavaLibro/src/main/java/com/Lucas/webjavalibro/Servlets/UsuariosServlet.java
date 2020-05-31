
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Usuarios;
import com.Lucas.webjavalibro.model.dao.UsuariosDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UsuariosServlet", urlPatterns = {"/Usuarios"})
public class UsuariosServlet extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
      UsuariosDAO usuariosDAO = new UsuariosDAO();
      ArrayList<Usuarios> listausuarios = usuariosDAO.getlistausuarios();
        
      
      request.setAttribute("listausuarios", listausuarios);

      request.getRequestDispatcher("usuarios.jsp").forward(request, response);
        
 
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
