
package t6p3e1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e1 {


    public static void main(String[] args) {
        String dato=JOptionPane.showInputDialog("Teclea un número entero");
        if (validarNumeroEntero(dato))
            JOptionPane.showMessageDialog(null,"Dato correcto");
        else
            JOptionPane.showMessageDialog(null,"Dato incorrecto");
    }
    public static boolean validarNumeroEntero(String texto){
          Pattern p = Pattern.compile("^-?[0-9]+$");
          Matcher m = p.matcher(texto);
          return m.matches();
          
    }
    
}
