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
public class Pelicula extends Obra{
    private String productora;
    private int duracion;

    public Pelicula() {
    }
    
    
    public Pelicula(String productora, int duracion, String titulo, int anoEdicion, ArrayList<Artista> artista) {
        super(titulo, anoEdicion, artista);
        this.productora = productora;
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "productora=" + productora + ", duracion=" + duracion + '}';
    }
    
    
}
