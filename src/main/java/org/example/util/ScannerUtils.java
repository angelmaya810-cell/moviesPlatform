package org.example.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static String capturarTexto(String mensaje){
        System.out.println(mensaje + ": ");
        return scanner.nextLine();
    }

    public static int capturarNumero(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje + ": ");
                int dato = scanner.nextInt();
                scanner.nextLine(); // Limpiamos el buffer después de leer el número
                return dato;        // Si todo sale bien, retorna el dato y sale del ciclo
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingresa un número entero.");
                scanner.nextLine(); // ¡Muy importante! Limpiamos la entrada incorrecta para evitar un bucle infinito
            }
        }
    }

    public static double capturarDecimal(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje + ": ");
                double dato = scanner.nextDouble();
                scanner.nextLine(); // Limpiamos el buffer
                return dato;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingresa un número decimal (ej. 4.5).");
                scanner.nextLine(); // Limpiamos la entrada incorrecta
            }
        }
    }

}
