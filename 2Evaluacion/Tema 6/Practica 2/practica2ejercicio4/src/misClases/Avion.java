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
public class Avion {
    private String aerolinea;
    private String codAvion;
    private int numAsientos;
    private String compartimentos;
    private ArrayList<Vuelo> vuelos;

    public Avion() {
        this.vuelos= new ArrayList();
    }

    public Avion(String aerolinea, String codAvion, int numAsientos, String compartimentos, ArrayList<Vuelo> vuelos) {
        this.aerolinea = aerolinea;
        this.codAvion = codAvion;
        this.numAsientos = numAsientos;
        this.compartimentos = compartimentos;
        this.vuelos = vuelos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodAvion() {
        return codAvion;
    }

    public void setCodAvion(String codAvion) {
        this.codAvion = codAvion;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public String getCompartimentos() {
        return compartimentos;
    }

    public void setCompartimentos(String compartimentos) {
        this.compartimentos = compartimentos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo v) {
        this.vuelos.add(v);
    }
    
    public void asignarAVuelo(){
        
    }
    public Avion obtener(){
        return null;
    }
    public void cancelarVuelo(){
        return;
    }
}
