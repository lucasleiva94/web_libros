
package com.Lucas.webjavalibro.model.dao;

import com.Lucas.webJabalibro.model.entities.LibroXgenero;
import com.Lucas.webjavalibro.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class libroXgeneroDAO {
    

    
        public void guardargenero(LibroXgenero guardargenero) {

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            PreparedStatement stm;
            String sql;

            
            
            sql = "INSERT INTO libroxgenero(ID_LIBRO, ID_GENERO) VALUES(?,?)";
            
            stm = con.prepareStatement(sql);
            
            
            stm.setInt(1, guardargenero.getId_libro());
            stm.setInt(2, guardargenero.getId_genero());
            

            
 
            stm.executeUpdate();

            stm.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("error al insertar el genero del libro" + "" + ex);
        }

    }
    
    
}
