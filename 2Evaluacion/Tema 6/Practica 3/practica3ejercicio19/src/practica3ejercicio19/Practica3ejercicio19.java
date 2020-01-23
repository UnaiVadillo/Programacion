/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3ejercicio19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Practica3ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean condi=true;
        
        do{
            Pattern p1=Pattern.compile("^@[A-z0-9-_]{1,15}$");
            Matcher m1=p1.matcher(JOptionPane.showInputDialog("email"));
            if(!m1.matches()){
                JOptionPane.showMessageDialog(null, "No es un email");
            }else{
                JOptionPane.showMessageDialog(null, "Es un email");
                condi=false;
            }
        }while(condi);
    }
    
}
