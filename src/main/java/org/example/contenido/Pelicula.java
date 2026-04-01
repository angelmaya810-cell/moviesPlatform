package org.example.contenido;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    public String titulo;
    public String descripcion;
    public int duracion;
    public String genero;
    public LocalDate fechaEstreno;
    public double calificacion;
    public boolean disponible;

    public Pelicula(String titulo, int duracion, String genero, String descripcion, double calificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.fechaEstreno = LocalDate.now();
        this.disponible = true;
    }

    public Pelicula(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public Pelicula() {

    }

    public void reproducir(){
        System.out.println("Reproduciendo " + titulo);
    }

    public String obtenerFichaTecnica(){
        return titulo + "(" + genero + ")\n" +
                "Calificacion: " + calificacion + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Duracion: " + duracion;
    }

    public void calificar(double calificacion){
        if(calificacion >=0 && calificacion <=5){
            this.calificacion = calificacion;
        }
    }

    public boolean esPopular(){

        return calificacion >=4;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
