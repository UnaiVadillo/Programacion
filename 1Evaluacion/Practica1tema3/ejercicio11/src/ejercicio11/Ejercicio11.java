/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce 3 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println(a + " es el numero mayor"); 
            }else{
                System.out.println(c + " es el numero mayor");
            }
        }else{
            if(b>c){
                System.out.println(b + " es el numero mayor");
            }else{
                System.out.println(c + " es el numero mayor");
            }
        }
        if(a<b){
            if(a<c){
                System.out.println(a + " es el numero menor"); 
            }else{
                System.out.println(c + " es el numero menor");
            }
        }else{
            if(b<c){
                System.out.println(b + " es el numero menor");
            }else{
                System.out.println(c + " es el numero menor");
            }
        }
        
        
    }
    
}
