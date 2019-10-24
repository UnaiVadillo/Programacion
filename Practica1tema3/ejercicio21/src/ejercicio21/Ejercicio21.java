/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero");
        int p = sc.nextInt();
        int c=1;
        int c2=0;
        do{
            if(p%c==0){
                c2=c2+1;
            }
            c=c+1;
        }while(c!=p+1);
        if(c2==2){
            System.out.println("El numero " + p + " es primo");
        }else{
            System.out.println("El numero " + p + " NO es primo");
        }
    }
    
}
