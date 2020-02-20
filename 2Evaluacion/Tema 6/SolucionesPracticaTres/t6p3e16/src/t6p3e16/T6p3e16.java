
package t6p3e16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e16 {


    public static void main(String[] args) {
        boolean error;
        do
        {
            try
            {
                String dato=JOptionPane.showInputDialog("Teclea una fecha");
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
         // Es mejor solución usar la clase LocalDate
          String expresion = "^([1-9]|[1-2][0-9]|3[0-1])[/]([13578]|10|12)[/][12][0-9]{3}$";
          Pattern p = Pattern.compile(expresion);
          Matcher m = p.matcher(texto);
          if (!m.matches())
          {
              expresion = "^([1-9]|[1-2][0-9]|30)[/]([469]|11)[/][12][0-9]{3}$";
              p = Pattern.compile(expresion);
              m = p.matcher(texto);
              if (!m.matches())
              {
                expresion = "^([1-9]|[1-2][0-9])[/]2[/][12][0-9]{3}$";
                p = Pattern.compile(expresion);
                m = p.matcher(texto);
                return m.matches();
              }
              else
                  return true;
          }
          else 
              return true;
    
}
}
