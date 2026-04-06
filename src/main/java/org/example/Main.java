package org.example;

import org.example.contenido.Pelicula;
import org.example.plataforma.Plataforma;
import org.example.plataforma.Usuario;
import org.example.util.ScannerUtils;

import java.util.List;

public class Main {
    public static final int AGREGAR=1;
    public static final int MOSTRARTODO=2;
    public static final int BUSCARPORTITULO=3;
    public static final int ELIMINAR=4;
    public static final int BUSCARPORGENERO=5;
    public static final int BUSCARPOPULARES=6;
    public static final int SALIR=7;
    public static int opcionElegida;

    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma("PLATZI PLAY");

        Usuario usuario = new Usuario("Angel Maya","angelmaya810@gmail.com");

        cargarPeliculas(plataforma);

        System.out.println("Mas de " + plataforma.getDuracionTotal() + " minutos de contenido \n");

        while(true) {
            System.out.println("""
                    Que opción quieres elegir:
                    
                    1. Agregar contenido
                    2. Mostrar todo
                    3. Buscar por titulo
                    4. Eliminar
                    5. Buscar por Genero
                    6. Ver populares
                    7. Salir
                    """);


            opcionElegida = ScannerUtils.capturarNumero("Captura la opción: ");
            switch (opcionElegida) {

                case AGREGAR -> {
                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
                    int duracion = ScannerUtils.capturarNumero("Duracion del contenido");
                    String genero = ScannerUtils.capturarTexto("Genero del contenido");
                    String descripcion = ScannerUtils.capturarTexto("Descripcion de la pelicula");
                    double calificacion = ScannerUtils.capturarDecimal("Calificacion del contenido");

                    plataforma.agregar(new Pelicula(nombre, duracion, genero, descripcion, calificacion));
                }
                case MOSTRARTODO -> {
                    List<String> titulos=plataforma.mostrarTitulos();
                    titulos.forEach(System.out::println);
                }
                case BUSCARPORTITULO -> {
                    String nombreBuscado = ScannerUtils.capturarTexto("Nombre del contenido a buscar");
                    Pelicula pelicula = plataforma.buscarPorTitulo(nombreBuscado);

                    if(pelicula!=null){
                        System.out.println(pelicula.obtenerFichaTecnica());
                    }else{
                        System.out.println("El nombre buscado no existe dentro de: "+ plataforma.getNombre());
                    }
                }
                case ELIMINAR -> {
                    String nombreElimnar = ScannerUtils.capturarTexto("Nombre del contenido a eliminar");
                    Pelicula pelicula = plataforma.buscarPorTitulo(nombreElimnar);

                    if(pelicula!=null){
                        plataforma.eliminar(pelicula);
                        System.out.println("Pelicula " + pelicula.getTitulo() + " se elimino");
                    }else{
                        System.out.println("El nombre a eliminar no existe dentro de: "+ plataforma.getNombre());
                    }
                }
                case BUSCARPORGENERO -> {
                    String nombreGeneroBuscado = ScannerUtils.capturarTexto("Nombre del contenido por genero a buscar");
                    List<Pelicula> peliculaPorGenero = plataforma.buscarPorGenero(nombreGeneroBuscado);
                    System.out.println(peliculaPorGenero.size() + " encontrados para el genero "+ nombreGeneroBuscado);
                    peliculaPorGenero.forEach(pelicula -> System.out.println(pelicula.obtenerFichaTecnica()+ "\n"));
                }
                case BUSCARPOPULARES -> {
                    int cantidad = ScannerUtils.capturarNumero("Introduce la cantidad deseada: ");

                    List<Pelicula> peliculasPopulares = plataforma.getPopulares(cantidad);
                    peliculasPopulares.forEach(contenido -> System.out.println(contenido.obtenerFichaTecnica()+ "\n"));
                }
                case SALIR -> System.exit(0);

            }
        }
    }

    private static void cargarPeliculas(Plataforma plataforma) {
        plataforma.agregar(new Pelicula("Shrek", 90, "Animada"));
        plataforma.agregar(new Pelicula("Inception", 148, "Ciencia Ficción"));
        plataforma.agregar(new Pelicula("Titanic", 195, "Drama"));
        plataforma.agregar(new Pelicula("John Wick", 101, "Acción"));
        plataforma.agregar(new Pelicula("El Conjuro", 112, "Terror"));
        plataforma.agregar(new Pelicula("Coco", 105, "Animada"));
        plataforma.agregar(new Pelicula("Interstellar", 169, "Ciencia Ficción"));
        plataforma.agregar(new Pelicula("Joker", 122, "Drama"));
        plataforma.agregar(new Pelicula("Toy Story", 81, "Animada"));
        plataforma.agregar(new Pelicula("Avengers: Endgame", 181, "Acción"));
    }
}