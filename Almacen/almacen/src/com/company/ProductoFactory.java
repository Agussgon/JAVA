package com.company;

public class ProductoFactory {

    private static ProductoFactory producto;

    private ProductoFactory(){};

    /*llamando a la unica instancia Singleton*/
    public static ProductoFactory getProducto(){
      if(producto == null){
          producto = new ProductoFactory();
      }
      return producto;
    };


       public static Producto construirProducto(String o) {

           switch(o){
               case "Pelota":
                   return new Pelota("Pelota",900.0,4.5,"Rojo");
               case "Caja":
                   return new Caja("Caja Chica",200.0,10.0,15.5,15.0);
               default:
                   System.out.println("Producto inexistente");
                   return null;

           }

       };
}
