package com.company;

public abstract class OfertaAcademica {
 //atributos
    private String nombre;
    private String descripcion;

    //constructor
    public OfertaAcademica() {
    }

    //metodo abstracto a heredar
    public abstract Double calcularPrecio();

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

    @Override
    public  String toString() {
        return "La Oferta Academica es: " + this.getNombre() +" , tiene un valor de $"
                + this.calcularPrecio();
    }
}
