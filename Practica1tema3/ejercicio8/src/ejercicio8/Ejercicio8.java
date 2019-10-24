/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce la nota");
        int nota = sc.nextInt();
        
        if(nota>=5 && nota<=10){
            System.out.println("Aprobado");
        }else{
            if(nota<5 && nota>=0){
              System.out.println("Suspendido");
            }else{
                System.out.println("La nota introducida no es correcta");
            }
        }
        
       
    }
    
}
