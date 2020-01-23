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
public class Directivo extends Empleado{
    private String categoria;
    private ArrayList<Empleado> subordinados= new ArrayList<Empleado>();

    public Directivo() {
    }

    public Directivo(String categoria, String sueldo_bruto, String nombre, String edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
    
    @Override
    public String mostrar(){
        return "Directivo{" + "Nombre= " + this.getNombre() + ", edad= " + this.getEdad() + ", sueldo bruto= "+ this.getSueldo_bruto() + ", categoria= "+ categoria + '}';
    }
}
