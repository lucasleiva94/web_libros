
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
import javax.servlet.http.HttpSession;


@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

   


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
//        iniciar sesion

         ArrayList<Usuarios> listausuarios = new UsuariosDAO().getlistausuarios();
        
         String mail   = request.getParameter("mail_modal");
         String contra = request.getParameter("contra_modal");
         
         
         
         
         HttpSession session = request.getSession();
         
         
         
         
         
         
     for (Usuarios usuarios : listausuarios) {

                   

         if  (mail.equals( usuarios.getNick() ) && contra.equals(usuarios.getContraseña()) )    {
             
             
             int id_de = usuarios.getUsuario_id();
             String id_de_usuario= Integer.toString(id_de);
             
             
             
             
             session.setAttribute("user", id_de_usuario);
             
             //System.out.println("el id del usuario es " + id_de);
             
             System.out.println("se logeo");
             System.out.println("el usuario es " + session.getAttribute("user"));
             
             
             
             
             request.setAttribute("user", session.getAttribute("user"));
             
             request.getRequestDispatcher("/index.html").forward(request, response);
             
             
                      }
                 }
     
            String error = "asd";
     
           request.setAttribute("error", error);
           request.getRequestDispatcher("/index.html").forward(request, response);
           
           System.out.println("no se logeo");
    }

    
    
    
    
    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
                HttpSession session = request.getSession();

       if (session.getAttribute("user") != null ){
       
       
       
       
        request.getRequestDispatcher("index.html").forward(request, response);
       
       
       }else{
       
       
                   request.getRequestDispatcher("index.html").forward(request, response);

       
       }
           
}

                         
                                  

     
     
     
         
    


    @Override
    
    public String getServletInfo() {
        return "Short description";
                                    }
    
    
}
    
        
        
    
    
                            

