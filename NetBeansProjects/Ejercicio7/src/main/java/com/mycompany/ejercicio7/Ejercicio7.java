package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cantidad = 0;
            double suma = 0;
            
            System.out.println("Ingrese numeros positivos (ingrese un numero negativo para terminar):");
            double numero = sc.nextDouble();
            
            while (numero >= 0) {
                cantidad++;
                suma += numero;
                System.out.print("Ingrese otro numero: ");
                numero = sc.nextDouble();
            }
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Cantidad de numeros positivos ingresados: " + cantidad);
            System.out.println("Suma total: " + suma);
        }
    }
}