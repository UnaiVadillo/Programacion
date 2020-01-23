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
public class Obra {
    private String titulo;
    private int anoEdicion;
    
    //RELACION
     private ArrayList<Artista> artista;

    public Obra() {
    }

    public Obra(String titulo, int anoEdicion, ArrayList<Artista> artista) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public ArrayList<Artista> getArtista() {
        return artista;
    }

    public void setArtista(ArrayList<Artista> artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Obra{" + "titulo=" + titulo + ", anoEdicion=" + anoEdicion + ", artista=" + artista + '}';
    }
     
     
}
