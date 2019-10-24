/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce los grados centigrados");
        float gradosC= sc.nextFloat();
        double gradosF = 1.8*gradosC + 32;
        System.out.println(gradosC +"ºC son " + gradosF + "ºF");
        
    }
    
}
