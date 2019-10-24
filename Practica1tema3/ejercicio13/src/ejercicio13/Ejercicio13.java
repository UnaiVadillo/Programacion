/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ninoApto, ninaApta, c;
        
        ninoApto = 0;
        ninaApta = 0;
        c = 0;
        while(c<30){
            System.out.println("Introduce el nombre");
            String nombre=sc.next(); 
            System.out.println("Introduce el edad");
            int edad=sc.nextInt();
            System.out.println("Introduce el sexo (true=hombre y false=mujer)");
            boolean sexo=sc.nextBoolean();
            System.out.println("Introduce el peso");
            int peso=sc.nextInt();
            System.out.println("Introduce el estatura");
            Float estatura=sc.nextFloat();
            if(sexo==true && estatura>1.70 && peso>70){
                ninoApto= ninoApto +1;
            }else if (sexo==false && estatura>1.60 && peso>60){
                    ninaApta= ninaApta +1;
            }
            c=c+1;
        }
            System.out.println("El numero de niños aptos es: " + ninoApto);
            System.out.println("El numero de niñas aptas es: " + ninaApta);
        }

    }