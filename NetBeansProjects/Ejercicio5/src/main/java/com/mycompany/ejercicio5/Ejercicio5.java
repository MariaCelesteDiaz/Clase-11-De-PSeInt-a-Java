package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una calificacion (0 a 10): ");
            double calificacion = sc.nextDouble();
            
            if (calificacion >= 9 && calificacion <= 10) {
                System.out.println("Excelente");
            } else if (calificacion >= 8 && calificacion < 9) {
                System.out.println("Muy Bueno");
            } else if (calificacion >= 7 && calificacion < 8) {
                System.out.println("Bueno");
            } else if (calificacion >= 5 && calificacion < 7) {
                System.out.println("Regular");
            } else if (calificacion >= 0 && calificacion < 5) {
                System.out.println("Deficiente");
            } else {
                System.out.println("Calificación fuera de rango (debe estar entre 0 y 10).");
            }
        }
    }
}