
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

@WebServlet(name = "Libros_Servlet", urlPatterns = {"/Libros"})
public class Libros_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //listado de libros
           LibrosDAO librosDAO = new LibrosDAO();
           
           ArrayList<Libro> listalibros = librosDAO.getlistadolibro();

        //info de 1 libro
           Libro libro2 = librosDAO.getlibro(3);

        //guardar libro-----------
        
           Libro guardarlibro = new Libro();

        guardarlibro.setTitulo("el psicoanalista");
       
        guardarlibro.setPortada("154545454");

        librosDAO.guardar(guardarlibro);

        //-------
        request.setAttribute("listalibros", listalibros);
        request.setAttribute("libro2", libro2);
        
        //sesio
               HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));

        request.getRequestDispatcher("Listado_Libros.jsp").forward(request, response);

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
