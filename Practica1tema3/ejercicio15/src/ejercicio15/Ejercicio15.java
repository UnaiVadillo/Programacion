/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int aprobados=0;
        
        System.out.println("¿Cuanto alumnos hay?");
        int alumnos=sc.nextInt();
        
        for(int x=0; x<alumnos; x=x+1){
            System.out.println("Nota del alumno");
            int nota=sc.nextInt();
            if(nota<=6){
                aprobados=aprobados+1;
            }
        }
        System.out.println(aprobados + " es el numero de aprobados");
    }
    
}
