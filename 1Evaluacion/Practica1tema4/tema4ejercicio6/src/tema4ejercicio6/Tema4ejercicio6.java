/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema4ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayContadores[] = new int[27];
        boolean correcto;
        String cadena;
        char[] abecedario={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        do{
            try{
                correcto=false;
                cadena=JOptionPane.showInputDialog("Introduce una frase");
                cadena=cadena.toUpperCase();
                if(cadena.isEmpty()){
                    throw new estaVacio();
                }
                for(int z=0;z<cadena.length();z++){
                   if(Character.isDigit(cadena.charAt(z))){
                       throw new noValido();
                   }
                }
                String mensaje="";
                for (int x=0; x<cadena.length();x++){
                    for(int y=0; y<abecedario.length;y++){
                        if(cadena.charAt(x)==abecedario[y]){
                            arrayContadores[y]=arrayContadores[y]+1;
                        }
                    } 
                }
                for(int c=0; c<abecedario.length;c++){
                    mensaje= mensaje +("La letra " +abecedario[c]+ " se repite "+ arrayContadores[c] + " veces " + "\n");
                }
                
                JOptionPane.showMessageDialog(null, mensaje);
            }catch(noValido e){
                JOptionPane.showMessageDialog(null, "Numeros no validos");
                correcto=true;
            }catch(estaVacio e){
                JOptionPane.showMessageDialog(null, "No puede estar la cadena vacia");
                correcto=true;
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Introduce un valor valido");
                correcto=true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Problemas:" + e.getClass());
                correcto=true;
            }
           
        }while(correcto);
    }
    
}
