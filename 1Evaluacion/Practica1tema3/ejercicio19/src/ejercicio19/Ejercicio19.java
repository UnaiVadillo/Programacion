/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero");
        int num= sc.nextInt();
        int resultado=0;
        int n=1;
        num=num*2;
        do{
            if(n%2 != 0){
                resultado=resultado+n;
            }
            n=n+1;
        } while(num!=n);
        System.out.println(resultado);
    }
    
}
