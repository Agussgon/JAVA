package com.company;

import java.util.ArrayList;

public class Carrera extends OfertaAcademica {
    private Double valorBase;
    private ArrayList<OfertaAcademica> cursosYtalleres;

    public Carrera() {
        super();
        valorBase= valorBase;
        cursosYtalleres = new ArrayList<>();
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

// creando excepcion
    public void agregarCursosyTalleres(OfertaAcademica oferta )throws Exception{
        if (oferta instanceof Curso){
        if(((Curso)oferta).getCargaHorariaMensual() < 10.0){
            throw new Exception("No se permite el ingreso de materias con menos de 10 horas");
        }
        }
        cursosYtalleres.add(oferta);

    }

    @Override
    public Double calcularPrecio() {
       Double precioCursosyTalleres=0.0;
       for (OfertaAcademica curso: cursosYtalleres){
           precioCursosyTalleres += curso.calcularPrecio();
       }

        return precioCursosyTalleres + this.valorBase;
    }


}
