
package com.Lucas.webJabalibro.model.entities;

public class LibroXgenero {
    
    
    private int id_libro;
    private int id_genero;

    public LibroXgenero(int id_libro, int id_genero) {
        this.id_libro = id_libro;
        this.id_genero = id_genero;
    }

    public LibroXgenero() {
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }
    
    
    
}
