/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW11
 */
public class Persona {
    private String nombre;
    private int dNacimiento;
    private int aNacimiento;
    private int mNacimiento;
    private String direccion;
    private String cod_postal;
    private String ciudad;

    public Persona(String nombre, int dNacimiento, int aNacimiento, int mNacimiento, String direccion, String cod_postal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.aNacimiento = aNacimiento;
        this.mNacimiento = mNacimiento;
        this.direccion = direccion;
        this.cod_postal = cod_postal;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return "Persona{" + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", nacimiento="+aNacimiento+mNacimiento+dNacimiento +'}';
    }
    public void esMayor(int aNacimiento, int mNacimiento, int dNacimiento){
        
        String fechaString=dNacimiento+"/"+mNacimiento+"/"+aNacimiento;
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha=LocalDate.parse(fechaString,formato);
        
        LocalDate fechaHoy= LocalDate.now();
        
        Period diferencia=Period.between(fechaHoy, fecha);
        JOptionPane.showMessageDialog(null, "Tienes" + diferencia.getYears()+" años");        
    }
}
