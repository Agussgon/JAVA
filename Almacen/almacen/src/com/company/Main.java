package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Almacen Natural = new Almacen("Natural", "Corrientes 1000");
        /*en este caso me parece que no tienen mucho sentido los get y set*/

/* medidas vienen por defecto*/

        Natural.agregarProductos("Pelota");
        Natural.agregarProductos("Caja");
        Natural.agregarProductos("Pelota");

        System.out.println(Natural.getProductos());

        System.out.println("El espacio ocupado es " + Natural.calcularEspacioTotal());










    }
}
