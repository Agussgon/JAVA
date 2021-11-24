package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Estudiante estudiante1= new Estudiante("Juan","Perez",2);

        Examen parcial1 = new Parcial("parcial1","algoritmos",7.0, estudiante1,
                2,1);
        System.out.println(parcial1.estaAprobado());

        Parcial parcial2= new Parcial("parcial2","ecuaciones",
                3.0,estudiante1,1,4);
        System.out.println(parcial2.estaAprobado());
        Boolean recupera= ((Parcial)parcial1).seRecupera();
        System.out.println("recupera si o no?:" + recupera);
        Boolean recupera2= ((Parcial)parcial2).puedeRecuperar();
        System.out.println("recupera? otra forma sin sumar intentos" + recupera2);

        Examen final1= new Final("final1","conceptos",6.0,estudiante1,
                4.0,"cuentas");
        System.out.println(final1.estaAprobado());
        Examen otroexamen = new Final("final2","POO",2.0,estudiante1,
                5.0,"hola");
        int comparar= ((Final) final1).compareTo(otroexamen);
        System.out.println(comparar);


    }
}
