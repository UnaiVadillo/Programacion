/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ejercicio2;

import java.util.ArrayList;


/**
 *
 * @author 1GDAW11
 */
public class Practica1ejercicio2 {

    public static Persona p;
    public static ArrayList<Persona> personas= new ArrayList();
    public static Vista v1 = new Vista();
    public static VistaListado v2 = new VistaListado();
    
    public static void main(String[] args) {
        v1.setVisible(true);
        v2.setVisible(false);
    }

    public static void salir() {
        v1.dispose();
        v2.setVisible(true);
        
    }
    public static void añadir(String nombre, String apellidos, String dni){
        p=new Persona();
        
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setDni(dni);
        personas.add(p);
        
    }
    public static String mostrar(){
        String mensaje= "";
        for (int x=0; x< personas.size(); x++) {
            mensaje= personas.get(x) +"\n" + mensaje;
        }
        return mensaje;
    }
   
    
}
