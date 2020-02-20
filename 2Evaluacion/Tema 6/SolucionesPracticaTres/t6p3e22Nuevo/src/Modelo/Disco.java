
package Modelo;

public class Disco extends Obra{
    
    private String discografica;
    private int numeroCanciones;

    public Disco(String discografica, int numeroCanciones, String titulo, int anoEdición) {
        super(titulo, anoEdición);
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
    public String toString(){
        return super.toString() + "\n" + "Discográfica: " + this.discografica + "\n Número de canciones:" + this.numeroCanciones + "\n";
    }
}
