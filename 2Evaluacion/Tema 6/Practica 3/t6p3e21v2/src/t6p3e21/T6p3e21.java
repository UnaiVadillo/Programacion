
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
        String codigo = obtenerDato("codigo","^[0-9]{5}$");
        
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
                
                String codigo = obtenerDato("codigo","^[0-9]{5}$");
                String nombre = obtenerDato("nombre","^[A-Z][a-z]+( [A-Z][a-z]+)*$");
                String domicilio = obtenerDato("domicilio","^C/([A-Z][a-z]+)([ ][A-Z][a-z]+)*[ ][0-9]{1,3}[ ][0-9]{1,2}[A-Z]$");
                String telefono = obtenerDato("telefono","^[6789][0-9]{8}$");
                int edad= Integer.parseInt(obtenerDato("edad","^[0-9]{2}$"));
                LocalDate fechaNacimiento = obtenerFecha(); // Transformación a LocalDate
                String emailParticular = obtenerDato("email particular","^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+.([a-z]{2,4})$");
            
                // Llenado
                a.setCodigo(codigo);
                a.setNombre(nombre);
                a.setDomicilio(domicilio);
                a.setEdad(edad);
                a.setEmailPersonal(emailParticular);
                a.setFechaNacimiento(fechaNacimiento);
                a.setTelefono(telefono);
                a.setSexo(obtenerDato("sexo","^[HMO]$").charAt(0));
                a.setEmailCentro(obtenerDato("email del centro","^[a-z]+.[a-z]+@ikasle.egibide.org$"));
                a.setPaginaWeb(obtenerPaginaWeb()); // Es opcional
                a.setCurso(obtenerDato("curso","^1(1[1-4][A-D]|[234][1-2][A-M])[ABD]$"));
                a.setEstadoCivil(obtenerDato("estado civil","^(casado|soltero)$"));
                
                lista.add(a);
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Hay más alumnos en clase?")==0);
        return lista;
    }
    
    public static String obtenerDato(String campo, String expreg)throws Exception{
        String dato="";
        boolean error;
        do
        {
            try
            {
                dato = JOptionPane.showInputDialog("Indica el " + campo + " del alumno");
                Pattern patron = Pattern.compile(expreg);
                Matcher m = patron.matcher(dato);
                if (!m.matches())
                    throw new DatoNoValido(campo);
                error = false;
            }
            catch(DatoNoValido e)
            {
                JOptionPane.showMessageDialog(null, e.getMensaje());
                error = true;
            }
        }
        while(error);
        return dato;
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
    
}
