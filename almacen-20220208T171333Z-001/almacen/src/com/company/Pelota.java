package com.company;

public class Pelota extends Producto {

    private Double radio;
    private String color;

    public Pelota(String nombre, Double precio, Double radio, String color) {
        super(nombre, precio);
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Double calcularEspacio() {
        return 4 * Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "El producto es "+ getNombre() + " su precio es de $"+ getPrecio()+", su radio es de "+
          getRadio() + " y su color es "+  getColor()  ;
    }
}

