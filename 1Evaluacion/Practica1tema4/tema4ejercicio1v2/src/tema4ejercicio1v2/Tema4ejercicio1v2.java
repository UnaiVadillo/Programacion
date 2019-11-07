/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio1v2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio1v2 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        double[] miArray = new double[10];
        int x=0;
        double min=98989889;
        double max=-9114177;
        
        for(double num: miArray){
           num=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el valor que quieras introducir en el array"));
           if(max<num){
               max=num;
           }
           if(min>num){
               min=num;
           }
        }
        JOptionPane.showMessageDialog(null, "El valor maximo es "+max+ " y el minimo es "+min);
    }
}
