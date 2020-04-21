/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Unai
 */
public class Persona {
    private String nombre;
    private String edad;
    private String profesion;
    private String tlf;

    public Persona() {
    }

    public Persona(String nombre, String edad, String profesion, String tlf) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.tlf = tlf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTelefono() {
        return tlf;
    }

    public void setTelefono(String tlf) {
        this.tlf = tlf;
    }
    
    
}
