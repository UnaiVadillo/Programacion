/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ejercicio1;
import MisClases.Circulo;
import javax.swing.JOptionPane;
/**
 *
 * @author 1GDAW11
 */
public class Practica1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1= new Circulo();
        c1.setRadio(Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio")));
        
        JOptionPane.showMessageDialog(null,"El circulo de radio "+c1.getRadio()+" tiene de area "+c1.getArea() +" tiene de longitud "+  c1.getLongitud()+" y de volumen "+c1.getVolumen());
    }
    
}
