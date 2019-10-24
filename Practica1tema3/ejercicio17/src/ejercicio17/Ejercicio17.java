/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int c=0;
        int notaMay=-5;
        int notaMen=11;
        String nombre;
        String nombreMay="";
        String nombreMen="";
        while(c<40){
            System.out.println("Introduce el nombre");
            nombre=sc.next();
            System.out.println("Introduce la nota");
            int nota=sc.nextInt();
            
            if(nota>notaMay){
                notaMay= nota;
                nombreMay = nombre;
            }
            if(nota<notaMen){
                notaMen = nota;
                nombreMen= nombre;
            } 
            c=c+1;
        }
        System.out.println("La nota mayor es de " + nombreMay + " y la nota es "+ notaMay);
        System.out.println("La nota menor es de " + nombreMen + " y la nota es "+ notaMen);
    }
    
}