package org.example.plataforma;

import org.example.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String nombre;
    private List<Pelicula> contenido;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();

    }

    public void agregar(Pelicula elemento){
        this.contenido.add(elemento);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pelicula> getContenido() {
        return contenido;
    }

    public void mostrarTitulos(){
        /*for (int i = 0; i < contenido.size(); i++) {
            System.out.println("El contenido es: "+ contenido.get(i).getTitulo());
        }*/

        contenido.forEach(contenido -> System.out.println("El contenido es: "+ contenido.getTitulo()));
    }

    public void eliminar(Pelicula peliculaEliminar){
        this.contenido.remove(peliculaEliminar);

    }

    public Pelicula buscarPorTitulo(String titulo){
        return contenido.stream()
                .filter(contenido -> contenido.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);

    }

    public List<Pelicula> buscarPorGenero(String genero){
        return contenido.stream()
                .filter(contenido -> contenido.getGenero().equalsIgnoreCase(genero))
                .toList();
    }
}
