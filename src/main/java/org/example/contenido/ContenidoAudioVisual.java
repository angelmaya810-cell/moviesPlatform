package org.example.contenido;

import java.time.LocalDate;

public abstract class ContenidoAudioVisual {
    private String titulo;
    private String descripcion;
    private int duracion;
    private String genero;
    private LocalDate fechaEstreno;
    private double calificacion;
    private boolean disponible;

    // Constructor completo
    public ContenidoAudioVisual(String titulo, int duracion, String genero, String descripcion, double calificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.fechaEstreno = LocalDate.now();
        this.disponible = true;
    }

    // Constructor simplificado
    public ContenidoAudioVisual(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.fechaEstreno = LocalDate.now();
        this.disponible = true;
    }

    // Constructor vacío
    public ContenidoAudioVisual() {}

    public void reproducir(){
        System.out.println("Reproduciendo " + titulo);
    }

    public String obtenerFichaTecnica(){
        return titulo + " (" + genero + ")\n" +
                "Calificación: " + calificacion + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Duración: " + duracion + " minutos";
    }

    public void calificar(double calificacion){
        if(calificacion >= 0 && calificacion <= 5){
            this.calificacion = calificacion;
        }
    }

    public boolean esPopular(){
        return calificacion >= 4;
    }

    // --- GETTERS Y SETTERS ---
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public LocalDate getFechaEstreno() { return fechaEstreno; }
    public void setFechaEstreno(LocalDate fechaEstreno) { this.fechaEstreno = fechaEstreno; }
    public double getCalificacion() { return calificacion; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}
