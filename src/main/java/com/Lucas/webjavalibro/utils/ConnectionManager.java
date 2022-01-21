
package com.Lucas.webjavalibro.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {
    
    
    
    public Connection getconnection (){
    
        String user     = "upbtrambzjurlfnc";
        String password = "nU4uNO24wREcjUt1DPE7";
        String bd       = "buhfwk5q86qixqdiypxn";
        String host     = "buhfwk5q86qixqdiypxn-mysql.services.clever-cloud.com";
        String port     = "3306";
        String timezone = "UTC";
        
        
        //String user     = "root";
        //String password = "";
        //String bd       = "pagina_libros";
        //String host     = "localhost";
        //String port     = "3306";
        //String timezone = "UTC";
        
        

    
    
    
        String     url;
        
        Connection con;
        
        con = null;
    
        url = "jdbc:mysql://" + host + ":" + port + "/" + bd + "?user=" + user + "&password=" + password + "&serverTimezone=" + timezone + "&useSSL=false";
        
       // url = "jdbc:mysql://" + host + ":" + port + "/" + bd + "?user=" + user + "&password=" + password + "&serverTimezone=" + timezone;  
       
       
       // System.out.println("pincho por aca!");
       try {
                        

           
            Class.forName("com.mysql.cj.jdbc.Driver");
               System.out.println("el driver se cargo piola");
            
             con = DriverManager.getConnection( url );
             
                System.out.println("conectado satifactoriamente");
                
       }
       
       catch (ClassNotFoundException ex) {
            System.out.println("error al cargar el driver de mysql");;
        } catch (SQLException ex) {
            System.out.println("error al conectarse con la db ");;
            System.out.println(ex.getMessage());
        }         
        
        
        return con;
        
    }
    
    
    
    
}
