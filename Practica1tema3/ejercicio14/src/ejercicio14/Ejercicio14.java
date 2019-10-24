/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double suma = 0;
        int c = 0;
        while (c<10){
            System.out.println("Escribeme un valor");
            double valor=sc.nextDouble();
            suma = suma + valor;
            c = c+1;
        }
        System.out.println("El resultado de la suma es: " + suma);
    }
}
