
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artista {
    
    private String nombre;
    private LocalDate fechaNacimiento;
    private ArrayList<Obra> obras;
    private ArrayList<Pelicula> interviene;
    
    public Artista(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.obras = new ArrayList<Obra>();
        this.interviene = new ArrayList<Pelicula>();
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

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public ArrayList<Pelicula> getInterviene() {
        return interviene;
    }

    public void setInterviene(ArrayList<Pelicula> interviene) {
        this.interviene = interviene;
    }
    
    public void setObra(Obra o)
    {
        this.obras.add(o);
    }
    
    public void setPelicula(Pelicula p)
    {
        this.interviene.add(p);
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + this.nombre + "\n" + "Fecha de nacimiento: " + this.fechaNacimiento;
    }
    
    public String toString2(){
        String cadenaObras="";
        if (!obras.isEmpty())
            for(Obra o:obras)
                cadenaObras+=o.toString2();
        else
            cadenaObras= " No ha creado ninguna obra";
        
        String cadenaPeliculas="";
        if (!interviene.isEmpty())
            for(Pelicula p:interviene)
                cadenaPeliculas+=p.toString2();
        else
            cadenaPeliculas = " No ha intervenido en ninguna película";
        return "\nNombre: " + this.nombre + "\n" + "Fecha de nacimiento: " + this.fechaNacimiento + "\nPeliculas: " + cadenaPeliculas + "\nObras: " + cadenaObras;
    }
    
    
}
