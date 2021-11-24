package com.company;

public abstract class Embarcacion {
    private Capitan capitan;
    private int anioFabricacion;
    private Double precioBase;
    private Double eslora;
    private Double valorExtra;


    public Embarcacion(Capitan capitan, int anioFabricacion, Double precioBase, Double eslora, Double valorExtra) {
        this.capitan = capitan;
        this.anioFabricacion = anioFabricacion;
        this.precioBase = precioBase;
        this.eslora = eslora;
        this.valorExtra = valorExtra;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getValorExtra() {
        return valorExtra;
    }

    public Double calcularMontoAlquiler() {
        Double extra = this.valorExtra;
        if (this.getAnioFabricacion() > 2020) {
            return this.getPrecioBase() + extra;
        } else {
            return this.getPrecioBase();
        }}


}