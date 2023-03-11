/*
Escribir un programa que lea un número entero por teclado
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package guia2_ejerc5;

import java.util.Scanner;

public class Guia2_ejerc5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1;
        int doble;
        int trip;
        double raiz;
        
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        
        doble = num1 * 2 ;
        trip=num1 * 3;
        raiz=Math.sqrt(num1);
        
        System.out.println(doble);
        System.out.println(trip);
        System.out.println(raiz);
    }
    
}
