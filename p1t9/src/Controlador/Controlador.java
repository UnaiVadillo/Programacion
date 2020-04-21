/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import Vista.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Unai
 */
public class Controlador {
    
    private static BaseDatos bd;
    
    private static tPersonas tp;
    private static Opciones vm;
    private static Registrarse vreg;
    
    private static Persona p;

    public static void main(String[] args) {
      
        try{
            bd = new BaseDatos();
            bd.conectar();

            vm = new Opciones();
            vm.setLocationRelativeTo(null);
            vm.setVisible(true);

        }catch(Exception e){
            bd.desconectar();
            System.out.println(e.getMessage());
        }
         
                
       
    }
     
     public static void mostrarRegistro(){
        vm.setVisible(false);
        vreg = new Registrarse();
        vreg.setLocationRelativeTo(null);
        vreg.setVisible(true);
    }

     
    public static void insertarPersona(String nombre,String edad,String profesion,String tlf) throws Exception{
                p = new Persona(nombre,edad,profesion,tlf);
                tp.insertar(p);
    }
    
    public static void mostrarPersonas(){
        JOptionPane.showInputDialog(null, "Escribe el Nombre de la persona");
        
    }
    
    
    public static void finalizar(){
        vreg.setVisible(false);
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro programa");
    }
    
    
    
      
    
            
}
