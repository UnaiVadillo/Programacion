/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce los catetos");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        
        double hipotenusa = sqrt(pow(a, 2) + pow(b,2));
        System.out.println("La hipotenusa es " + hipotenusa);
    }
    
}
