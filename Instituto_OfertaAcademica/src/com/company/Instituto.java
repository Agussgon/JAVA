package com.company;

import java.util.ArrayList;

public class Instituto {

    private String nombre;

    //verificar que este bien
    private ArrayList <OfertaAcademica> OfertaAcademica;

    //construc.
    public Instituto(String nombre) {
        this.nombre = nombre;
        OfertaAcademica = new ArrayList<OfertaAcademica>();
    }


    // agregar las ofertas
    public void agregarOfertaAcademica(OfertaAcademica oferta){
        OfertaAcademica.add(oferta);
    }

    // sobrescribo el metodo toString en cada clase hija de Oferta dependiendo lo que tenga que decir,
    // si es general podría realizarlo directamente en OfertaAcademica

    public ArrayList<com.company.OfertaAcademica> generarInforme(){
    return  this.OfertaAcademica;
    }

    // forma n°2
    public String generarrInforme(){
        String ofertas="Oferta academica disponible: ";
        for (OfertaAcademica oferta : OfertaAcademica){
             ofertas +=  oferta.getNombre() + ", tiene un valor de $"+ oferta.calcularPrecio()+ " . ";
        };
     return ofertas;
    }


}
