
package Modelo;

import java.time.LocalDate;

public class Alumno {
    
    private String codigo;
    private String nombre;
    private String domicilio;
    private String telefono;
    private int edad;
    private char sexo;
    private LocalDate fechaNacimiento;
    private String emailPersonal;
    private String emailCentro;
    private String paginaWeb;
    private String curso;
    private String estadoCivil;

    public Alumno() {
    }
    
    

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getEmailCentro() {
        return emailCentro;
    }

    public void setEmailCentro(String emailCentro) {
        this.emailCentro = emailCentro;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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
    
    @Override
    public String toString(){
        String datos = "Código: " + this.codigo + "\n" +
               "Nombre: " + this.nombre + "\n" +
               "Domicilio: " + this.domicilio + "\n" +
               "Telefono: " + this.telefono + "\n" +
               "Edad: " + this.edad + "\n" +
               "Fecha de nacimiento: " + this.fechaNacimiento.toString() + "\n" +
               "Sexo: " + this.sexo + "\n" +
               "Estado civil: " + this.estadoCivil + "\n" +
               "Email particular: " + this.emailPersonal + "\n" +
               "Email centro: " + this.emailCentro + "\n" +
               "Curso: " + this.curso + "\n";
        
        if (!this.paginaWeb.isEmpty())
            datos += "Página web: " + this.paginaWeb;
        return datos;
                
    }   

}
