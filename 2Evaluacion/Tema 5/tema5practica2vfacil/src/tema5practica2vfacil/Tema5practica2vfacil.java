/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5practica2vfacil;

import javax.swing.JOptionPane;


/**
 *
 * @author 1GDAW11
 */
public class Tema5practica2vfacil {
    private static int[][] alumnos=new int[3][4];
    private static String[] idiomas={"Ingles","Frances","Aleman","Ruso"};
    private static String[] niveles={"Basico","Medio","Perfeccionamiento"};
    
    public static void main(String[] args) {
        int continuar=0;
        do{
            int opcion=menuIdiomas();
            switch(opcion){
                case 1:
                    niveles();
                    break;
                case 2:
                    niveles();
                    break;
                case 3:
                    niveles();
                    break;
                case 4:
                    niveles();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No existe ese idioma");
                    break;
            }
            continuar=JOptionPane.showConfirmDialog(null,"¿Quieres continuar?");
        }while (continuar==0);
        
    }

    private static int menuIdiomas() {
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Para que idioma quieres introducir?" +"\n"
                                                            + "1-Ingles" +"\n"
                                                            + "2-Frances" +"\n"
                                                            + "3-Aleman" +"\n"
                                                            + "4-Ruso"));   
        return opcion;
    }

    private static int niveles() {
       int opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Que nivel quieres introducir? \n"
                                                                + "1-Basico" +"\n"
                                                                + "2-Medio" +"\n"
                                                                + "3-Perfeccionamiento"));
       return opcion;
    }

}
