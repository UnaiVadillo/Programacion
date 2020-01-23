/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5practica2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Tema5practica2 {

    private static ArrayList<String> idiomas= new ArrayList();
    private static ArrayList<ArrayList<String>> niveles=new ArrayList();
    private static ArrayList<ArrayList<Integer>> alumnos=new ArrayList();
    
    public static void main(String[] args) {
        int continuar=0;
        do{
            String idioma=JOptionPane.showInputDialog("¿Que idioma quieres introducir?");
            idiomas.add(idioma);
            String nivel=JOptionPane.showInputDialog("¿Que nivel quieres introducir para "+idioma+" ?");
            niveles.get(1).add(nivel);
            niveles.get(0).add(idioma);
            
            continuar=JOptionPane.showConfirmDialog(null,"¿Quieres continuar?");
        }while (continuar==0);
    }
    
}
