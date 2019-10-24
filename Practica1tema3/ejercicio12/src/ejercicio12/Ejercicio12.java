/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double consumo, pagar;
        
        System.out.println("Introduce el consumo mensual");
        consumo= sc.nextDouble();
       
        if(consumo < 300 & consumo>=0){
            pagar = consumo * 0.04;
        }else{
            if(consumo<500){
                pagar = consumo * 0.03;
            }else{
                if(consumo<800){
                    pagar = 300 * 0.03 + (consumo - 300) * 0.02;
                }else{
                    pagar = (300 * 0.03 + (consumo - 300) * 0.02) * 0.9875;
                }
            }
        }
        System.out.println("La factura total son: " + pagar + "€");
        
    }
    
}
