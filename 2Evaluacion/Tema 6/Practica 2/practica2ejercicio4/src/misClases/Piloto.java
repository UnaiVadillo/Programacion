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
public class Piloto {
    private String codPiloto;
    private String nombre;
    private String apellido;
    private int numLicencia;
    private ArrayList<Vuelo> vuelos;

    public Piloto() {
    }

    public Piloto(String codPiloto, String nombre, String apellido, int numLicencia, ArrayList<Vuelo> vuelos) {
        this.codPiloto = codPiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLicencia = numLicencia;
        this.vuelos = vuelos;
    }

    public String getCodPiloto() {
        return codPiloto;
    }

    public void setCodPiloto(String codPiloto) {
        this.codPiloto = codPiloto;
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

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
    public void agregarNuevo(){
        
    }
    public void asignarAVuelo(){
        
    }
    public void cancelarVuelo(){
        
    }
    public void modificar(){
        
    }
    public Piloto buscar(){
        return null;
    }
}
