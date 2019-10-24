/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime la diagonal menor");
        int d = sc.nextInt();
        System.out.println("Dime la diagonal mayor");
        int D = sc.nextInt();
        area = D*d/2;
        System.out.println("El area es: " + area);
    }
    
}
