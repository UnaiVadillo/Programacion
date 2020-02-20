
package t6p3e14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e14 {


    public static void main(String[] args) {
        boolean error;
        do
        {
            try
            {
                int decimales = Integer.parseInt(JOptionPane.showInputDialog("Indica el número de decimales"));
                String dato=JOptionPane.showInputDialog("Teclea un número real positivo con esos decimales");
                if (!validar(dato,decimales))
                    throw new DatoNoValidoException();
                JOptionPane.showMessageDialog(null,"Dato correcto");
                error = false;
            }
            catch(DatoNoValidoException | NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Dato incorrecto");
                error = true;
            }
        }
        while(error);
    }
    public static boolean validar(String texto,int decimales){
          String expresion = "^[0-9]+[.,][0-9]{" + decimales + "}$";
          Pattern p = Pattern.compile(expresion);
          Matcher m = p.matcher(texto);
          return m.matches();
          
    }
    
}
