/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3ejercicio8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Cap3ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        String mensajefinal;
        double n1=0, n2=0;
        int opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que accion quieres hacer?(Escribeme el numero)"
                    + "\n 1- Calcular la edad de una persona"
                    + "\n 2- Sumar dos números"
                    + "\n 3- Contar vocales en una cadena"
                    + "\n 4- Salir del programa"));
  
        try{
            switch(opcion){
                case 1:
                    String edad= Edad();
                    JOptionPane.showMessageDialog(null, edad);
                    break;
                case 2:
                    double suma= Suma(n1,n2);
                    JOptionPane.showMessageDialog(null, suma);
                    break;
                case 3:
                    mensaje= JOptionPane.showInputDialog(null, "Escribe una frase para saber cuantas vocales tiene");
                    contarVocales(mensaje);
                    break;
                case 4:
                    break;
                default:
                    throw new Exception("Numero incorrecto");
            }

        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static String Edad(){
        String mensajeEdad="";
        
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaString= JOptionPane.showInputDialog("Dime tu fecha de nacimiento en este formato dd/MM/yyyy");
        LocalDate fechaNacimiento= LocalDate.parse(fechaString, formato);
        LocalDate hoy=LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, hoy);
        mensajeEdad= "Tu edad es: " + periodo.getYears();
        return mensajeEdad;
    }
     public static double Suma(double n1, double n2){
        n1= Double.parseDouble(JOptionPane.showInputDialog(null, "Dame un numero que quieras sumar"));
        n2= Double.parseDouble(JOptionPane.showInputDialog(null, "Dame otro numero que quieras sumar"));
        double suma= n1+n2;
        return suma;
    }
     public static void contarVocales(String mensaje){
        int contVocales=0;
        
        for(int y=0;y< mensaje.length();y++) {
            if ((mensaje.charAt(y)=='a') || (mensaje.charAt(y)=='e') || (mensaje.charAt(y)=='i') || (mensaje.charAt(y)=='o') || (mensaje.charAt(y)=='u')||(mensaje.charAt(y)=='A') || (mensaje.charAt(y)=='E') || (mensaje.charAt(y)=='I') || (mensaje.charAt(y)=='O') || (mensaje.charAt(y)=='U')){
                contVocales++;
            }
        }
        JOptionPane.showMessageDialog(null, "Tu frase tiene " + contVocales + " vocales");
    }
    
}
    

