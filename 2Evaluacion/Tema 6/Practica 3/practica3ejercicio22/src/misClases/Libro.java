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
public class Libro extends Obra {
    private String editorial;
    private int numeroPaginas;

    public Libro() {
       
    }

    public Libro(String editorial, int numeroPaginas, String titulo, int anoEdicion, ArrayList<Artista> artista) {
        super(titulo, anoEdicion, artista);
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "editorial=" + editorial + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
}
