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
public class Moto extends Vehiculo{
    private marcaMoto marca;

    public Moto() {
    }

    public Moto(marcaMoto marca) {
        this.marca = marca;
    }

    public Moto(String matricula, Persona persona,marcaMoto marca) {
        super(matricula, persona);
        this.marca = marca;
    }

    public marcaMoto getMarca() {
        return marca;
    }

    public void setMarca(marcaMoto marca) {
        this.marca = marca;
    }
    
}
