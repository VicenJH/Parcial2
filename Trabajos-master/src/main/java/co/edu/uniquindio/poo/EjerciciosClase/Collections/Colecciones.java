package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Colecciones {
    static void main() {

        ArrayList<String> lista = new ArrayList<>(1000000);
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Jose");

        List<String> lista2 = new ArrayList<>(1000000);
        lista2.add("Jose");
        lista2.add("Jose");
        lista2.add("Jose");
        lista2.add("Jose");
        lista2.add("Jose");

        LinkedList<String> lista3 = new LinkedList<>();
        lista3.add("Anna");
        lista3.add("Luis");
        lista3.add("Pedro");
        lista3.add("Manuel");
        lista3.add("Sandra");

        String nombre = lista3.get(3);

        lista3.addFirst("Pedro");
        lista3.addLast("Carlos");
        String first = lista3.getFirst();


        eliminarPersonas3(lista3);

        //desarrollar un metodo que elimine los nombres de las personas que empiecen por Jo
        eliminarPersonas3(lista);
        System.out.println();
    }

    private static void eliminarPersonas3(ArrayList<String> lista) {
        ListIterator<String> listIterator = lista.listIterator();

        while(listIterator.hasNext()){
            String next = listIterator.next();
            if(next.startsWith("Jo")){
                listIterator.remove();
            }
        }
    }

    private static void eliminarPersonas3(LinkedList<String> lista) {
        ListIterator<String> listIterator = lista.listIterator();

        while(listIterator.hasNext()){
            String next = listIterator.next();
            if(next.startsWith("Jo")){
                listIterator.remove();
            }
        }
    }
}
