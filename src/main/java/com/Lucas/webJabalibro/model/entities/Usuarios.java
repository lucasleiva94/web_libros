
package com.Lucas.webJabalibro.model.entities;


public class Usuarios {

    public Usuarios() {
    }

    public Usuarios(int usuario_id, String nombre, String apellido, String mail, String nick, String contraseña) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.nick = nick;
        this.contraseña = contraseña;
    }
    
    
    
    
    
    
    
    
    private int usuario_id;
    private String nombre;
    private String apellido;
    private String mail;
    private String nick;
    private String contraseña;

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
    
    
}
