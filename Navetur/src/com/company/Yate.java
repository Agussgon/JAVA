package com.company;

public class Yate extends Embarcacion implements Comparable,Vela{
    private int numeroCamarotes;

    public Yate(Capitan capitan, int anioFabricacion, Double precioBase, Double eslora, Double valorExtra, int numeroCamarotes) {
        super(capitan, anioFabricacion, precioBase, eslora, valorExtra);
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate yate2= (Yate)o;
        if(this.numeroCamarotes > yate2.numeroCamarotes){
            return 1;
        }else if(this.numeroCamarotes< yate2.numeroCamarotes){
            return -1;
        }
        else{ return 0;}
    }

    @Override
    public String aVela() {
        return "Es un Yate a Vela";
    }
}
