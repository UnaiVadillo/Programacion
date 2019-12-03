/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int[][] faltas= new int[5][30];
            introducirDatos(faltas);
            mostrarDatos(faltas);
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Formato no valido");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas: " +e.getClass() );
        }
        
    }
    public static void introducirDatos(int[][] faltas) throws Exception{
        try{
            int continuar=0;
            boolean correcto=false;
            boolean codigoCorrecto=false;
            while(continuar==0){
                int codigo=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo del alumno"));
                if(codigo>4 || codigo<0){
                    throw new codigoNoValido();
                }else{
                    codigoCorrecto=true;
                }
                
                int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de Noviembre"));
                if(dia<0 || dia>29){
                    throw new diaNoValido();
                }else{
                    correcto=true;
                }
                
                if(correcto==true && codigoCorrecto==true){
                    faltas[codigo][dia]=Integer.parseInt(JOptionPane.showInputDialog("Introduce las faltas del alumno " + codigo + " del dia "+ dia));
                }
                
                continuar=JOptionPane.showConfirmDialog(null,"¿Quiere seguir introduciendo datos?");    
            }
        }catch(codigoNoValido e){
            JOptionPane.showMessageDialog(null, "Codigo no valido, introduce un codigo entre el 0 y el 4.");
        }catch(diaNoValido e){
            JOptionPane.showMessageDialog(null, "Dia introducido incorrectamente, debe ser un numero del 0 al 29, siendo el 0 el dia 1 y el 29 el dia 30");
        }
    }   

    private static void mostrarDatos(int[][] faltas) throws Exception {
        String mensaje="";
        
        for(int x=0; x<faltas.length;x++){
            for(int y=0; y<faltas[x].length;y++){
                if(faltas[x][y]!=0){
                    mensaje=(mensaje + "El alumno con el codigo " + x + " el dia " + y +" ha faltado " + faltas[x][y] + " veces" + "\n");
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
     
}
