
package Modelo;

import java.util.ArrayList;

public class Obra {
    private String titulo;
    private int anoEdición;
    private ArrayList<Artista> creadores;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEdición() {
        return anoEdición;
    }

    public void setAnoEdición(int anoEdición) {
        this.anoEdición = anoEdición;
    }

    public ArrayList<Artista> getCreadores() {
        return creadores;
    }

    public void setCreadores(ArrayList<Artista> creadores) {
        this.creadores = creadores;
    }


   
    public Obra(String titulo, int anoEdición) {
        this.titulo = titulo;
        this.anoEdición = anoEdición;
        this.creadores = new ArrayList<Artista>();
    }
    
   public void setArtista(Artista a)
   {
       creadores.add(a);
   }
   
   @Override
   public String toString()
   {
       String cadena="";
       for(Artista a: creadores)
       {
           cadena +=a.toString();
       }
       
       return "\nTitulo: " + this.titulo + "\n" + "Año de edición: " + this.anoEdición + "\n" + "Creadores: " + cadena + "\n";   
   }
   public String toString2()
   {
       return "\nTitulo: " + this.titulo + "\n" + "Año de edición: " + this.anoEdición;   
   }
    
}
