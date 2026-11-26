package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese la edad de la persona: ");
            int edad = sc.nextInt();
            
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            }
        }
    }
}