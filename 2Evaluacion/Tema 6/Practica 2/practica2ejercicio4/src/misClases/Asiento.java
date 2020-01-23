/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

/**
 *
 * @author 1GDAW11
 */
public class Asiento {
    private int numAsiento;
    private boolean estado;
    private String compartimento;
    
    private Pasajero pasajero;
    private Vuelo vuelo;

    public Asiento() {
    }

    public Asiento(int numAsiento, boolean estado, String compartimento, Pasajero pasajero, Vuelo vuelo) {
        this.numAsiento = numAsiento;
        this.estado = estado;
        this.compartimento = compartimento;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
    }

    

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    
    public void reservar(){
        
    }
    public void comprar(){
        
    }
    public boolean mostrarDisponibilidad(){
        return false;
    }
    public void desbloquear(){
        
    }
}
