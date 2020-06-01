
package com.Lucas.webJabalibro.model.entities;

import java.util.ArrayList;
import java.util.Date;



public class Libro {
    
    
    
    private int id;
    private String titulo;
    private Date fecha;
    private String portada;
    private String sinopsis;
    private ArrayList<Genero> generos;
    private ArrayList<Autores> autores;
    private String descarga;



    public Libro(int id, String titulo, Date fecha, String portada, String sinopsis, String Descarga) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.portada = portada;
        this.sinopsis = sinopsis;
        this.descarga = descarga;
       
    }
    
     public Libro (){
         
         
         }
     

    public ArrayList<Autores> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autores> autores) {
        this.autores = autores;
    }
     

     
     
         public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }
    
      public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDescarga() {
        return descarga;
    }

    public void setDescarga(String descarga) {
        this.descarga = descarga;
    }

 
    
   
    
    
}
