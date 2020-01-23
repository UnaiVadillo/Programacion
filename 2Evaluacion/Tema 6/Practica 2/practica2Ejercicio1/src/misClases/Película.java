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
public class Película {
    private String titulo;
    private String ano;
    private float duracion;
    private String tipo;
    //Relacion
    private ArrayList<Estudio> estudios;
    
    public void nuevaPelícula(String titulo, String ano, float duracion, String tipo, ArrayList<Estudio> estudios) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
        this.tipo = tipo;
        this.estudios=estudios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(ArrayList<Estudio> estudios) {
        this.estudios = estudios;
    }
    
    
    public void despliegaPelicula(){
        
    }
    public void eliminaPelicula(){
        
    }
}
