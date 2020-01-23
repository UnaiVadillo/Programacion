/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3ejercicio22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import misClases.*;

/**
 *
 * @author 1GDAW11
 */
public class Practica3ejercicio22 {

    public static void main(String[] args) {
        ArrayList<Obra> obras= new ArrayList();
        Libro l1= new Libro();
        String titulol1 = obtenerDato("titulo del libro","^([A-Z][a-z]+[ ]?){1,6}$");
        int anoEdicionl1 = Integer.parseInt(obtenerDato("año la edicion del libro", "^((19[2-9][0-9])|(20(([0|1][0-9])|20)))$"));
        String editorial= obtenerDato("editorial","^([A-Z][a-z]+[ ]?){1,2}$");
        int numeroPaginas=Integer.parseInt(obtenerDato("numero de paginas", "^[0-9]{2,4}$"));
        l1.setAnoEdicion(anoEdicionl1);
        l1.setEditorial(editorial);
        l1.setTitulo(titulol1);
        l1.setNumeroPaginas(numeroPaginas);
       
        
        Disco d1= new Disco();
        String titulod1 = obtenerDato("titulo del disco","^([A-Z][a-z]+[ ]?){1,6}$");
        int anoEdiciond1 = Integer.parseInt(obtenerDato("año la edicion del disco",  "^((19[2-9][0-9])|(20(([0|1][0-9])|20)))$"));
        String discografica= obtenerDato("discografica","^([A-Z][a-z]+[ ]?){1,2}$");
        int numeroCanciones=Integer.parseInt(obtenerDato("numero de canciones", "^[0-9]{1,3}$"));
        d1.setAnoEdicion(anoEdiciond1);
        d1.setDiscografica(discografica);
        d1.setNumeroCanciones(numeroCanciones);
        d1.setTitulo(titulod1);
        
        Pelicula p1=new Pelicula();
        String titulop1 = obtenerDato("titulo de la pelicula","^([A-Z][a-z]+[ ]?){1,6}$");
        int anoEdicionp1 = Integer.parseInt(obtenerDato("año de edicion de la pelicula", "^((19[2-9][0-9])|(20(([0|1][0-9])|20)))$"));
        String productora= obtenerDato("productora","^([A-Z][a-z]+[ ]?){1,2}$");
        int duracion=Integer.parseInt(obtenerDato("duracion(minutos)", "^[0-9]{2,3}$"));
        p1.setAnoEdicion(anoEdicionp1);
        p1.setDuracion(duracion);
        p1.setProductora(productora);
        p1.setTitulo(titulop1);
        
        ArrayList<Artista> artistas= new ArrayList();
        Artista a1= new Artista();
        String nombrea1 = obtenerDato("nombre del artista","^([A-Z][a-z]+[ ]?){1,2}$");
        LocalDate fechaNacimiento=obtenerFecha();
        a1.setNombre(nombrea1);
        a1.setFechaNacimiento(fechaNacimiento);
       
        //Relaciones-->Artista
        ArrayList<Obra> obrasArtista=new ArrayList();
        ArrayList<Pelicula> peliculasArtista = new ArrayList();
        obrasArtista.add(p1);
        obrasArtista.add(l1); 
        artistas.add(a1);
  
        //Relaciones -->Obra
        ArrayList<Artista> artistaObras= new ArrayList();
        artistaObras.add(a1); 
        l1.setArtista(artistaObras);
        p1.setArtista(artistaObras);
        obras.add(p1);
        obras.add(d1);
        obras.add(l1);
        artistas.add(a1);
        //MOSTRAR
        JOptionPane.showMessageDialog(null, p1.toString());
        JOptionPane.showMessageDialog(null, l1.toString());
        JOptionPane.showMessageDialog(null, d1.toString());
        JOptionPane.showMessageDialog(null, a1.toString());
                
    }
    public static String obtenerDato(String campo, String expreg){
        String dato="";
        boolean error;
        do
        {
            try
            {
                dato = JOptionPane.showInputDialog("Indica el/la " + campo );
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
    public static LocalDate obtenerFecha(){
        LocalDate fecha=null;
        boolean error;
        do
        {
            try
            {
                String f = JOptionPane.showInputDialog("Indica la fecha de nacimiento del artista");                Pattern patron = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
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
}
