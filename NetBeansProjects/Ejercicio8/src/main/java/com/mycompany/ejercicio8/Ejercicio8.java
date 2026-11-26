package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final String CLAVE_CORRECTA = "java2026";
            String claveIngresada;
            
            do {
                System.out.print("Ingrese la contrasenia: ");
                claveIngresada = sc.nextLine();
                
                if (!claveIngresada.equals(CLAVE_CORRECTA)) {
                    System.out.println("Contrasenia incorrecta. Intente nuevamente.");
                }
            } while (!claveIngresada.equals(CLAVE_CORRECTA));
            
            System.out.println("Acceso concedido.");
        }
    }
}