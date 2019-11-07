/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio1 {

    public static void main(String[] args) {
        double[] miArray = new double[10];
        int x=0;
        
        miArray[0]=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce para la posicion " + x + " el valor que quieras introducir en el array"));
        double min=miArray[0];
        double max=miArray[0];
        
        for( x=1;x<miArray.length;x++){
           miArray[x]=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce para la posicion " + x + " el valor que quieras introducir en el array"));
           if(max<miArray[x]){
               max=miArray[x];
           }
           if(min>miArray[x]){
               min=miArray[x];
           }
        }
        JOptionPane.showMessageDialog(null, "El valor maximo es "+max+ " y el minimo es "+min);
    }
}