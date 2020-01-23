/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3ejercicio16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Practica3ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern p= Pattern.compile("^((0[0-9]|[1-2][0-9]|3[0-1])/(0[13578]|1[02])/[0-9]{4})|"
                                    + "((0[0-9]|[1-2][0-9]|30)/(0[1469]|11)/[0-9]{4})|"
                                    + "((0[0-9]|[1-2][0-8]|19)/02/[0-9]{4})$");
        String codigo;
        codigo=JOptionPane.showInputDialog("Introduce una fecha dd/mm/aaaa");
        Matcher m = p.matcher(codigo);
        if(m.matches()){
            JOptionPane.showMessageDialog(null, "CODIGO CORRECTO");
        }else{
            JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO");
        }
    } 
}
