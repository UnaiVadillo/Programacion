
package t6p3e17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e17 {


    public static void main(String[] args) {
        boolean error;
        do
        {
            try
            {
                String dato=JOptionPane.showInputDialog("Teclea un nombre");
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
          Pattern p = Pattern.compile("^([A-Z][a-z]+[ ]?){1,2}$");
          Matcher m = p.matcher(texto);
          return m.matches();
          
    }
    
}
