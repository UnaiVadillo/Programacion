/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3ejercicio18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Practica3ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern p= Pattern.compile("^[A-z0-9._-]+[@][A-z]+[.][A-z]{2,4}$");
        String codigo;
        codigo=JOptionPane.showInputDialog("Introduce una correo");
        Matcher m = p.matcher(codigo);
        if(m.matches()){
            JOptionPane.showMessageDialog(null, "CODIGO CORRECTO");
        }else{
            JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
        }
    }
    
}
