package com.company;

public class Velero extends Embarcacion implements Vela {
    private int cantidadMastiles;

    public Velero(Capitan capitan, int anioFabricacion, Double precioBase, Double eslora,
                  Double valorExtra, int cantidadMastiles) {
        super(capitan, anioFabricacion, precioBase, eslora, valorExtra);
        this.cantidadMastiles = cantidadMastiles;
    }


    public Boolean esGrande() {
        if (this.cantidadMastiles > 4) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String aVela() {
        return "Velero a velas";

    }

}
