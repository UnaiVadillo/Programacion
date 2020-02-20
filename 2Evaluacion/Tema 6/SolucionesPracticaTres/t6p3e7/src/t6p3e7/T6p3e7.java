
package t6p3e7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e7 {


    public static void main(String[] args) {
        boolean error;
        do
        {
            try
            {
                String dato=JOptionPane.showInputDialog("Teclea un número binario");
                if (!validar(dato))
                    throw new DatoNoValidoException();
                JOptionPane.showMessageDialog(null,"Dato correcto");
                error = false;
            }
            catch(DatoNoValidoException e)
            {
                JOptionPane.showMessageDialog(null,"Dato incorrecto");
                error = true;
            }
        }
        while(error);
    }
    public static boolean validar(String texto){
            // ^[0-1]+$
          Pattern p = Pattern.compile("^[01]{1,}$");
          Matcher m = p.matcher(texto);
          return m.matches();
          
    }
    
}
