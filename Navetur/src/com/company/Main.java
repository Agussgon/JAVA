package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Capitan capitan=new Capitan("JUan","Dominguez",20);
        Embarcacion yate1= new Yate(capitan,2021,200.0,
                20.5,30.0,5);
        Embarcacion yate2= new Yate(capitan,2019,200.0,
                20.5,30.0,3);

        int comparar = ((Yate)yate1).compareTo(yate2);
        System.out.println("comparar yates "+ comparar);

        Embarcacion velero= new Velero(capitan,2022,100.0,
                2.0,50.0,5);

        System.out.println(velero.calcularMontoAlquiler()+" "+ ((Velero)velero).esGrande()+
                " " + ((Velero)velero).aVela());
    }
}
