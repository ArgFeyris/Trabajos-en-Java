/*
Dada una cantidad de grados centígrados se debe mostrar 
su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia2_ejer4;

import java.util.Scanner;


public class Guia2_ejer4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cent;
        int f;
        System.out.println("ingrese un valor en grados centigrados");
        cent = leer.nextInt();
        f = 32 + (9 * cent / 5);
        System.out.println("convertido a fahrenheit serian: " + f);
    }
    
}
