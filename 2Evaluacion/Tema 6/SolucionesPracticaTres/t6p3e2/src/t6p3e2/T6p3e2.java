
package t6p3e2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e2 {


    public static void main(String[] args) {
        try
        {
            String dato=JOptionPane.showInputDialog("Teclea un número entero positivo");
            if (!validar(dato))
                throw new DatoNoValidoException();
            JOptionPane.showMessageDialog(null,"Dato correcto");
        }
        catch(DatoNoValidoException e)
        {
            JOptionPane.showMessageDialog(null,"Dato incorrecto");
        }
    }
    public static boolean validar(String texto){
          Pattern p = Pattern.compile("^[0-9]+$");
          Matcher m = p.matcher(texto);
          return m.matches();
          
    }
    
}
