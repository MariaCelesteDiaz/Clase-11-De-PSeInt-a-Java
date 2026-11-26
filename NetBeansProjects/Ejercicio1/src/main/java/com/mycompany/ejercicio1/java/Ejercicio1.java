package com.mycompany.ejercicio1.java;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre completo: ");
            String nombre = sc.nextLine();
            
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Ingrese su carrera: ");
            String carrera = sc.nextLine();
            
            System.out.print("Ingrese su estatura (en metros, ej. 1.65): ");
            double estatura = Double.parseDouble(sc.nextLine().replace(',', '.'));
            
            System.out.println("\n--- DATOS REGISTRADOS ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " anios");
            System.out.println("Carrera: " + carrera);
            System.out.println("Estatura: " + estatura + " m");
        }
    }
}
