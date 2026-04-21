package org.example.contenido;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula extends ContenidoAudioVisual{
    // Constructor completo
    public Pelicula(String titulo, int duracion, String genero, String descripcion, double calificacion) {
        // La palabra 'super' envía estos datos al constructor de ContenidoAudioVisual
        super(titulo, duracion, genero, descripcion, calificacion);
    }

    // Constructor simplificado
    public Pelicula(String titulo, int duracion, String genero) {
        super(titulo, duracion, genero);
    }

    // Como una película no tiene atributos adicionales por ahora,
    // hereda todo su comportamiento de la clase padre.
}
