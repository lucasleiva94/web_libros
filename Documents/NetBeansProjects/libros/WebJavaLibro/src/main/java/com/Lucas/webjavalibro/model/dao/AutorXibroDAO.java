
package com.Lucas.webjavalibro.model.dao;

import com.Lucas.webJabalibro.model.entities.LibroXautor;
import com.Lucas.webjavalibro.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AutorXibroDAO {
    
    
    
    
    
    
        public void guardar(LibroXautor guardarlibroxautor) {

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            PreparedStatement stm;
            String sql;

            sql = "INSERT INTO libroxautor(libro_id, autor_id)"
                    + "VALUES (?, ?)";

            stm = con.prepareStatement(sql);

            stm.setInt(1, guardarlibroxautor.getLibro_id());
            stm.setInt(2, guardarlibroxautor.getAutor_id());


            stm.executeUpdate();

            stm.close();

            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al guardar el libroxautor" + "" + ex);
        }

    }
}
