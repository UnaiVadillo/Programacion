/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Ejercicioextra4{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre ="";
        double nota;
        double sumaNota=0;
        double media=0;
        String mensaje;
        String notas="";
        do{
            nombre=(JOptionPane.showInputDialog(null, "¿Cual es el nombre?"));
            nombre=nombre.toUpperCase();
            if(!"FIN".equals(nombre)){
                for(int x=1; x<=6; x++){
                    nota=Double.parseDouble(JOptionPane.showInputDialog(null,"Dime la nota de la "+x+"ª asignatura"));
                    sumaNota=sumaNota + nota;
                    notas="El Alumno " + nombre + " de "+x+"ª asignatura tiene esta nota: " +notas + "\n";
                }
            }
            }while (!"FIN".equals(nombre));
        mensaje=("El Alumno " + nombre +" tiene estas notas: " +notas + "\n");
        JOptionPane.showConfirmDialog(null, mensaje);
        
    }
    
}
