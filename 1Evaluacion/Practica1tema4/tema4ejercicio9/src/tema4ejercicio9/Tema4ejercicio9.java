/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio9 {
        private final static int[] codigos={10,23,30,47,55,65,135,256,526,663}; 
        private static int[] unidades=new int[10];
    public static void main(String[] args) {
       
        introducirDatos();
        validarProductos();
    }

    private static void introducirDatos() {
        for(int x=0; x<unidades.length;x++){
            unidades [x]=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del producto de la posicion " + x));
        }
    }

    private static void validarProductos() {
       
    }
    
}
