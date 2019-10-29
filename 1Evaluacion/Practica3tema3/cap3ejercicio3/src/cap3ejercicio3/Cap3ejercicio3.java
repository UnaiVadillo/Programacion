/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Cap3ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("Teclea una frase");
        char caracter = JOptionPane.showInputDialog("Teclea el carácter").charAt(0);
       
        int veces = buscar(mensaje, caracter);
        
        mensaje = "El carácter "+caracter+" aparece "+veces+" veces en la cadena " + mensaje;
        JOptionPane.showMessageDialog(null,mensaje);
    }
    public static int buscar(String mensaje, char caracter){
        int contador = 0;
        for(int y = 0; y < mensaje.length(); y++)
            if ( mensaje.charAt(y)== caracter){
                contador++;
            }
        return contador;
    }
}
