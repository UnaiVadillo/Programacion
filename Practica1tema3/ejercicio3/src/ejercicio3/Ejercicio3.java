/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime la base");
        int b = sc.nextInt();
        System.out.println("Dime la altura");
        int h = sc.nextInt();
        resultado = 2*b + 2*h;
        System.out.println("El perimetro es: " + resultado);
    }
    
}
