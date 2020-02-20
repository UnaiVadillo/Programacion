package Modelo;

public class Libro extends Obra{
    
    private String editorial;
    private int numeroPaginas;

    public Libro(String editorial, int numeroPaginas, String titulo, int anoEdición) {
        super(titulo, anoEdición);
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
    public String toString(){
        return super.toString() + "\n" + "Editorial: " + this.editorial + "\n Número de páginas:" + this.numeroPaginas + "\n";
    }
    
}
