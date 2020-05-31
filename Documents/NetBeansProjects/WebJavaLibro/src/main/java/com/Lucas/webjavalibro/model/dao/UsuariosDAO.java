
package com.Lucas.webjavalibro.model.dao;

import com.Lucas.webJabalibro.model.entities.Usuarios;
import com.Lucas.webjavalibro.utils.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UsuariosDAO {
    
    
    
    
    
     public ArrayList<Usuarios> getlistausuarios() {

        ArrayList<Usuarios> listausuarios = new ArrayList<>();

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            Statement stm;
            String sql;
            ResultSet rs;

            sql = "select * from usuarios";

            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {

                Usuarios usuario = new Usuarios();

                
                usuario.setUsuario_id(rs.getInt("usuario_id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setMail(rs.getString("mail"));
                usuario.setNick(rs.getString("nick"));
                usuario.setContraseña(rs.getString("contraseña"));

                //System.out.println(libro.getTitulo());
                listausuarios.add(usuario);

            }

            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener el listado de USUARIOS");
        }

        return listausuarios;
    }
    
    
    
    public void guardarusuario(Usuarios guardarusuario) {

        try {
            ConnectionManager connectionmanager = new ConnectionManager();

            Connection con = connectionmanager.getconnection();

            PreparedStatement stm;
            String sql;

            
            
            sql = "INSERT INTO usuarios(nombre, apellido, mail, nick, contraseña) VALUES(?,?,?,?,?)";
            
            stm = con.prepareStatement(sql);

            stm.setString(1, guardarusuario.getNombre());
            stm.setString(2, guardarusuario.getApellido());
            stm.setString(3, guardarusuario.getMail());
            stm.setString(4, guardarusuario.getNick());
            stm.setString(5, guardarusuario.getContraseña());
            
 
            stm.executeUpdate();

            stm.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("error al insertar el usuario nuevo" + "" + ex);
        }

    }
    
    
}
