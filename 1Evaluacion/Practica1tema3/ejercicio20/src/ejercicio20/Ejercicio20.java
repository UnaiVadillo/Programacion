/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        int numAleatorio=r.nextInt(100)+1;
        int num;
        do{
            System.out.println("Adivina el numero");
            num=sc.nextInt();
            if(num<numAleatorio){
                System.out.println("El número es mayor");
            }else{
                if(num>numAleatorio){
                    System.out.println("El número es menor");
                }
            }
        }while(num!=numAleatorio);
        System.out.println("¡Enhorabuena, has adivinado el numero secreto!");
    }
}
