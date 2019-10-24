/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int alumno=0;
        int edad=0;
        int sumatorioEdad=0;
        while (edad>=0){
            System.out.println("Dime la edad del alumno");
            edad=sc.nextInt();
            if(edad>=0){
                sumatorioEdad = sumatorioEdad + edad;
                alumno = alumno + 1;
            }
        }
        System.out.println("El promedio de edades es " + sumatorioEdad/alumno);
    }
    
}
