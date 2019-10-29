/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3ejercicio6;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Cap3ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final LocalDate PRIMAVERA = LocalDate.of(2019,3,21);
       final LocalDate VERANO = LocalDate.of(2019,6,21);
       final LocalDate OTOÑO = LocalDate.of(2019,9,21);
       final LocalDate INVIERNO = LocalDate.of(2019,12,21);
       
       boolean error = false;
       do
       {
           try
           {
                int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
                int ano= Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));
                LocalDate fecha = LocalDate.of(ano,mes,dia);

               if (fecha.isBefore(PRIMAVERA))
                   JOptionPane.showMessageDialog(null,"El dia "+dia+" del mes " +mes+ " del año "+ano+" --> Invierno");
               else
                     if (fecha.isBefore(VERANO))
                        JOptionPane.showMessageDialog(null,"El dia "+dia+" del mes " +mes+ " del año "+ano+" --> Primavera");
                    else
                           if (fecha.isBefore(OTOÑO))
                                JOptionPane.showMessageDialog(null,"El dia "+dia+" del mes " +mes+ " del año "+ano+" --> Verano");
                           else
                                JOptionPane.showMessageDialog(null,"El dia "+dia+" del mes " +mes+ " del año "+ano+" --> Otoño");
               error = false;
           }
           catch(DateTimeException e)
           {
               JOptionPane.showMessageDialog(null," Fecha mal introducida, porfavor vuelva a introducirla");
               error = true;
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,"Problemas");
               error = true;
           }
       }
       while(error);
    }
    
}

