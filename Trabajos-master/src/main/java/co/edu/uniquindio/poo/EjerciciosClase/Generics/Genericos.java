package co.edu.uniquindio.poo.EjerciciosClase.Generics;

import java.util.ArrayList;

public class Genericos {
    static void main(){

        ArrayList lista = new ArrayList<>();

        lista.add("Hola");
        Integer o = (Integer) lista.get(0);

        if(lista.get(0) instanceof Integer){

        }

        System.out.println();
    }
}
