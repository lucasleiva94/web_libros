
package com.Lucas.webjavalibro.model.dao;

import com.Lucas.webJabalibro.model.entities.Autores;
import com.Lucas.webjavalibro.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AutoresDAO {
    
    
    
    
    
    public ArrayList<Autores> getlistadoautores() {
        
           ArrayList<Autores> listaautores = new ArrayList<>();

        try {
    
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "select * from autor";

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Autores autor = new Autores();
                
                
                autor.setAutor_id(rs.getInt("autor_id"));
                autor.setAutor(rs.getString("autor"));

                
                listaautores.add(autor);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de autores");
        }

        return listaautores;
    }
    
    
    
    
    
        public void guardarautor(Autores guardarautor) {

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            PreparedStatement stm;
            String sql;

            sql = "INSERT INTO autor(autor_id, autor)"
                    + "VALUES (?, ?)";

            stm = con.prepareStatement(sql);

            stm.setInt   (1, guardarautor.getAutor_id());
            stm.setString(2, guardarautor.getAutor());
        

            stm.executeUpdate();

            stm.close();

            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al guardar el autor" + "" + ex);
        }

    }
    
    
    
    
    
    
    
    
    
    
}
