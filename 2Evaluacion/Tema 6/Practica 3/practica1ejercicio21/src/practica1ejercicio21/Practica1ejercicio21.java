 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ejercicio21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import misClases.Alumno;

/**
 *
 * @author 1GDAW11
 */
public class Practica1ejercicio21 {
        private static ArrayList<Alumno> alumnos;
        private static String codigo,nombre, domicilio, telefono, edad, sexo;
        private static LocalDate fechaNacimiento;
        private static String correoPersonal,correoCentro, paginaWeb, estadoCivil;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        do{
            Alumno a1= new Alumno();
            
            a1.setCodigo(entradaCodigo());
            a1.setNombre(entradaNombre());
            a1.setDomicilio(entradaDomicilio());
            a1.setTelefono(entradaTelefono());
            a1.setEdad(entradaEdad());
            a1.setSexo(entradaSexo());
            a1.setFechaNacimiento(entradaFechaNacimiento());
            a1.setCorreoPersonal(entradaCorreoPersonal());
            a1.setCorreoCentro(entradaCorreoCentro());
            a1.setPaginaWeb(entradaPaginaWeb());
            a1.setEstadoCivil(entradaEstadoCivil());
            alumnos.add(a1);
            
        }while(JOptionPane.showConfirmDialog(null,"¿Quieres introducir otro Alumno?")==0);
    }

    private static String entradaCodigo() {
        boolean condi;
        do{
            codigo=JOptionPane.showInputDialog("Introduce el codigo del Alumno");
            Pattern p1=Pattern.compile("^[0-9]{5}$");
            Matcher m1=p1.matcher(codigo);
            if(!m1.matches()){
                JOptionPane.showMessageDialog(null, "No es un codigo valido");
            }else{
                condi=false;
            } 
            return codigo;
        }while(condi);   
    }

    private static String entradaNombre() {
        boolean condi;
        do{
            nombre=JOptionPane.showInputDialog("Introduce el nombre del Alumno");
            Pattern p1=Pattern.compile("^[A-z]+[ ]?[A-z]+$");
            Matcher m1=p1.matcher(nombre);
            if(!m1.matches()){
                JOptionPane.showMessageDialog(null, "No es un nombre valido");
            }else{
                condi=false;
            } 
            return nombre;
        }while(condi);  
    }

    private static String entradaDomicilio() {
        boolean condi;
        do{
            domicilio=JOptionPane.showInputDialog("Introduce el domicilio(Calle, Portal y Piso(num y letra)) del Alumno");
            Pattern p1=Pattern.compile("^[A-z]+[ ]?[A-z]+[ ][0-9]{1,3}[ ][0-9][ABCDI]$");
            Matcher m1=p1.matcher(nombre);
            if(!m1.matches()){
                JOptionPane.showMessageDialog(null, "No es un domicilio valido");
            }else{
                condi=false;
            } 
            return domicilio;
        }while(condi); 
    }

    private static String entradaTelefono() {
        boolean condi;
        do{
            telefono=JOptionPane.showInputDialog("Introduce el telefono del Alumno");
            Pattern p1=Pattern.compile("^[0-9][9]$");
            Matcher m1=p1.matcher(telefono);
            if(!m1.matches()){
                JOptionPane.showMessageDialog(null, "No es un telefono valido");
            }else{
                condi=false;
            } 
            return telefono;
        }while(condi);
    }

    private static String entradaEdad() {
        boolean condi;
        do{
            edad=JOptionPane.showInputDialog("Introduce la edad del Alumno");
            Pattern p1=Pattern.compile("^[0-9]{1,2}$");
            Matcher m1=p1.matcher(edad);
            if(!m1.matches()){
                JOptionPane.showMessageDialog(null, "No es una edad valido");
            }else{
                condi=false;
            } 
            return edad;
        }while(condi);
    }

    private static String entradaSexo() {
        
    }

    private static LocalDate entradaFechaNacimiento() {
        
    }

    private static String entradaCorreoPersonal() {
        
    }

    private static String entradaCorreoCentro() {
        
    }

    private static String entradaPaginaWeb() {
        
    }

    private static String entradaEstadoCivil() {
        
    }
    
}
