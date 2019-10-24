/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el radio");
        int radio= sc.nextInt();
        double area= PI * pow(radio, 2);
        System.out.println("El área de la circunferencia es " + area);
        
    }
    
}
