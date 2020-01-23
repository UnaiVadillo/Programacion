/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1GDAW11
 */
public class Artista {
    private String nombre;
    private LocalDate fechaNacimiento;
    
    //RELACION
    private ArrayList<Obra> obra;
    private ArrayList<Pelicula> pelicula;

    public Artista() {
    }

    public Artista(String nombre, LocalDate fechaNacimiento, ArrayList<Obra> obra, ArrayList<Pelicula> pelicula) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.obra = obra;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Obra> getObra() {
        return obra;
    }

    public void setObra(ArrayList<Obra> obra) {
        this.obra = obra;
    }

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(ArrayList<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", obra=" + obra + ", pelicula=" + pelicula + '}';
    }
    
    
}
