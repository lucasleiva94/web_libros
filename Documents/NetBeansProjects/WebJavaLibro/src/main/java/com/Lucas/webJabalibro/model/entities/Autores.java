
package com.Lucas.webJabalibro.model.entities;


public class Autores {
    
    private int autor_id;
    private String autor;

    public Autores() {
    }

    public Autores(int autor_id, String autor) {
        this.autor_id = autor_id;
        this.autor = autor;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    
    
}
