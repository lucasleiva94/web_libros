
package com.Lucas.webJabalibro.model.entities;


public class Genero {
    
    
    private int    genero_id;
    private String nombre_genero;
    private String imagen_genero;

    public Genero() {
    }

    public Genero(int genero_id, String nombre_genero, String imagen_genero) {
        this.genero_id = genero_id;
        this.nombre_genero = nombre_genero;
        this.imagen_genero = imagen_genero;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

    public String getImagen_genero() {
        return imagen_genero;
    }

    public void setImagen_genero(String imagen_genero) {
        this.imagen_genero = imagen_genero;
    }

  
    
    
  
    
    
    
}
