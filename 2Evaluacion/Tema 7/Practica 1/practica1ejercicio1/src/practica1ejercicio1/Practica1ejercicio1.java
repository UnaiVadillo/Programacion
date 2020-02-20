/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ejercicio1;

import Excepciones.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import misClases.*;

/**
 *
 * @author 1GDAW11
 */
public class Practica1ejercicio1 {

    private static ArrayList<Persona> listaPersonas;
    private static ArrayList<Vehiculo> listaVehiculos;
            
    public static void main(String[] args) {
        try{
        listaPersonas = new ArrayList();
        vehiculos = new ArrayList();
        altaVehiculos();
        mostrar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas" + e.getMessage());
        }
    }
    public static void altaVehiculos()throws Exception
    {
        /* Creación de los distintos objetos de tipo obra (libros, peliculas, discos) 
        hasta que nos digan que no quieren continuar */
        
      
    }
    public static void alta() throws Exception{
        do{
            Persona persona = datosPersona();
            
            persona.setVehiculos(datosVehiculos(persona));
            
            listasPersonas.add(persona);
            
        }while(JOptionPane.showConfirmDialog(null,"¿Quieres continuar dando de alta a personas?")==0);
    }
    
    public static Persona datosPersona() throws Exception {
        return new Persona(obtenerDni(), obtenerNombresApellidos(), obtenerDireccion(), obtenerTelefono());
    }
    public static String obtenerDni() throws Exception{
        String dni=JOptionPane.showInputDialog("Teclea un DNI");
        Pattern p = Pattern.compile("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
        Matcher m = p.matcher(dni);
        char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
   
        final String dni2=dni;
        if(listaPersonas.stream().anyMatch (pe -> pe.getDNI().equals(dni2)))
            throw new DniNoValido();
        return dni;
    }
    public static String obtenerNombresApellidos() throws Exception {
        String nombreApellidos=JOptionPane.showInputDialog("Teclea el nombre y apellidos");
        Pattern p = Pattern.compile("^[A-Z][a-z]+[ ])+$");
        Matcher m = p.matcher(nombreApellidos);
        if(!m.matches()){
            throw new NombresApellidosNoValidos();
        }
        return nombreApellidos;
    }
    public static String obtenerDireccion() throws Exception {
        String direccion=JOptionPane.showInputDialog("Teclea el direccion");
        Pattern p = Pattern.compile("^([A-Z][a-z]+[ ]?[A-Z][a-z]+)[ ] $");
        Matcher m = p.matcher(direccion);
        if(!m.matches()){
            throw new DireccionNoValido();
        }
        return direccion;
    }
    public static String obtenerTelefono() throws Exception{
        String telefono=JOptionPane.showInputDialog("Teclea un telefono");
        Pattern p = Pattern.compile("^[6789][0-9]{8}$");
        Matcher m = p.matcher(telefono);
        if(!m.matches()){
            throw new TelefonoNoValido();
        }
        return telefono;
    }
    public static ArrayList<Vehiculo> datosVehiculos(Persona p) throws Exception{
        ArrayList<Vehiculo> vehiculos=new ArrayList();
        do{

            String tipoVehiculo = obtenerTipo();
            switch(tipoVehiculo){
                case "Coche": case "coche":
                    vehiculos.add(new Coche(obtenerMatricula(), p,obtenerMarcaCoche() ));
                    
                    break;
                case "Moto": case "moto":
                    vehiculos.add(new Moto(obtenerMatricula(), p,obtenerMarcaMoto() ));
                    
                    break;
                case "camion": case "Camion":
                    vehiculos.add(new Camion(obtenerMatricula(), p,obtenerMarcaCamion() ));;
                    break;
            }
            listaVehiculos.add(vehiculos.get(vehiculos.size()-1));
        }
        while(JOptionPane.showConfirmDialog(null,"¿Quieres continuar dando de alta vehiculos?")==0);
        return vehiculos;
    }
    public static String obtenerTipo(){
        boolean correcto=false;
        String tipo;
        do{
            tipo=JOptionPane.showInputDialog("Introduce que tipo de Vehiculo quieres introducir: Coche, Camion o Moto");
            
        }while(correcto=false);
        return tipo;
    }
    public static void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String obtenerMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Persona obtenerPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static marcaCoche obtenerMarcaCoche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static marcaMoto obtenerMarcaMoto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static marcaCamion obtenerMarcaCamion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
