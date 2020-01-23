/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3ejercicio8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Practica3ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern p= Pattern.compile("^[0-7]+$");
        String codigo;
        codigo=JOptionPane.showInputDialog("Introduce tu numero octal");
        Matcher m = p.matcher(codigo);
        if(m.matches()){
            JOptionPane.showMessageDialog(null, "CODIGO CORRECTO");
        }else{
            JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
        }
    }
    
}
