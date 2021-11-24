package com.company;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private Double nota;
    private Estudiante estudiante;

    public Examen(String titulo, String enunciado, Double nota, Estudiante estudiante) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.estudiante = estudiante;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Boolean estaAprobado(){return this.getNota()>= 4;}
}
