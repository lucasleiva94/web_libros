
package com.Lucas.webjavalibro.model.dao;

import com.Lucas.webJabalibro.model.entities.Puntuacion;
import com.Lucas.webjavalibro.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PuntuacionDAO {
    
    
    
    
    
    
      public void guardapuntuacion(Puntuacion guardarpuntuacion) {
          
        int bandera=0;
        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            PreparedStatement stm;
            String sql;

            
            
            sql = "INSERT INTO puntuacion(id_user_punt, id_libro_punt, puntuacion) VALUES(?,?,?)";
            
            stm = con.prepareStatement(sql);

            stm.setInt(1, guardarpuntuacion.getId_user_punt());
            stm.setInt(2, guardarpuntuacion.getId_libro_punt() );
            stm.setInt(3, guardarpuntuacion.getPuntuacion());

            
 
            stm.executeUpdate();

            stm.close();
            con.close();
            
            

         
        } catch (SQLException ex) {
            
            System.out.println("error al insertar la puntuacion " + ex);
            
             bandera = 1;

        }
        
          if (bandera == 1) {
              
              
                      try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            PreparedStatement stm;
            String sql;

            
            
            sql = "UPDATE puntuacion SET  puntuacion = ? WHERE id_user_punt = ? AND id_libro_punt = ?";
            
            stm = con.prepareStatement(sql);

            stm.setInt(2, guardarpuntuacion.getId_user_punt());
            stm.setInt(3, guardarpuntuacion.getId_libro_punt() );
            stm.setInt(1, guardarpuntuacion.getPuntuacion());

            
 
            stm.executeUpdate();

            stm.close();
            con.close();
            
            
                          System.out.println("upgradeo piola");
         
        } catch (SQLException ex) {
            
            System.out.println("error al updatear la puntuacion " + ex);
            

        }
              
              
              
          }
      
  
        
        

    }
    
    
    
    
    

    
    
    
     public int getstringpunt(int id_libro) {

              int puntuacion = 0;
        

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();
            
            

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "SELECT AVG(puntuacion) FROM puntuacion WHERE id_libro_punt = " + id_libro;

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            rs.next();
            
            
            
            puntuacion = rs.getInt("AVG(puntuacion)");
             
             
             
             
               
            
            System.out.println("la puntuacion en el DAO es de " +  puntuacion);
            

            stm.close();
            rs.close();
            con.close();
            
            System.out.println("la info la obtuvo");

        } catch (SQLException ex) {
            System.out.println("Error al obtener la info del libro");
        }
         
          

        return puntuacion;
    }
    
    
    
    
}
