package com.company;

public abstract class Producto {

    private String nombre;
    private Double precio;

    /*constructor*/

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /*metodo abstracto que implementaran las clases hijas*/

    public abstract Double calcularEspacio();

    /*genero get y set para que las clases hijas accedan a las propiedades*/


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


}
