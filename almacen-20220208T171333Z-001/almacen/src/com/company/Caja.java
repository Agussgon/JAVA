package com.company;

public class Caja extends Producto{

    private Double longitud;
    private Double ancho;
    private Double altura;


    /*por que no aparece el super?*/

    public Caja(String nombre, Double precio, Double longitud, Double ancho, Double altura) {
        super(nombre, precio);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /*seguir*/
    @Override
    public Double calcularEspacio() {

        return 2 * ancho * altura + 2 * ancho *longitud + 2 * longitud * altura;
    }

    @Override
    public String toString() {
        return "El producto es "+ getNombre() + " su precio es de $"+ getPrecio()+" y medidas : "+
                getAltura() + getAncho() + getLongitud();
    }
}
