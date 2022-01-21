
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Genero;
import com.Lucas.webJabalibro.model.entities.LibroXgenero;
import com.Lucas.webjavalibro.model.dao.GenerosDAO;
import com.Lucas.webjavalibro.model.dao.libroXgeneroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "genero_sandbox", urlPatterns = {"/sand"})
public class genero_sandbox extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        
           //subir los genero                
        GenerosDAO  generosDAO = new  GenerosDAO();
        ArrayList<Genero> listagenero = generosDAO.getlistadogenero();
  
        request.setAttribute("listagenero", listagenero); 
        
        //fin subir los genero
        
  
        
         //subir genero del libro
        libroXgeneroDAO libroxgeneroDAO = new libroXgeneroDAO();
        
        LibroXgenero   guardarlibroxgenero = new LibroXgenero();
        

       
        String[] generos = request.getParameterValues("generos");
        
         int id_libro = 12;
        
        
        if ( generos != null ) {
            
            for (int i = 0; i< generos.length; i++) {
                
        
                
                guardarlibroxgenero.setId_libro(id_libro);
                guardarlibroxgenero.setId_genero(Integer.parseInt(generos[i]));
                
               
                
            System.out.println("los datos recontracogidos son "+generos[i]);
            
            
            libroxgeneroDAO.guardargenero(guardarlibroxgenero);
            
            
            }
        }else   { System.out.println("paso por aca esta vacio");}
        
        
        
            // fin subir genero del libro        
         
         
         
         
         

        
        
        
                    
                    
         request.getRequestDispatcher("subirgenero.jsp").forward(request, response);
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
