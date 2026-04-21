package org.example.contenido;

public class Serie extends ContenidoAudioVisual {
    // Este es un atributo único de las series, las películas no lo tienen
    private int temporadas;

    public Serie(String titulo, int duracion, String genero, String descripcion, double calificacion, int temporadas) {
        // Inicializamos los atributos del padre
        super(titulo, duracion, genero, descripcion, calificacion);
        // Inicializamos el atributo propio de la hija
        this.temporadas = temporadas;
    }

    // Sobreescribimos el método del padre (@Override) para incluir el dato de las temporadas
    @Override
    public String obtenerFichaTecnica() {
        // Llamamos al método original del padre y le concatenamos el texto de las temporadas
        return super.obtenerFichaTecnica() + "\nTemporadas: " + temporadas;
    }

    // Getter y Setter para el nuevo atributo
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
