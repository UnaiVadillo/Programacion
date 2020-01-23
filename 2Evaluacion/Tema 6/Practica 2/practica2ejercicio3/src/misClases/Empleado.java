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
public class Empleado extends Persona{
    private String sueldo_bruto;

    public Empleado() {
    }

    public Empleado(String sueldo_bruto, String nombre, String edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }
    public String getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(String sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    @Override
    public String mostrar(){
        return "Empleado{" + "Nombre= " + this.getNombre() + ", edad= " + this.getEdad() + ", sueldo bruto= "+sueldo_bruto +'}';
    }
    public String calcularSalarioNeto(){
        return "IMPLEMENTAR";
    }
}
