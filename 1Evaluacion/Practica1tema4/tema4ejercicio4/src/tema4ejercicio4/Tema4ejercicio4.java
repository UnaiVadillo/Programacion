/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio4 {

    public static void main(String[] args) {
        String [] meses=new String[12];
        try{
            completarArray(meses);
            introducirybuscarMes(meses);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
        }
    }

    private static void completarArray(String[] meses) throws Exception{
       
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
    }
    private static void introducirybuscarMes(String[] meses) throws Exception{
       String mes=JOptionPane.showInputDialog("Introduce el mes del año en letra");
       String resultado="Mes no valido";
       for(int x = 0; x < meses.length; x++){
        if (meses[x].toLowerCase().equals(mes.toLowerCase())){
           resultado= "Mes correcto";
        }
       }
       javax.swing.JOptionPane.showMessageDialog(null,resultado);
       
    }
}
