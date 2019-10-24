/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Numeros de Fibonacci");
        int j= sc.nextInt();
        int n1=1;
        int n2=1;
        int n3=0;
        System.out.println(n1);
        System.out.println(n2);
        for(int x=3; x<j ;x=x+1){
            n3=fibonacci(n1,n2,n3);
            n1=n2;
            n2=n3;
        }
    }
    public static int fibonacci(int n1, int n2, int n3){
        n3= n1+n2;
        System.out.println(n3);
        return n3;
    }
}
