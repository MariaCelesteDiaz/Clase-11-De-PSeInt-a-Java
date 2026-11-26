package com.mycompany.ejercicio2.java;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = sc.nextInt();
            
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = sc.nextInt();
            
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicacion: " + multiplicacion);
            
            if (num2 != 0) {
                double division = (double) num1 / num2;
                int residuo = num1 % num2;
                System.out.println("Division: " + division);
                System.out.println("Residuo: " + residuo);
            } else {
                System.out.println("Division: No se puede dividir entre cero.");
                System.out.println("Residuo: No disponible.");
            }
        }
    }
}