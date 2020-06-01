
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Libro;
import com.Lucas.webJabalibro.model.entities.Puntuacion;
import com.Lucas.webjavalibro.model.dao.LibrosDAO;
import com.Lucas.webjavalibro.model.dao.PuntuacionDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "unlibro_servlet", urlPatterns = {"/unlibro"})
public class unlibro_servlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String id = request.getParameter("ID");
        int id_libro = Integer.parseInt(id);
        
        
        LibrosDAO librosDAO = new LibrosDAO();
        
        Libro libro2 = librosDAO.getlibro(id_libro);
        

      
        
        request.setAttribute("libro2", libro2);
        
        
//        sesion
        
                
      HttpSession session = request.getSession();
     request.setAttribute("user", session.getAttribute("user"));
      
       
      
      //pasarle puntuacion
      
              PuntuacionDAO puntuacionDAO = new PuntuacionDAO();
           
          
          int puntuacion = puntuacionDAO.getstringpunt(id_libro);
          String numCadena= Integer.toString(puntuacion);
          

          request.setAttribute("puntuacion", numCadena );
            
            
      
      
      //
        
        
       
        
        request.getRequestDispatcher("unlibro.jsp").forward(request, response);
        

        
    }
    


    
    
    
    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //obtener el id del usuario
      HttpSession session = request.getSession(true);
      
      String id_usuario = (String)session.getAttribute("user");
      int id_usuario_conv = Integer.parseInt(id_usuario);
      
      
      
     System.out.println("el usuario en unlibro es " + id_usuario);
        
        
     
     
        //int id = session.getAttribute("user");
        
      
        //int id_usuario = session.getAttribute("usuario_id");
        
        
        //obtener id del libro
        String id_libro = request.getParameter("id_libro");
        int id_libro_conv = Integer.parseInt(id_libro);
        
        System.out.println("el id del libro es de " + id_libro_conv);
        
        
        ///obtener el id de la puntuacion
        String parametro = request.getParameter("accion");
        int puntuacion_conv = Integer.parseInt(parametro);
        
        
        
             PuntuacionDAO puntuacionDAO = new PuntuacionDAO();
              Puntuacion guardarpuntuacion = new Puntuacion();
            
            
            int id_user_punt        = id_usuario_conv;
            int id_libro_punt       = id_libro_conv;
            int puntuacion     = puntuacion_conv;

            

            
            
          

          
 
                    guardarpuntuacion.setId_user_punt(id_user_punt);
                    guardarpuntuacion.setId_libro_punt(id_libro_punt);
                    guardarpuntuacion.setPuntuacion(puntuacion);

                    puntuacionDAO.guardapuntuacion(guardarpuntuacion);
        
        

        
        System.out.println("la data es " + parametro);
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
