
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Puntuacion;
import com.Lucas.webjavalibro.model.dao.PuntuacionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Puntuacion_serlvet", urlPatterns = {"/Puntuacion"})
public class Puntuacion_serlvet extends HttpServlet {




 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
       request.getRequestDispatcher("prueba_punt.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        String parametro = request.getParameter("accion");
        int puntuacion_conv = Integer.parseInt(parametro);
        
        
        
             PuntuacionDAO puntuacionDAO = new PuntuacionDAO();
               Puntuacion guardarpuntuacion = new Puntuacion();
            
            
            int id_user_punt        = 1;
            int id_libro_punt       = 1;
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
