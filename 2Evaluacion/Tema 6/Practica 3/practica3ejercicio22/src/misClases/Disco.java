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
public class Disco extends Obra{
    private String discografica;
    private int numeroCanciones;

    public Disco() {
    }

    public Disco(String discografica, int numeroCanciones, String titulo, int anoEdicion, ArrayList<Artista> artista) {
        super(titulo, anoEdicion, artista);
        this.discografica = discografica;
        this.numeroCanciones = numeroCanciones;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    @Override
    public String toString() {
        return "Disco{" + "discografica=" + discografica + ", numeroCanciones=" + numeroCanciones + '}';
    }
    
    
}
