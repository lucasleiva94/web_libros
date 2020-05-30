
package com.Lucas.webJabalibro.model.entities;


public class Puntuacion {
    

    private int id_user_punt;
    private int id_libro_punt;
    private int puntuacion;

    public Puntuacion() {
    }

    public Puntuacion(int id_user_punt, int id_libro_punt, int puntuacion) {
        this.id_user_punt = id_user_punt;
        this.id_libro_punt = id_libro_punt;
        this.puntuacion = puntuacion;
    }

    public int getId_user_punt() {
        return id_user_punt;
    }

    public void setId_user_punt(int id_user_punt) {
        this.id_user_punt = id_user_punt;
    }

    public int getId_libro_punt() {
        return id_libro_punt;
    }

    public void setId_libro_punt(int id_libro_punt) {
        this.id_libro_punt = id_libro_punt;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    
}
