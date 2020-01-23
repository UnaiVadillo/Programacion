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
public class Ciudad {
    private String codCiudad;
    private String nombre;
    private ArrayList<Vuelo> vuelos;

    public Ciudad() {
    }

    public Ciudad(String codCiudad, String nombre, ArrayList<Vuelo> vuelos) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
        this.vuelos = vuelos;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo v) {
        if(vuelos==null){
            vuelos= new ArrayList();
        }
        this.vuelos.add(v);
    }
    public void agregarNuevo(){
        
    }
    public Ciudad obtener(){
        return null;
    }
}
