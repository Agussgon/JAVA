package com.company;

public class Parcial extends Examen {
    private int numeroUnidad;
    private int numeroReintentos;

    public Parcial(String titulo, String enunciado, Double nota,
                   Estudiante estudiante, int numeroUnidad, int numeroReintentos)
    {
        super(titulo, enunciado, nota, estudiante);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintentos = numeroReintentos;
    }

    public Boolean seRecupera(){
        if (this.numeroUnidad<= 3 && this.numeroReintentos <=3 ){this.numeroReintentos+= 1;
        return true;}
        else if(this.numeroUnidad > 3 && this.numeroReintentos <=2 ){
            this.numeroReintentos+= 1;
            return true;
        }else{return false; }
    }
    public Boolean puedeRecuperar (){
        Integer numero=0;
        if (this.numeroUnidad<= 3){ numero=3; }
        else if (this.numeroUnidad>3){ numero=2;}
        boolean b = this.numeroReintentos < numero;
        return b;
    }
}
