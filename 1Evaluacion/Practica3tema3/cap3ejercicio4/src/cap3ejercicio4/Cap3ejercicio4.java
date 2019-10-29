/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3ejercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Cap3ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String fechaString= JOptionPane.showInputDialog("Escriba la fecha Inicial dd/mm/yy");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            Date fechaInicial=dateFormat.parse(fechaString);
            
            fechaString=JOptionPane.showInputDialog(null, "Escriba la fecha Inicial");
            Date fechaFinal=dateFormat.parse(fechaString);
            
            int resultado=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
            JOptionPane.showMessageDialog(null,"La diferencia de dias entre " + fechaInicial +" y " + fechaFinal +" es de: "+resultado);
        }catch (ParseException e){
            JOptionPane.showMessageDialog(null, "Formato incorrecto");
        }
                
    }
    
}
