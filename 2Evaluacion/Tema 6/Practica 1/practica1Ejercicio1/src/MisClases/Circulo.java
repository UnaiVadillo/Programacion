/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author 1GDAW11
 */
public class Circulo {
    private double radio;
    private double area;
    private double longitud;
    private double volumen;

    public Circulo() {
    }

    public Circulo(double radio, double area, double longitud, double volumen) {
        this.radio = radio;
        this.area = area;
        this.longitud = longitud;
        this.volumen = volumen;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getArea() {
        return (Math.rint(Math.PI * radio * radio));
    }


    public double getLongitud() {
        return (Math.rint(2*Math.PI*radio));
    }


    public double getVolumen() {
        return (Math.rint((4*Math.PI*radio*radio*radio)/3));
    }
}
