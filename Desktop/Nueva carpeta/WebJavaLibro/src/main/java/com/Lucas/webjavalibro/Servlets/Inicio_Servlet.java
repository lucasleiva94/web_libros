
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Genero;
import com.Lucas.webJabalibro.model.entities.Libro;
import com.Lucas.webJabalibro.model.entities.Usuarios;
import com.Lucas.webjavalibro.model.dao.GenerosDAO;
import com.Lucas.webjavalibro.model.dao.LibrosDAO;
import com.Lucas.webjavalibro.model.dao.UsuariosDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Inicio_Servlet", urlPatterns = {"/index.html"})
public class Inicio_Servlet extends HttpServlet {

    

    
    
    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //paso listado de libros entero
        LibrosDAO librosDAO = new LibrosDAO();
        ArrayList<Libro> listalibros = librosDAO.getlistadolibro();
        
        
        request.setAttribute("listalibros", listalibros);
        
        //
        
        //paso listado de libros por puntuacion
        
        ArrayList<Libro> librospunt = librosDAO.getlistadoporpunt();
        
        
        request.setAttribute("librospunt", librospunt);
        
        
        //
        
        
        GenerosDAO  generosDAO = new  GenerosDAO();
        ArrayList<Genero> listagenero = generosDAO.getlistadogenero();

        request.setAttribute("listagenero", listagenero);
        
        
               HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));

        request.getRequestDispatcher("inicio.jsp").forward(request, response);
     
    }

    
    
    
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         //paso lista de librois entera
        LibrosDAO librosDAO = new LibrosDAO();
                
        ArrayList<Libro> listalibros = librosDAO.getlistadolibro();
        
        request.setAttribute("listalibros", listalibros);
        //
        
        
                //paso listado de libros por puntuacion
        
        ArrayList<Libro> librospunt = librosDAO.getlistadoporpunt();
        
        
        request.setAttribute("librospunt", librospunt);
        
        
        //
        
        
        
        //paso lista de generos
        
        GenerosDAO  generosDAO = new  GenerosDAO();
        
        ArrayList<Genero> listagenero = generosDAO.getlistadogenero();

         request.setAttribute("listagenero", listagenero);
          // 
         
         // creacion de cuenta


         
        UsuariosDAO userDAO = new UsuariosDAO();
        Usuarios guardaruser = new Usuarios();


     String nombre      = request.getParameter("nombre_modal");
     String apellido    = request.getParameter("apellido_modal");
     String mail_crea   = request.getParameter("mail_modal");
     String contra_crea = request.getParameter("contra_modal");
     String nick        = request.getParameter("nick_modal"); 
     
     

     
     
     
     
     guardaruser.setNombre(nombre);
     guardaruser.setApellido(apellido);
     guardaruser.setMail(mail_crea);
     guardaruser.setNick(nick);
     guardaruser.setContraseña(contra_crea);
     
     
     userDAO.guardarusuario(guardaruser);
     
     
     //termina creacion de cuentas
     
       HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));
      
      
      
    request.getRequestDispatcher("inicio.jsp").forward(request, response);
         
      
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
