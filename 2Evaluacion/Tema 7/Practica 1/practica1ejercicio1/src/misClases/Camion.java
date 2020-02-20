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
public class Camion extends Vehiculo{
    private marcaCamion marca;

    public Camion() {
    }

    public Camion(marcaCamion marca) {
        this.marca = marca;
    }

    public Camion(String matricula, Persona persona, marcaCamion marca) {
        super(matricula, persona);
        this.marca = marca;
    }

    public marcaCamion getMarca() {
        return marca;
    }

    public void setMarca(marcaCamion marca) {
        this.marca = marca;
    }
    
}
