/*
Escribir un programa que pida
tu nombre, lo guarde en una variable y
lo muestre por pantalla.
*/
package guia2_ejer2;

import java.util.Scanner;

public class Guia2_ejer2 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String nombre;
         System.out.println("ingresa tu nombre");
        nombre = leer.nextLine();
        System.out.println(nombre);    
    
    }
    
}
