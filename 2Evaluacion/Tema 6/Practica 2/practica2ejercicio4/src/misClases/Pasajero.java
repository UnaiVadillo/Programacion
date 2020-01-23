/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW11
 */
public class Pasajero {
    private String cedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private Asiento asiento;
    private ArrayList <Vuelo> vuelos;

    public Pasajero() {
        this.vuelos= new ArrayList();
    }

    public Pasajero(String cedula, String nombre, String apellido, String sexo, int edad, Asiento asiento, ArrayList<Vuelo> vuelos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.asiento = asiento;
        this.vuelos = vuelos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo v) {
        this.vuelos.add(v);
    }
    
    
    public void agregarNuevo(){
        
    }
    public void modificar(){
        
    }
    public void asignarVuelo(){
        
    }
    public Pasajero buscar(){
         return null;
     }
}
