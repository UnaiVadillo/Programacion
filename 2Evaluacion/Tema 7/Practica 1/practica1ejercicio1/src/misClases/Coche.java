/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

/**
 *
 * @author 1GDAW11
 */
public class Coche extends Vehiculo {
    private marcaCoche marca;

    public Coche() {
    }

    public Coche(marcaCoche marca) {
        this.marca = marca;
    }

    public Coche(String matricula, Persona persona,marcaCoche marca) {
        super(matricula, persona);
        this.marca = marca;
    }

    public marcaCoche getMarca() {
        return marca;
    }

    public void setMarca(marcaCoche marca) {
        this.marca = marca;
    }
    
}
