/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio3 {


    public static void main(String[] args) {
        char[] letras={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','W','X','Y','Z'};
        int num;
        String mensaje="";
        try{
            do{
               num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del array para la letra"));
               if(num<26 && num>0){
                    mensaje= letras[num] + mensaje;
               }
               if((num<0 || num>26) && num!=-1){
                   throw new NoValido();
               }
            }while(num!=-1);
        }catch(NoValido e){
            JOptionPane.showMessageDialog(null,"¡ERROR! El numero introducido es incorrecto");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Problemas: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Cadena resultante: " + mensaje);
    }
}
