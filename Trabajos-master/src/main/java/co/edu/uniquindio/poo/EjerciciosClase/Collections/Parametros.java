package co.edu.uniquindio.poo.EjerciciosClase.Collections;

public class Parametros {

    static void main() {

        Persona p = new Persona("Robinson");
        cambiarNombre(p);

        System.out.println(p.getNombre());
    }

    private static void cambiarNombre(Persona p) {
        //p.setNombre("Quintero");

        //Persona a = new Persona("Yesuu");
        //p = a;
        //p.setNombre("Quintero");

        //Persona a = p;
        //a.setNombre("Marcos");
        //p.setNombre("Maria");
        //a.setNombre("Carlos");

        p = new Persona("Luis");
    }
}