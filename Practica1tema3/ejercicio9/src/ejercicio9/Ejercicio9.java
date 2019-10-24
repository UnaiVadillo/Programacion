/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce la nota");
        int nota = sc.nextInt();
        switch(nota){
            case 0:
                System.out.println("Muy deficiente");
            break;
            case 1:
                System.out.println("Muy deficiente");
            break;
            case 2:
                System.out.println("Muy deficiente");
            break;
            case 3:
                System.out.println("Insuficiente");
            break;
            case 4:
                System.out.println("Insuficiente");
            break;
            case 5:
                System.out.println("Suficiente");
            break;
            case 6:
                System.out.println("Bien");
            break;
            case 7:
                System.out.println("Bien");
            break;
            case 8:
                System.out.println("Bien");
            break;
            case 9:
                System.out.println("Sobresaliente");
            break;
            case 10:
                System.out.println("Sobresaliente");
            break;
            default:
                System.out.println("La nota introducida no es correcto");
            
        }
    }
}
