
package com.Lucas.webjavalibro.Servlets;

import com.Lucas.webJabalibro.model.entities.Autores;
import com.Lucas.webJabalibro.model.entities.Genero;
import com.Lucas.webJabalibro.model.entities.Libro;
import com.Lucas.webJabalibro.model.entities.LibroXautor;
import com.Lucas.webJabalibro.model.entities.LibroXgenero;
import com.Lucas.webJabalibro.model.entities.Sandbox;
import com.Lucas.webjavalibro.model.dao.AutorXibroDAO;
import com.Lucas.webjavalibro.model.dao.AutoresDAO;
import com.Lucas.webjavalibro.model.dao.GenerosDAO;
import com.Lucas.webjavalibro.model.dao.LibrosDAO;
import com.Lucas.webjavalibro.model.dao.libroXgeneroDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "subir_libro_servlet", urlPatterns = {"/subir"})
public class subir_libro_servlet extends HttpServlet {





    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

                    
      HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));
                    
  
                            

        
                    
                    
                    
                    
         GenerosDAO  generosDAO = new  GenerosDAO();
        ArrayList<Genero> listagenero = generosDAO.getlistadogenero();
                    
                    
                   
        request.setAttribute("listagenero", listagenero); 
                    
                    
         request.getRequestDispatcher("subir_libro.jsp").forward(request, response);


        
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        



     //subir un libro
            LibrosDAO libroDAO = new LibrosDAO();
            Libro guardarlibro = new Libro();
            
            
            String titulo      = request.getParameter("Titulo");
            String fecha       = request.getParameter("Fecha");
            String portada     = request.getParameter("portada");
            String sinopsis    = request.getParameter("sinopsis");
            String descarga    = request.getParameter("descarga");
            
            System.out.println(sinopsis);
            
            
          Sandbox lafecha = new Sandbox();
          
        Date estafecha = lafecha.ParseFecha(fecha);

        java.sql.Date sqlDate = new java.sql.Date(estafecha.getTime());

        //System.out.println("la fecha sql es "+sqlDate);
        //System.out.println("la fecha util es "+estafecha);
          
 
                    guardarlibro.setTitulo(titulo);
                    guardarlibro.setFecha(sqlDate);
                    guardarlibro.setPortada(portada);
                    guardarlibro.setSinopsis(sinopsis);
                    guardarlibro.setDescarga(descarga);
 
                    libroDAO.guardar(guardarlibro);
      //fin subir un libro  

//recuperar id del libri
        LibrosDAO librosDAO = new LibrosDAO();
        ArrayList<Libro> listalibros = librosDAO.getlistadolibro();
        request.setAttribute("listalibros", listalibros);
        
        
       int id_libro = listalibros.get(listalibros.size() - 1 ).getId();
        
        System.out.println("el id del libro es " + id_libro );
//fin recuperar id del libri
        
        
        
      
                 //subir los genero                
        GenerosDAO  generosDAO = new  GenerosDAO();
        ArrayList<Genero> listagenero = generosDAO.getlistadogenero();
  
        request.setAttribute("listagenero", listagenero); 
        
        //fin subir los genero
        
  
        
         //subir genero del libro
        libroXgeneroDAO libroxgeneroDAO = new libroXgeneroDAO();
        
        LibroXgenero   guardarlibroxgenero = new LibroXgenero();
        

       
        String[] generos = request.getParameterValues("generos");
        
        
        
        if ( generos != null ) {
            
            for (int i = 0; i< generos.length; i++) {
                
        
                
                guardarlibroxgenero.setId_libro(id_libro);
                guardarlibroxgenero.setId_genero(Integer.parseInt(generos[i]));
                
               
                
           // System.out.println("los datos recogidos "+generos[i]);
            
            
            libroxgeneroDAO.guardargenero(guardarlibroxgenero);
            
            
            }
        }else   { System.out.println("paso por aca esta vacio");}
        
        
        
            // fin subir genero del libro 
      
      
      //subir autor
      
              AutoresDAO  autoresDAO = new  AutoresDAO();
              
        ArrayList<Autores> listadoautores = autoresDAO.getlistadoautores();
      
              Autores guardarautores = new Autores();
      
              String autor     = request.getParameter("autor");
              
            int autor_id = listadoautores.get(listadoautores.size() - 1).getAutor_id();
              
                guardarautores.setAutor(autor);
                guardarautores.setAutor_id(autor_id + 1);
                
               
                
            
            
            autoresDAO.guardarautor(guardarautores);
      
      
      
      //fin subir autor
      
      //subir autor a tabla auxiliar libroxautor
      
      
      
      
      
      
      
      
        AutorXibroDAO autorxlibroDAO = new AutorXibroDAO();
        
        
        LibroXautor guardarlibroxautor = new LibroXautor();
      
      
      
                guardarlibroxautor.setAutor_id(autor_id + 1);
                guardarlibroxautor.setLibro_id(id_libro);
      
      
      
            autorxlibroDAO.guardar(guardarlibroxautor);
      
      
      
       //fin subir autor a tabla auxiliar libroxautor
        
       
       
       //conexion
       
      HttpSession session = request.getSession();
      request.setAttribute("user", session.getAttribute("user"));
      
      //conexion
        
        
         request.getRequestDispatcher("subir_libro.jsp").forward(request, response);
        
        
    }

    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    
    
    
    
    
}
