/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import misClases.Estudio;
import misClases.Película;
/**
 *
 * @author 1GDAW11
 */
public class Practica2Ejercicio1 {

    private static ArrayList<Película> listaPeliculas=new ArrayList();
    private static ArrayList<Estudio> listaEstudios=new ArrayList();
    public static void main(String[] args) {
        ArrayList<String> telefonos =new ArrayList();
        telefonos.add("88888");
        Estudio estudio1 = new Estudio();
        estudio1.setNombre("Evolution Entertainment");
        estudio1.setCiudad("Los Angeles");
        estudio1.setDirWeb("https://www.evolutionentertainment.co.uk/");
        estudio1.setDireccion("Highland Ave");
        estudio1.setFechaFundacion(LocalDate.of(1999, 05, 12));
        estudio1.setTelefono(telefonos);
        
        telefonos=new ArrayList();
        telefonos.add("7777");
        telefonos.add("99999");
        Estudio estudio2 = new Estudio();
        estudio2.setNombre("Lionsgate Films");
        estudio2.setCiudad("Santa Monica");
        estudio2.setDirWeb("www.lionsgate.com");
        estudio2.setDireccion("Colorado Ave");
        estudio2.setFechaFundacion(LocalDate.of(1995,8,24));
        estudio2.setTelefono(telefonos);
        listaEstudios.add(estudio1);
        listaEstudios.add(estudio2);
        
        ArrayList<Estudio> lista = new ArrayList();
        lista.add(estudio1);
        lista.add(estudio2);
        Película pelicula1= new Película();
        pelicula1.setTitulo("Saw");
        pelicula1.setAno("2009");
        pelicula1.setDuracion(150f);
        pelicula1.setTipo("Terror");
        pelicula1.setEstudios(lista);
        
        lista = new ArrayList();
        lista.add(estudio2);
        Película pelicula2= new Película();
        pelicula2.setTitulo("El silencio de la ciudad blanca");
        pelicula2.setAno("2019");
        pelicula2.setDuracion(110f);
        pelicula2.setTipo("Intriga");
        pelicula2.setEstudios(lista);
        
        listaPeliculas.add(pelicula1);
        listaPeliculas.add(pelicula2);
        
    }
    
}
