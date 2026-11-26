package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int suma = 0;
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el numero entero #" + i + ": ");
                int numero = sc.nextInt();
                suma += numero;
            }
            
            double promedio = (double) suma / 10;
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}