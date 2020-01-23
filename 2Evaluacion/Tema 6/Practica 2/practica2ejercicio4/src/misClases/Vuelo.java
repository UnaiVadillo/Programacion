/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1GDAW11
 */
public class Vuelo {
    private int numVuelo;
    private String horaSalida;
    private String horaLlegada;
    private String lugarOrigen;
    private String lugarDestino;
    private Date fechaSalida;
    private Date fechaRegresa;
    private String tipoVuelo;
    private ArrayList<Asiento> asientos;
    private ArrayList<Pasajero> pasajeros;
    
    private Avion avion;
    private Piloto piloto;
    private Ciudad ciudad;

    public Vuelo() {
    }

    public Vuelo(int numVuelo, String horaSalida, String horaLlegada, String lugarOrigen, String lugarDestino, Date fechaSalida, Date fechaRegresa, String tipoVuelo, ArrayList<Asiento> asientos, ArrayList<Pasajero> pasajeros, Avion avion, Piloto piloto, Ciudad ciudad) {
        this.numVuelo = numVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fechaSalida = fechaSalida;
        this.fechaRegresa = fechaRegresa;
        this.tipoVuelo = tipoVuelo;
        this.asientos = asientos;
        this.pasajeros = pasajeros;
        this.avion = avion;
        this.piloto = piloto;
        this.ciudad = ciudad;
    }

    

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegresa() {
        return fechaRegresa;
    }

    public void setFechaRegresa(Date fechaRegresa) {
        this.fechaRegresa = fechaRegresa;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
    public void reservar(){
        
    }
    public void modificar(){
       
    }
    public void eliminar(){
        
    }
    public Vuelo buscar(){
        return null;
    }
    
}
