/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicio24 extends Exception{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("¿Es apto en Visual.Net?(true o false)");
            boolean visual= sc.nextBoolean();
            System.out.println("¿Es apto en Cobol?(true o false)");
            boolean cobol= sc.nextBoolean();
            System.out.println("¿Es apto en Java?(true o false)");
            boolean java= sc.nextBoolean();
            System.out.println("¿Es apto en SQL?(true o false)");
            boolean sql= sc.nextBoolean();
            if(visual!=true || visual!=false||cobol!=true || cobol!=false||java!=true || java!=false||sql!=true || sql!=false){
                throw new Exception();
            }
            String notaC = notaCurso(visual, cobol, java, sql);
            System.out.println(notaC);
        }catch(Exception e){
           System.out.println("Dato introducido incorrectamente.");
        }
        

        
    }
    public static String notaCurso(boolean visual, boolean cobol, boolean java, boolean sql){
        String nota;
        if(visual==true && cobol==true && java==true && sql==true){
            nota="Sobresaliente";
        }else{
            if((sql==true && cobol==true && java==true && visual ==false)||(sql==true && cobol==true && java==false && visual ==true)){
                nota="Notable";
            }else{
                if(sql==true && cobol==true && java==false && visual==false){
                    nota="Bien";
                }else{
                    if((((sql==true && cobol==false && java==true && visual ==false)||(sql==true && cobol==false && java==false && visual ==true)||(sql==true && cobol==false && java==true && visual ==true)))||((sql==false && cobol==true && java==true && visual ==false)||(sql==false && cobol==true && java==false && visual ==true) || (sql==false && cobol==true && java==true && visual ==true))){
                        nota="Suficiente";
                    }else{
                        nota="Insuficiente";
                    }
                }
            }
        }
        return nota;
    }
}
