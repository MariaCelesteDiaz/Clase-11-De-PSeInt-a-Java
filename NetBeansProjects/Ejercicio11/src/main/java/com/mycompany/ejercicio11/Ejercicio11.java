package com.mycompany.ejercicio11;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el numero #1: ");
            double numero = sc.nextDouble();
            double mayor = numero;
            double menor = numero;
            
            for (int i = 2; i <= 10; i++) {
                System.out.print("Ingrese el numero #" + i + ": ");
                numero = sc.nextDouble();
                
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);
        }
    }
}