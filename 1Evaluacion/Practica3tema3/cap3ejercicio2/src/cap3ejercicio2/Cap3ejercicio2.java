/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Cap3ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog("Teclea la palabra o frase que quieras dar la vuelta");
        Girar(mensaje);
    }
    public static void Girar(String mensaje){
        String cadenaInvertida="";
        // Recorrer desde el final al principio.
        for(int y = mensaje.length()-1; y >= 0; y--)
        {
            cadenaInvertida = cadenaInvertida + mensaje.charAt(y);
        }
        JOptionPane.showMessageDialog(null, " La cadena invertida es " + cadenaInvertida);
    }
    
}
