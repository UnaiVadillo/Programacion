
package t6p3e22nuevo;

import Excepciones.DatoNoValido;
import Modelo.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p3e22Nuevo {

    // ArrayLista para guardar todas las obras y todos los artistas.
    // No  tienen nada que ver con los arrays de las relaciones.
    private static ArrayList<Obra> obras;
    private static ArrayList<Artista> artistas;
    
    public static void main(String[] args) {
      try
      {
          obras = new ArrayList();
          artistas = new ArrayList();
          altaObras();
          mostrarDatos();
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "Problemas: "+e.getMessage());
      }
    }
    
    public static void altaObras()throws Exception
    {
        /* Creación de los distintos objetos de tipo obra (libros, peliculas, discos) 
        hasta que nos digan que no quieren continuar */
        
        do
        {
            String titulo=obtenerTitulo();
            int anoEdicion=obtenerAno();
            String tipoObra=obtenerTipo();
            
            switch(tipoObra){
                case "libro":
                case "Libro":
                    String editorial = obtenerEditorial();
                    int numeroPaginas = obtenerNumeroPaginas();
                    // Creación del objeto
                    Libro libro = new Libro(editorial,numeroPaginas,titulo,anoEdicion);
                    obtenerCreadores(libro);
                    
                    // Introducción del objeto en el arrayList
                    obras.add(libro);
                    break;
                case "disco": case "Disco":
                    String discografica = obtenerDiscografica();
                    int numeroCanciones = obtenerNumeroCanciones();
                    Disco disco = new Disco(discografica,numeroCanciones,titulo,anoEdicion);
                     obtenerCreadores(disco);
                    obras.add(disco);
                    break;
                case "pelicula": case "Pelicula":
                    String productora = obtenerProductora();
                    int duracion = obtenerDuracion();
                    Pelicula pelicula = new Pelicula(productora, duracion,titulo,anoEdicion);
                    obtenerCreadores(pelicula);
                    obtenerArtistas(pelicula);
                    obras.add(pelicula);
                    break;
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿Quieres continuar dando de alta obras?")==0);
    }
        
        public static String obtenerTitulo() throws Exception{
            // Solicitamos y validamos el título de la obra.
            boolean error;
            String titulo="";
            do
            {
                try
                {
                    titulo = JOptionPane.showInputDialog("Teclea el título de la obra");
                    Pattern patron = Pattern.compile("^[A-Z][a-z]+( [a-z]+)*$");
                    Matcher m = patron.matcher(titulo);
                    if (!m.matches())
                           throw new DatoNoValido("título");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return titulo;
        }
        
        public static int obtenerAno() throws Exception{
             // Solicitamos y validamos el año de edición de la obra.
            boolean error;
            String anoEdicion="";
            do
            {
                try
                {
                    anoEdicion = JOptionPane.showInputDialog("Teclea el año de edición de la obra");
                    Pattern patron = Pattern.compile("^[0-9]{4}$");
                    Matcher m = patron.matcher(anoEdicion);
                    if (!m.matches())
                           throw new DatoNoValido("año de edición");
                    
                    // No puede hacer más de 100 años.
                    int anoActual = LocalDate.now().getYear();
                    int diferencia = anoActual - Integer.parseInt(anoEdicion);
                    if (diferencia > 100)
                        throw new DatoNoValido("año de edición");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return Integer.parseInt(anoEdicion);
        }
        
        public static String obtenerTipo() throws Exception{
             // Solicitamos y validamos el tipo de obra.
            boolean error;
            String tipo="";
            do
            {
                try
                {
                    tipo = JOptionPane.showInputDialog("Teclea el tipo de obra");
                    Pattern patron = Pattern.compile("^([lL]ibro|[pP]elicula|[dD]isco)$");
                    Matcher m = patron.matcher(tipo);
                    if (!m.matches())
                           throw new DatoNoValido("tipo de obra");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return tipo;
        }
        
        public static String obtenerEditorial() throws Exception{
             // Solicitamos y validamos la editorial del libro.
            boolean error;
            String editorial="";
            do
            {
                try
                {
                    editorial = JOptionPane.showInputDialog("Teclea el nombre de la editorial");
                    Pattern patron = Pattern.compile("^[A-Z][a-z]+( [a-z]+)*$");
                    Matcher m = patron.matcher(editorial);
                    if (!m.matches())
                           throw new DatoNoValido("editorial");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return editorial;
        }
        
        public static int obtenerNumeroPaginas() throws Exception{
             // Solicitamos y validamos el número de páginas del libro.
            boolean error;
            String nro="";
            do
            {
                try
                {
                    nro = JOptionPane.showInputDialog("Indica el número de páginas");
                    Pattern patron = Pattern.compile("^[1-9][0-9]{0,4}$");
                    Matcher m = patron.matcher(nro);
                    if (!m.matches())
                           throw new DatoNoValido("número de páginas");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return Integer.parseInt(nro);
        }
        
        public static String obtenerDiscografica() throws Exception{
             // Solicitamos y validamos la discografia del disco
            boolean error;
            String discografica="";
            do
            {
                try
                {
                    discografica = JOptionPane.showInputDialog("Teclea el nombre de la discografica");
                    Pattern patron = Pattern.compile("^[A-Z][a-z]+( [a-z]+)*$");
                    Matcher m = patron.matcher(discografica);
                    if (!m.matches())
                           throw new DatoNoValido("discografica");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return discografica;
        }
        
        public static int obtenerNumeroCanciones() throws Exception{
             // Solicitamos y validamos el número de canciones del disco.
            boolean error;
            String nro="";
            do
            {
                try
                {
                    nro = JOptionPane.showInputDialog("Indica el número de canciones");
                    Pattern patron = Pattern.compile("^[1-9][0-9]*$");
                    Matcher m = patron.matcher(nro);
                    if (!m.matches())
                           throw new DatoNoValido("número de canciones");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return Integer.parseInt(nro);
        }
        
        public static String obtenerProductora() throws Exception{
             // Solicitamos y validamos la productora de la película.
            boolean error;
            String productora="";
            do
            {
                try
                {
                    productora = JOptionPane.showInputDialog("Teclea el nombre de la productora");
                    Pattern patron = Pattern.compile("^[A-Z][a-z]+( [a-z]+)*$");
                    Matcher m = patron.matcher(productora);
                    if (!m.matches())
                           throw new DatoNoValido("productora");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return productora;
        }
        
        public static int obtenerDuracion() throws Exception{
            // Solicitamos y validamos la duración de la película.
            boolean error;
            String nro="";
            do
            {
                try
                {
                    nro = JOptionPane.showInputDialog("Indica la duración de la película");
                    Pattern patron = Pattern.compile("^[1-9][0-9]*$");
                    Matcher m = patron.matcher(nro);
                    if (!m.matches())
                           throw new DatoNoValido("duración");
                    error = false;
                }
                catch(DatoNoValido e)
                {
                    JOptionPane.showMessageDialog(null, e.getMensaje());
                    error = true;
                }
            }
            while(error);
            return Integer.parseInt(nro);
        }
        
        public static void obtenerCreadores(Obra o) throws Exception
        {
             // Solicitamos los artistas creadores de la obra.
            boolean error;
            do
            {
                Artista a = obtenerCreador();
                // Relaciones.
                a.setObra(o);
                o.setArtista(a);
                    
            }
            while(JOptionPane.showConfirmDialog(null,"¿Hay más artistas creadores?")==0);
        }
        
        public static Artista obtenerCreador() throws Exception
        {
           boolean error=false;
           Artista a=null;
           do
           {
                try
                {
                    String nombre = JOptionPane.showInputDialog("Indica el nombre artista creador o interviniente");
                    Pattern patron = Pattern.compile("^[A-Z][a-z]+([  ][A-Z][a-z]+)*$");
                    Matcher m = patron.matcher(nombre);
                    if (!m.matches())
                        throw new DatoNoValido("nombre");

                    // ¿Es nuevo o ya existe?
                    int x;
                    for(x = 0; x < artistas.size() && artistas.get(x).getNombre().compareTo(nombre)!=0;x++);
                    if (x == artistas.size())
                    {   
                        // es nuevo
                        a = new Artista(nombre,obtenerFechaNacimiento());
                        artistas.add(a);

                    }
                    else
                    {
                        // ya existe, solo hay que relacionar.
                        a=artistas.get(x);
                    }
                }
                catch(DatoNoValido e)
                {
                   JOptionPane.showMessageDialog(null, e.getMensaje());
                   error = true;
                }
            }
            while(error);
           return a;
        }

        public static LocalDate obtenerFechaNacimiento() throws Exception
        {
            LocalDate fecha=null;
            boolean error;
            do
            {
                try
                {
                String f = JOptionPane.showInputDialog("Indica la fecha de nacimiento del artista");  
                Pattern patron = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
                Matcher m = patron.matcher(f);
                if (!m.matches())
                        throw new DatoNoValido("fecha");
                
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
        
        
        public static void obtenerArtistas(Pelicula p) throws Exception
        {
             // Solicitamos los artistas que intervienen en la película
            boolean error;
            do
            {
                Artista a = obtenerCreador();
                // Relación
                a.setPelicula(p);   
            }
            while(JOptionPane.showConfirmDialog(null,"¿Hay más artistas que intervienen?")==0);
        }
        public static void mostrarDatos() throws Exception{
        // Datos de todas las obras
         for(Obra o: obras)
            if (o instanceof Pelicula)
            {
                Pelicula p = (Pelicula) o;
                JOptionPane.showMessageDialog(null, p.toString());
            }
            else
                if (o instanceof Disco)
                {
                    Disco d = (Disco) o;
                    JOptionPane.showMessageDialog(null, d.toString());
                }
                else
                {
                    Libro l = (Libro) o;
                    JOptionPane.showMessageDialog(null, l.toString());
                }
        
            
            for(Artista a: artistas)
                JOptionPane.showMessageDialog(null,a.toString2());
            
        }
    
}

