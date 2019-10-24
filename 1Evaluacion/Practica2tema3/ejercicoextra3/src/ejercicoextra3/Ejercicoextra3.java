/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicoextra3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicoextra3 {


    public static void main(String[] args) throws Exception {
        double n1 = 0, n2 =0, n3 =0, n4=0;
        int n5=0, dividendo=0, divisor=0;
            int opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que operacion quieres hacer?(Escribeme el numero)"
                    + "\n 1- Sumar dos números"
                    + "\n 2- Restar dos números"
                    + "\n 3- Visualizar la tabla de multiplicar de un número"
                    + "\n 4- Visualizar el cociente y el resto de una división"
                    + "\n 5- Salir del programa"));
        try{
            switch(opcion){
                case 1:
                    double suma= Suma(n1,n2);
                    JOptionPane.showMessageDialog(null, suma);
                    break;
                case 2:
                    double resta= Resta(n3,n4);
                    JOptionPane.showMessageDialog(null, resta);
                    break;
                case 3:
                    String tabla= tablaMultiplicar(n5);
                    break;
                case 4:
                    cocienteResto(dividendo,divisor);
                    break;
                case 5:
                break;
                default:
                    throw new Exception("Numero incorrecto");
            }

        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
      
        
    
    }
    public static double Suma(double n1, double n2){
        n1= Double.parseDouble(JOptionPane.showInputDialog(null, "Dame un numero que quieras sumar"));
        n2= Double.parseDouble(JOptionPane.showInputDialog(null, "Dame otro numero que quieras sumar"));
        double suma= n1+n2;
        return suma;
    }
    public static double Resta(double n3, double n4){
        n3= Double.parseDouble(JOptionPane.showInputDialog(null, "Dame un numero que quieras restar"));
        n4= Double.parseDouble(JOptionPane.showInputDialog(null, "Dame otro numero que quieras restar"));
        double resta= n3-n4;
        return resta;
    }
    public static String tablaMultiplicar(int n5){
        String tabla="";
        n5= Integer.parseInt(JOptionPane.showInputDialog(null, "¿De que numero quieres saber la tabla de multiplicar?"));
        for(int x=1; x<=10; x++){
            int resultado=n5*x;
            tabla= tabla + "\n" + (x+" x "+n5+ " = "+ resultado) ;
        }
        JOptionPane.showMessageDialog(null, tabla);
        return tabla;
    }
    public static void cocienteResto(int dividendo, int divisor){
        int cociente;
        int resto;
        dividendo= Integer.parseInt(JOptionPane.showInputDialog(null, "Dime el dividendo"));
        divisor= Integer.parseInt(JOptionPane.showInputDialog(null,"Dime el divisor"));
        try{
            if(divisor==0){
                throw new ArithmeticException("El divisor no puede ser 0");
            }
        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        resto= dividendo%divisor;
        cociente= dividendo/divisor;
        JOptionPane.showMessageDialog(null, "El resto de la division " + dividendo + " / " + divisor + " es " + resto + " y el cociente es " + cociente);
    }
}
