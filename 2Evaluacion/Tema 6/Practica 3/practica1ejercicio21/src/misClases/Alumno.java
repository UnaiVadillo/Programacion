/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import java.time.LocalDate;

/**
 *
 * @author 1GDAW11
 */
public class Alumno {
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String edad;
    private String sexo;
    private LocalDate fechaNacimiento;
    private String correoPersonal;
    private String correoCentro;
    private String estadoCivil;
    private String paginaWeb;
    
    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String domicilio, String telefono, String edad, String sexo, LocalDate fechaNacimiento, String correoPersonal, String correoCentro, String estadoCivil, String paginaWeb) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.correoPersonal = correoPersonal;
        this.correoCentro = correoCentro;
        this.estadoCivil = estadoCivil;
        this.paginaWeb= paginaWeb;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCorreoCentro() {
        return correoCentro;
    }

    public void setCorreoCentro(String correoCentro) {
        this.correoCentro = correoCentro;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", correoPersonal=" + correoPersonal + ", correoCentro=" + correoCentro + ", estadoCivil=" + estadoCivil + ", paginaWeb=" + paginaWeb + '}';
    }
    
    
    
    
}
