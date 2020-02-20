
package t6p3e6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e6 {


    public static void main(String[] args) {
        boolean error;
        do
        {
            try
            {
                String dato=JOptionPane.showInputDialog("Teclea una matricula");
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
           // no son todas las letras
          Pattern p = Pattern.compile("^[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}$");
          Matcher m = p.matcher(texto);
          return m.matches();
          
    }
    
}
