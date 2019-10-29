/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3ejercicio1;

import javax.swing.JOptionPane;

public class Cap3ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        boolean correcto=true;
        mensaje= JOptionPane.showInputDialog(null, "Escribe una frase para saber cuantas vocales tiene");
        for(int x=0;x< mensaje.length();x++) {
            do{
                try{
                    
                    if ((mensaje.charAt(x)=='0') || (mensaje.charAt(x)=='1') || (mensaje.charAt(x)=='2') || (mensaje.charAt(x)=='3') || (mensaje.charAt(x)=='4')||(mensaje.charAt(x)=='5') || (mensaje.charAt(x)=='6') || (mensaje.charAt(x)=='7') || (mensaje.charAt(x)=='8') || (mensaje.charAt(x)=='9')){
                        throw new fraseNoValida();
                    }
                correcto = true;
                }catch(fraseNoValida e){
                JOptionPane.showMessageDialog(null, "Vuelve a intoducir tu frase sin numeros");
                correcto = false;
                mensaje= JOptionPane.showInputDialog(null, "Escribe una frase para saber cuantas vocales tiene");   
            }
        }while(!correcto);
        }
        contarVocales(mensaje);
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