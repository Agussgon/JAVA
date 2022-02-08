package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen {


    /* agregar date */
 private String nombre;
 private String direccion;

 /*aca lo vinculas con los productos*/
 private List <Producto> productos;

    public Almacen(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }



    public void agregarProductos(String producto){
            productos.add(ProductoFactory.getProducto().construirProducto(producto));
    }


    public List<Producto> getProductos() {
        return productos;
    }


    public Double calcularEspacioTotal(){
        /* preguntar como se armaba un for autom. */

        Double espacioTotal=0.0;

        for(Producto producto:productos){

            espacioTotal= espacioTotal + producto.calcularEspacio() ;
        }

        return espacioTotal;

    };





}
