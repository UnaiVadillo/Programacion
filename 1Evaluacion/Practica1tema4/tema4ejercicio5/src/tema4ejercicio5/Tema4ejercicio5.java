/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio5 {

    public static void main(String[] args) {
        int[][] litrosAgua= new int[12][31];
        int mes, dia, seguir;
        String mensaje="";
        do{
            mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes del año"));
            dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia del mes " + mes)); 
            litrosAgua[mes][dia]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de lluvia el "+dia+"/"+mes));
            seguir =JOptionPane.showConfirmDialog(null,"¿Quieres seguir?");
        }while(seguir==0);
        
        
        for (int x=0; x <litrosAgua.length;x++){
            for(int y=0; y<litrosAgua.length; y++){
                mensaje="El dia: "+dia+"del mes: "+mes+" cantidad de agua:" +litrosAgua[mes][dia]+"/n" + mensaje;
            }
        }
        JOptionPane.showMessageDialog(null,mensaje);
                 
    }
    
}
