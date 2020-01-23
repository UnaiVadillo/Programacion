/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3ejercicio.pkg20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Practica3ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean condi=true;
        
        do{
            Pattern p1=Pattern.compile("^(978|979)[0-9]{10}$");
            Matcher m1=p1.matcher(JOptionPane.showInputDialog("ISBN"));
            if(!m1.matches()){
                JOptionPane.showMessageDialog(null, "No es un ISBN");
            }else{
                JOptionPane.showMessageDialog(null, "Es un ISBN");
                condi=false;
            }
        }while(condi);
    }
    
}
