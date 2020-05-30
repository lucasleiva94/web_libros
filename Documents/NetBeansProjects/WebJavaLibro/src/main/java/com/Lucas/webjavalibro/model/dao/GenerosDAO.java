
package com.Lucas.webjavalibro.model.dao;

import com.Lucas.webJabalibro.model.entities.Genero;
import com.Lucas.webjavalibro.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GenerosDAO {
    
    
    
    
    public ArrayList<Genero> getlistadogenero() {
        
           ArrayList<Genero> listagenero = new ArrayList<>();

        try {
    
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "SELECT * FROM `genero` ORDER By nombre_genero ASC";

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Genero genero = new Genero();

                genero.setGenero_id(rs.getInt("genero_id"));
                genero.setNombre_genero(rs.getString("nombre_genero"));
                
                genero.setImagen_genero(rs.getString("imagen_genero"));


                System.out.println(genero.getImagen_genero());
                
                listagenero.add(genero);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de libros");
        }

        return listagenero;
    }

    
    
    
    
    
    
    

    
    
}
        