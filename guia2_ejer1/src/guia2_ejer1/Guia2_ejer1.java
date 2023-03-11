/*
*Escribir un programa que pida dos números enteros por teclado
y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
*/
package guia2_ejer1;

import java.util.Scanner;

public class Guia2_ejer1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("ingresa un número");
        num1 = leer.nextInt();
        System.out.println("ingresa otro número, el cual sera sumado al anterior");
        num2 = leer.nextInt();
        System.out.println(num1 + num2);
      
    }
    
}
