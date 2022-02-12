package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Instituto Instituto1=new Instituto("Cognos");

        OfertaAcademica desarrolloWebPHP= OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Curso");
        desarrolloWebPHP.setNombre("Curso de desarrollo web con PHP");

        // //  casteo
        ((Curso)desarrolloWebPHP).setValorHora(300.0);
        ((Curso)desarrolloWebPHP).setCargaHorariaMensual(16.0);
        ((Curso)desarrolloWebPHP).setDuracionMeses(2.5);

        OfertaAcademica frameworkPHP= OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Curso");
        // en este caso no es necesario
        ((Curso)frameworkPHP).setNombre("Curso de Laravel");

        ((Curso)frameworkPHP).setValorHora(300.0);
        ((Curso)frameworkPHP).setCargaHorariaMensual(9.0);
        ((Curso)frameworkPHP).setDuracionMeses(2.5);



        OfertaAcademica programaIntensivoPHP= OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("programa intensivo");
        programaIntensivoPHP.setNombre("Programa intensivo de desarrollo web con PHP, incluye Laravel ");

       // System.out.println(programaIntensivoPHP);

        ((ProgramaIntensivo)programaIntensivoPHP).agregarCursos(frameworkPHP);
        ((ProgramaIntensivo)programaIntensivoPHP).agregarCursos(desarrolloWebPHP);

        // Taller
        OfertaAcademica tallerWordPress= new Taller();
        tallerWordPress.setNombre("Taller de WordPress");
        ((Taller)tallerWordPress).setCantidadTps(3);
        ((Taller)tallerWordPress).setPrecioTp(3500.0);


        // ingresa una nueva carrera

        OfertaAcademica carreraFullstack= new Carrera();
        carreraFullstack.setNombre("Fullstack");

        ((Carrera)carreraFullstack).setValorBase(30000.0);
        try {
            ((Carrera) carreraFullstack).agregarCursosyTalleres(tallerWordPress);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ((Carrera)carreraFullstack).agregarCursosyTalleres(frameworkPHP);
        } catch (Exception e) {
            System.err.println(e.getMessage() + " .No se puede ingresar el " + frameworkPHP.getNombre());

        }
        // por defecto
        try {
            ((Carrera)carreraFullstack).agregarCursosyTalleres(desarrolloWebPHP);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ((Carrera)carreraFullstack).agregarCursosyTalleres(programaIntensivoPHP);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // agrego los cursos al instituto
        Instituto1.agregarOfertaAcademica(desarrolloWebPHP);
        Instituto1.agregarOfertaAcademica(frameworkPHP);
        Instituto1.agregarOfertaAcademica(programaIntensivoPHP);
        Instituto1.agregarOfertaAcademica(carreraFullstack);
        Instituto1.agregarOfertaAcademica(tallerWordPress);


        // 1° forma
        System.out.println(Instituto1.generarInforme());
        // 2° forma
        System.out.println(Instituto1.generarrInforme());

        // probando interface

        System.out.println( "El  " + desarrolloWebPHP.getNombre()+" es una "+ ((Curso) desarrolloWebPHP).recursar());





    }
}
