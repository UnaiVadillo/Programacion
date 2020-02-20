
package t6p3e21;

import Excepciones.*;
import Modelo.Alumno;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e21 {

    public static void main(String[] args) {
        try
        {
            ArrayList<Alumno> listaClase;
            listaClase = obtenerDatosAlumnos();
            buscarPorCodigo(listaClase);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Problemas " + e.getMessage());
        }
    }
    
    
    public static void buscarPorCodigo(ArrayList<Alumno> lista) throws Exception{
        JOptionPane.showMessageDialog(null, "Ahora procederemos a buscar los datos de un alumno");
        String codigo = obtenerCodigo();
        
        // Buscar
        int x;
        for(x = 0; x < lista.size() && !lista.get(x).getCodigo().equals(codigo); x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: \n" + lista.get(x).toString());
    }
    
    public static ArrayList<Alumno> obtenerDatosAlumnos() throws Exception{
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
             // Creación
                Alumno a = new Alumno();
                
                String codigo = obtenerCodigo();
                String nombre = obtenerNombre();
                String domicilio = obtenerDomicilio();
                String telefono = obtenerTelefono();
                int edad= obtenerEdad();
                LocalDate fechaNacimiento = obtenerFecha();
                String emailParticular = obtenerEmailParticular();
            
                // Llenado
                a.setCodigo(codigo);
                a.setNombre(nombre);
                a.setDomicilio(domicilio);
                a.setEdad(edad);
                a.setEmailPersonal(emailParticular);
                a.setFechaNacimiento(fechaNacimiento);
                a.setTelefono(telefono);
                a.setSexo(obtenerSexo());
                a.setEmailCentro(obtenerEmailCentro());
                a.setPaginaWeb(obtenerPaginaWeb());
                a.setCurso(obtenerCurso());
                a.setEstadoCivil(obtenerEstadoCivil());
                
                lista.add(a);
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Hay más alumnos en clase?")==0);
        return lista;
    }
    
    public static String obtenerCodigo()throws Exception{
        String codigo="";
        boolean error;
        do
        {
            try
            {
                codigo = JOptionPane.showInputDialog("Indica el código del alumno");
                Pattern patron = Pattern.compile("^[0-9]{5}$");
                Matcher m = patron.matcher(codigo);
                if (!m.matches())
                    throw new DatoNoValido("Código");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return codigo;
    }
    
    public static String obtenerNombre()throws Exception{
        String nombre="";
        boolean error;
        do
        {
            try
            {
                nombre = JOptionPane.showInputDialog("Indica el nombre del alumno");
                Pattern patron = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                Matcher m = patron.matcher(nombre);
                if (!m.matches())
                    throw new DatoNoValido("Nombre");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return nombre;
    }
    
    public static String obtenerDomicilio() throws Exception{
        String domicilio="";
        boolean error = false;
        do
        {
            try
            {
                domicilio = JOptionPane.showInputDialog("Indica el domicilio del alumno");
                Pattern patron = Pattern.compile("^C/([A-Z][a-z]+)([ ][A-Z][a-z]+)*[ ][0-9]{1,3}[ ][0-9]{1,2}[A-Z]$");
                Matcher m = patron.matcher(domicilio);
                if (!m.matches())
                    throw new DatoNoValido("Domicilio");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return domicilio;
    }
    
    public static String obtenerTelefono() throws Exception{
        String telefono="";
        boolean error = false;
        do
        {
            try
            {
                telefono = JOptionPane.showInputDialog("Indica el telefono del alumno");
                Pattern patron = Pattern.compile("^[6789][0-9]{8}$");
                Matcher m = patron.matcher(telefono);
                if (!m.matches())
                    throw new DatoNoValido("Teléfono");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return telefono;
    }
    
    public static int obtenerEdad() throws Exception{
        String edad="";
        boolean error;
        do
        {
            try
            {
                edad = JOptionPane.showInputDialog("Indica la edad del alumno");
                Pattern patron = Pattern.compile("^[0-9]{2}$");
                Matcher m = patron.matcher(edad);
                if (!m.matches())
                    throw new DatoNoValido("Edad");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return Integer.parseInt(edad);
    }
    
    public static String obtenerEmailParticular() throws Exception{
        String email="";
        boolean error;
        do
        {
            try
            {
                email = JOptionPane.showInputDialog("Indica el email particular del alumno");
                Pattern patron = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+.([a-z]{2,4})$");
                Matcher m = patron.matcher(email);
                if (!m.matches())
                    throw new DatoNoValido("Email particular");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return email;
    }
    
    public static String obtenerEmailCentro() throws Exception{
        String email="";
        boolean error;
        do
        {
            try
            {
                email = JOptionPane.showInputDialog("Indica el email del centro del alumno");
                // nombre.apellido@ikasle.egibide.org
                Pattern patron = Pattern.compile("^[a-z]+.[a-z]+@ikasle.egibide.org$");
                Matcher m = patron.matcher(email);
                if (!m.matches())
                    throw new DatoNoValido("Email del centro");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return email;
    }
    
    public static LocalDate obtenerFecha() throws Exception{
        LocalDate fecha=null;
        boolean error;
        do
        {
            try
            {
                String f = JOptionPane.showInputDialog("Indica la fecha de nacimiento del alumno");                Pattern patron = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
                Matcher m = patron.matcher(f);
                if (!m.matches())
                    throw new DatoNoValido("Fecha de nacimiento");
                
                // Convertir string en localDate
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                fecha = LocalDate.parse(f, formatter);
                // ojo que lo cambia si no correcto.
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
            catch(DateTimeParseException e)
            {
                JOptionPane.showMessageDialog(null, "La fecha de nacimiento no es válida");
                error = true;
            }
        }
        while(error);
        return fecha;
    }
         
    public static String obtenerEstadoCivil() throws Exception{
        String estado="";
        boolean error;
        do
        {
            try
            {
                estado = JOptionPane.showInputDialog("Indica el estado civil del alumno");
                Pattern patron = Pattern.compile("^(casado|soltero)$");
                Matcher m = patron.matcher(estado);
                if (!m.matches())
                    throw new DatoNoValido("Estado civil");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return estado;
    }
    
    public static char obtenerSexo() throws Exception{
        String sexo="";
        boolean error;
        do
        {
            try
            {
                sexo = JOptionPane.showInputDialog("Indica el sexo del alumno");
                Pattern patron = Pattern.compile("^[HMO]$");
                Matcher m = patron.matcher(sexo);
                if (!m.matches())
                    throw new DatoNoValido("Sexo");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return sexo.charAt(0);
    }
    
    public static String obtenerPaginaWeb() throws Exception{
        String pagina="";
        boolean error;
        do
        {
            try
            {
                pagina = JOptionPane.showInputDialog("Indica la página web del alumno (se puede dejar en blanco)");
                if (!pagina.isEmpty())
                {
                    /*
                    "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))" +
			"(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
			"([).!';/?:,][[:blank:]])?$";
                    */
                    Pattern patron = Pattern.compile("^www.[a-z]+.com$");
                    Matcher m = patron.matcher(pagina);
                    if (!m.matches())
                        throw new DatoNoValido("Página web");
                    error = false;
                }
                else
                    error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return pagina;
    }
    
    public static String obtenerCurso() throws Exception{
        String curso="";
        boolean error;
        do
        {
            try
            {
                curso = JOptionPane.showInputDialog("Indica el curso del alumno");
                Pattern patron = Pattern.compile("^1(1[1-4][A-D]|[234][1-2][A-M])[ABD]$");
                Matcher m = patron.matcher(curso);
                if (!m.matches())
                    throw new DatoNoValido("Curso");
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return curso;
    }
    
}
