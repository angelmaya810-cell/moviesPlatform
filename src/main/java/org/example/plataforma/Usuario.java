package org.example.plataforma;

import org.example.contenido.Pelicula;

public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    public void ver(Pelicula pelicula){
        System.out.println(nombre + "(" + email + ")"+ " esta viendo: ");
        System.out.println(pelicula.obtenerFichaTecnica());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
