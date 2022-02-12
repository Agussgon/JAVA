package com.company;

public class Curso extends OfertaAcademica implements Recursable{

    private Double valorHora;
    private Double duracionMeses;
    private Double cargaHorariaMensual;

    //constructor
    public Curso() {
        super();
        this.valorHora= valorHora;
        this.duracionMeses= duracionMeses;
        this.cargaHorariaMensual= cargaHorariaMensual;
    }



    @Override
    public Double calcularPrecio() {
        Double precioTotal= valorHora* cargaHorariaMensual * duracionMeses;
        return precioTotal;
    }


    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(Double duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public Double getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(Double cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    @Override
    public String recursar() {
        return "Materia recursable";
    }
}
