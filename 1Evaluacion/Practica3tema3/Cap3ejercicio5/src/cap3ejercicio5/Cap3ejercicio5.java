/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3ejercicio5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Cap3ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
        //LocalDate fechaUno = LocalDate.parse(fechaString, formatter);
        try
        {       
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaUno = formatter.parse(dia+"/"+mes+"/"+ano);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaUno); 
            calendar.add(Calendar.DAY_OF_YEAR, 100); 

            JOptionPane.showMessageDialog(null, "Visualización con getTime \n" + calendar.getTime());

            JOptionPane.showMessageDialog(null," Visualización con constantes\n " + (calendar.get(Calendar.DAY_OF_WEEK)+1) + ", " +
                       calendar.get(Calendar.DAY_OF_MONTH) + " de " +
                       (calendar.get(Calendar.MONTH)+1) + " del " +
                       calendar.get(Calendar.YEAR));
             String diaSemana="";
             switch((calendar.get(Calendar.DAY_OF_WEEK)+1))
             {
                 case 1: 
                     diaSemana = "Lunes";
                     break;
                 case 2: 
                     diaSemana = "Martes";
                     break;
                 case 3: 
                     diaSemana = "Miercoles";
                     break;
                 case 4: 
                     diaSemana = "Jueves";
                     break;
                 case 5: 
                     diaSemana = "Viernes";
                     break;
                 case 6: 
                     diaSemana = "Sábado";
                     break;
                 case 7: 
                     diaSemana = "Domingo";
                     break;

             }

            String mesLetra="";
            switch(calendar.get(Calendar.MONTH)+1)
            {
                 case 1: 
                     mesLetra = "Enero";
                     break;
                 case 2: 
                    mesLetra = "Febrero";
                     break;
                 case 3: 
                     mesLetra = "Marzo";
                     break;
                 case 4: 
                    mesLetra = "Abril";
                     break;
                 case 5: 
                    mesLetra = "Mayo";
                     break;
                 case 6: 
                    mesLetra = "Junio";
                     break;
                 case 7: 
                     mesLetra = "Julio";
                     break;
                case 8: 
                    mesLetra = "Agosto";
                     break;
                 case 9: 
                    mesLetra = "Septiembre";
                     break;
                 case 10: 
                     mesLetra = "Octubre";
                     break;
                 case 11: 
                    mesLetra = "Noviembre";
                     break;
                 case 12: 
                    mesLetra = "Diciembre";
                     break;

             }
               JOptionPane.showMessageDialog(null," Visualización tras los switch \n" + diaSemana + ", " +
                       calendar.get(Calendar.DAY_OF_MONTH) + " de " +
                       mesLetra + " del " + calendar.get(Calendar.YEAR));
    } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getClass());
        }
    }
    
}
