
package com.Lucas.webjavalibro.model.dao;

import com.Lucas.webJabalibro.model.entities.Autores;
import com.Lucas.webJabalibro.model.entities.Genero;
import com.Lucas.webJabalibro.model.entities.Libro;
import com.Lucas.webjavalibro.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibrosDAO {

    public ArrayList<Libro> getlistadolibro() {


        ArrayList<Libro> listalibros = new ArrayList<>();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "select * from libros";

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setId(rs.getInt("libro_id"));
                libro.setTitulo(rs.getString("titulo"));
                
                libro.setFecha(rs.getDate("fecha"));
                libro.setPortada(rs.getString("portada"));
                libro.setSinopsis(rs.getString("sinopsis"));
                libro.setGeneros(this.getGenerosByID(rs.getInt("libro_id")));
                libro.setAutores(this.getautoresbyid(rs.getInt("libro_id"))); 
                
                //System.out.println(libro.getTitulo());
                listalibros.add(libro);
                System.out.println("pincho por aca ");

            }

            stm.close();
            rs.close();
            con.close();
            

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de libros");
            
        }

        return listalibros;
    }

    public Libro getlibro(int libro_id) {

        Libro libro = new Libro();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "select * from libros where libro_ID = " + libro_id;

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            rs.next();

            libro.setId(rs.getInt("libro_id"));
            libro.setTitulo(rs.getString("titulo"));
            libro.setFecha(rs.getDate("fecha"));
            libro.setPortada(rs.getString("portada"));
            libro.setSinopsis(rs.getString("sinopsis"));
            libro.setGeneros(this.getGenerosByID(rs.getInt("libro_id")));
            libro.setAutores(this.getautoresbyid(rs.getInt("libro_id")));
            libro.setDescarga(rs.getString("descarga"));
            
            //System.out.println(libro.getTitulo());
            stm.close();
            rs.close();
            con.close();
            
            System.out.println("la info la obtuvo");

        } catch (SQLException ex) {
            System.out.println("Error al obtener la info del libro");
        }

        return libro;
    }

    public void guardar(Libro guardarlibro) {

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            PreparedStatement stm;
            String sql;

            sql = "INSERT INTO libros(titulo, fecha, portada, sinopsis, descarga)"
                    + "VALUES (?, ?, ?, ?, ?)";

            stm = con.prepareStatement(sql);

            stm.setString(1, guardarlibro.getTitulo());
            stm.setDate  (2, (Date) guardarlibro.getFecha());
            stm.setString(3, guardarlibro.getPortada());
            stm.setString(4, guardarlibro.getSinopsis());
            stm.setString(5, guardarlibro.getDescarga());

            stm.executeUpdate();

            stm.close();

            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al en el DAO guardar el libro" + "" + ex);
        }

    }

    public void eliminar(int libro_id) {

    }
    
    
    public ArrayList<Genero> getGenerosByID(int ID  ) {

        ArrayList<Genero> listageneros = new ArrayList<>();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "SELECT genero.*"
                    + " FROM libroxgenero,genero"
                    + " WHERE genero.genero_ID = libroxgenero.ID_GENERO AND"
                    + " libroxgenero.ID_LIBRO = " + ID;

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Genero genero = new Genero();

                genero.setGenero_id(rs.getInt("genero_id"));
                genero.setNombre_genero(rs.getString("nombre_genero"));
                genero.setImagen_genero(rs.getString("imagen_genero"));
                
                


                //System.out.println(libro.getTitulo());
                listageneros.add(genero);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de generos");
        }

        return listageneros;
    } 
    
    
    
    
    
    
        public ArrayList<Autores> getautoresbyid(int ID  ) {

        ArrayList<Autores> listaautores = new ArrayList<>();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "SELECT *  "
                    + "FROM libroxautor, autor "
                    + "WHERE autor.autor_id = libroxautor.autor_id"
                    + " AND libroxautor.libro_id = " + ID;

            
            
            
            
            
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Autores autores = new Autores();

                autores.setAutor_id(rs.getInt("autor_id"));
                autores.setAutor(rs.getString("autor"));
              
                


                //System.out.println(libro.getTitulo());
                System.out.println("el autor lo obruvo");
                listaautores.add(autores);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de autores");
        }

        return listaautores;
    } 
    
    
        
        
        
        
        
        
        public ArrayList<Libro> getlibrobygenero(int id ) {
        
           ArrayList<Libro> librobygenero = new ArrayList<>();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "SELECT libros.*"
                    + " FROM genero,libroxgenero,libros"
                    + " WHERE genero.genero_ID = libroxgenero.ID_GENERO"
                    + " AND libros.libro_ID = libroxgenero.ID_LIBRO"
                    + " AND libroxgenero.ID_GENERO =" + id;

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setId(rs.getInt("libro_id"));
                libro.setTitulo(rs.getString("titulo"));
                
                libro.setFecha(rs.getDate("fecha"));
                libro.setPortada(rs.getString("portada"));
                libro.setSinopsis(rs.getString("sinopsis"));
                libro.setGeneros(this.getGenerosByID(rs.getInt("libro_id")));
                libro.setAutores(this.getautoresbyid(rs.getInt("libro_id"))); 
                
                //System.out.println(libro.getTitulo());
                librobygenero.add(libro);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el libro por genero");
        }

        return librobygenero;
    }    
    
        
        
        
        
        
        
        
        
         public ArrayList<Libro> getlistalibrobytitulo(String nombre) {

        ArrayList<Libro> listalibros = new ArrayList<>();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "SELECT * FROM libros	 WHERE titulo like \"%"+nombre+"%\"";
            
            System.out.println("el sql de titulo que viaja es");
            System.out.println(sql);
            
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setId(rs.getInt("libro_id"));
                libro.setTitulo(rs.getString("titulo"));
                
                libro.setFecha(rs.getDate("fecha"));
                libro.setPortada(rs.getString("portada"));
                libro.setSinopsis(rs.getString("sinopsis"));
                libro.setGeneros(this.getGenerosByID(rs.getInt("libro_id")));
                libro.setAutores(this.getautoresbyid(rs.getInt("libro_id"))); 
                
                //System.out.println(libro.getTitulo());
                listalibros.add(libro);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de libros");
        }

        return listalibros;
    }
         
         
         
         
         
   public ArrayList<Libro> getlistadoporpunt() {

        ArrayList<Libro> listalibros = new ArrayList<>();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "SELECT libros.*\n" +
                  "FROM puntuacion,libros\n" +
                  "WHERE puntuacion.id_libro_punt = libros.libro_ID\n" +
                  "GROUP BY id_libro_punt\n" +
                  "ORDER BY AVG(puntuacion) DESC";

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Libro libro = new Libro();

                libro.setId(rs.getInt("libro_id"));
                libro.setTitulo(rs.getString("titulo"));
                
                libro.setFecha(rs.getDate("fecha"));
                libro.setPortada(rs.getString("portada"));
                libro.setSinopsis(rs.getString("sinopsis"));
                libro.setGeneros(this.getGenerosByID(rs.getInt("libro_id")));
                libro.setAutores(this.getautoresbyid(rs.getInt("libro_id"))); 
                
                //System.out.println(libro.getTitulo());
                listalibros.add(libro);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de libros");
        }

        return listalibros;
    }      
         
         
         
         
         
         
         
         
         
         
         
}




