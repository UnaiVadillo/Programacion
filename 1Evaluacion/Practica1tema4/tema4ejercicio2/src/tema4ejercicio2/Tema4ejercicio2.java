/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio2;

import javax.swing.JOptionPane;

/**
 * 
 * @author 1GDAW11
 */
public class Tema4ejercicio2 {

    public static void main(String[] args) {
        try{
            int x=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
            int[] miArray = new int[x];
            rellenarysumarArray(miArray);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
        }

    }
    private static void rellenarysumarArray (int[] miArray)throws Exception {
        String mensaje="";
        int suma=0;
        for(int num:miArray){
            num=(int) (Math.random()*9);
            mensaje = mensaje +"\n"+ num;
            suma=suma+ num;
        }
        JOptionPane.showMessageDialog(null, "Los valores son los siguientes: " +mensaje+"\n" + " y la suma de todos ellos da " + suma);
    }
}
