
package com.Lucas.webJabalibro.model.entities;


public class LibroXautor {
    
    
    private int libro_id;
    private int autor_id;

    public LibroXautor() {
    }

    public LibroXautor(int libro_id, int autor_id) {
        this.libro_id = libro_id;
        this.autor_id = autor_id;
    }

    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }
    
    
    
}
