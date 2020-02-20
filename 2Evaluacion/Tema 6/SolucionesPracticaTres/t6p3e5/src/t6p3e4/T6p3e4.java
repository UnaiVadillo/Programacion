
package t6p3e4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e4 {


    public static void main(String[] args) {
        boolean error;
        do
        {
            try
            {
                String dato=JOptionPane.showInputDialog("Teclea un DNI");
                if (!validar(dato))
                    throw new DatoNoValidoException();
                if (validarLetra(Integer.parseInt(dato.substring(0, 8))) != dato.charAt(8) )
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
          Pattern p = Pattern.compile("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
          Matcher m = p.matcher(texto);
          return m.matches();
          
    }
     public static char validarLetra(int dni) {
         char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
          int resto = dni%23;
          return caracteres[resto];
    }
}
    
