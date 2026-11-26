package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero para ver su tabla de multiplicar: ");
            int numero = sc.nextInt();
            
            System.out.println("\n--- TABLA DEL " + numero + " ---");
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}