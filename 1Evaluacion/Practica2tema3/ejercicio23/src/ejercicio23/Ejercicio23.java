/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author 1GDAW11
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String estadoCivil, estudios;
        double pago=0,pagoTotal=0;
                
        System.out.println("¿Cuantas horas has trabajado?");
        float horas = sc.nextFloat();
            if(horas>=0){
              do{
                   System.out.println("¿Estado civil?(Soltero=S, Casado=C, Viudo=V, Divorciado=D");
                    estadoCivil= sc.next();
                  estadoCivil=estadoCivil.toUpperCase();
              }while(estadoCivil.equals("S") && estadoCivil.equals("C") && estadoCivil.equals("V") && estadoCivil.equals("D"));
              do{
                System.out.println("¿Nivel de estudios?(Primario=P, Medio=M, Superios=S)");
                estudios=sc.next();
                estudios=estudios.toUpperCase();
              }while(estudios.equals("P")&& estudios.equals("M") && estudios.equals("S"));
            
              if((estadoCivil.equals("S") && estudios.equals("P")||(estadoCivil.equals("V") && estudios.equals("S"))||(estadoCivil.equals("S") && estudios.equals("M"))||(estadoCivil.equals("C") && estudios.equals("S"))||(estadoCivil.equals("V") && estudios.equals("P"))||(estadoCivil.equals("S") && estudios.equals("S"))||(estadoCivil.equals("S") && estudios.equals("P"))||(estadoCivil.equals("D") && estudios.equals("S")))){
                pagoTotal=calcularPago(horas,pago)+100;
              }else{
                pagoTotal=calcularPago(horas,pago);
              }
            }else{
            System.out.println("No pueden ser negativas las horas");
        }
    System.out.println("Tu salario es de: " + pagoTotal + "€");
    }
    public static double calcularPago(float horas, double pago){
            if(horas<=40){
                pago=horas*10;
            }else{
                pago=(horas-40)*15 + 40*10;
            }
        return pago;
    }
}
