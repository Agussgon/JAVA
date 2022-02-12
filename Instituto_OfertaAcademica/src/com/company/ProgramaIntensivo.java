package com.company;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica{

    private Double porcentajeBonificacion;
    private ArrayList<OfertaAcademica>cursos;

    public ProgramaIntensivo() {
        super();
        this.porcentajeBonificacion= porcentajeBonificacion;
        cursos = new ArrayList<>();
    }

    //
    public void agregarCursos(OfertaAcademica curso){
        cursos.add(curso);
    }

    //No olvidar el tipo de dato de curso
    @Override
    public Double calcularPrecio() {
        Double precioTotal=0.0;
        for (OfertaAcademica curso:cursos){
          precioTotal +=   curso.calcularPrecio();

        }
        return precioTotal;
    }
  public ArrayList<OfertaAcademica> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<OfertaAcademica> cursos) {
        this.cursos = cursos;
    }
    public Double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(Double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }


}
