package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 * @author Maria Celeste Diaz Guartatanga
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese la nota del estudiante: ");
            double nota = sc.nextDouble();
            
            if (nota >= 7) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}