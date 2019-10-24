/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un numero");
        int a = sc.nextInt();
        System.out.println("Dime otro numero");
        int b = sc.nextInt();
        resultado = a*b;
        System.out.println("El resultado es: " + resultado);
    }
    
}
