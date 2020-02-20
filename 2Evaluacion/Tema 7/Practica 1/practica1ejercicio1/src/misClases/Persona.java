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
public class Persona {
    private String DNI;
    private String nombreApellidos;
    private String direccion;
    private String telefono;
    
    ArrayList<Vehiculo> vehiculos= new ArrayList<>();
    
    public Persona() {
    }

    public Persona(String DNI, String nombreApellidos, String direccion, String telefono) {
        this.DNI = DNI;
        this.nombreApellidos = nombreApellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombreApellidos=" + nombreApellidos + ", direccion=" + direccion + ", telefono=" + telefono + ", vehiculos=" + vehiculos + '}';
    }

    
    
}
