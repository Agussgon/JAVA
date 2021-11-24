package com.company;

public class Final extends Examen implements Comparable {

    private Double notaOral;
    private String temaOral;

    public Final(String titulo, String enunciado, Double nota, Estudiante estudiante,
                 Double notaOral, String temaOral) {
        super(titulo, enunciado, nota, estudiante);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    public Double calcularPromedio() {
        return (this.notaOral + this.getNota()) / 2;
    }

    @Override
    public Boolean estaAprobado() {
        Double promedio = this.calcularPromedio();
        return promedio > 4.0;
    }

    @Override
    public int compareTo(Object o) {
        Final nota2 = (Final) o;
        Double promedioNota2= nota2.calcularPromedio();
        Double promedioNota1= this.calcularPromedio();
        if (promedioNota2> promedioNota1) {
            return -1;
        } else if (promedioNota2< promedioNota1) {
            return 1;
        } else{return 0;}
    }

    /*return (int)(nota2.calcularPromedio()- this.calcularPromedio());*/
}
