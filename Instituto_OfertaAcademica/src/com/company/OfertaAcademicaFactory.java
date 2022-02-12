package com.company;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instancia;

    //construc. privado
    private OfertaAcademicaFactory() {
    }

    // llamar y crear la instancia
    public static OfertaAcademicaFactory getInstancia (){
        if (instancia == null){
            instancia = new OfertaAcademicaFactory() {};
        }
        return instancia;
    }

    //metodo
    public  OfertaAcademica crearOfertaAcademica(String oferta){
        OfertaAcademica ofertaNueva= null;
        switch (oferta) {
            case "Curso", "curso":
                ofertaNueva = new Curso();
                break;
            case "Programa Intensivo" , "Programa intensivo", "programa intensivo":
                ofertaNueva = new ProgramaIntensivo();
                break;
            case "Carrera", "carrera":
                ofertaNueva= new Carrera();
            default:
                System.out.println("Oferta Academica inexistente");;

        }

        return ofertaNueva;

    }


}
