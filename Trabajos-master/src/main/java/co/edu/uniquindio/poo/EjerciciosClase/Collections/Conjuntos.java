package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import co.edu.uniquindio.poo.EjerciciosClase.Torneo.Delantero;
import co.edu.uniquindio.poo.EjerciciosClase.Torneo.Jugador;

import java.util.*;

public class Conjuntos {

    static void main(){

        Set<String> conjunto = new HashSet<>();

        boolean agregado = conjunto.add("Juan");

        conjunto.add("Pedro");
        conjunto.add("Luis");
        conjunto.add("Maria");
        conjunto.add("Sandra");
        conjunto.add("Ruben");

        Iterator<String> iterator = conjunto.iterator();
        List<String> lista = new ArrayList<>(conjunto);

        Set<Cliente> conjunto1 = new HashSet<>();

        Cliente c1= new Cliente("Juan", "1",3);
        Cliente c2= new Cliente("Juan","2",3);
        Cliente c3= new Cliente("Juan","4",1);
        Cliente c4= new Cliente("Juan","5",4);

        conjunto1.add(c1);
        conjunto1.add(c2);
        conjunto1.add(c3);
        conjunto1.add(c4);

        if(c1.equals(c2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Hola");
        }

        Set<String> conjunto2 = new LinkedHashSet<>();
        conjunto2.add("Juan");
        conjunto2.add("Pedro");
        conjunto2.add("Luis");
        conjunto2.add("Sandra");

        /*
        for (String aux : conjunto2) {
            System.out.println(aux);
        }
        */

        Set<String> conjunto3 = new TreeSet<>();
        conjunto3.add("Juan");
        conjunto3.add("Pedro");
        conjunto3.add("Ana");
        conjunto3.add("Luis");

        for (String aux : conjunto3) {
            System.out.println(aux);
        }

        //System.out.println(conjunto1);

        Set<Cliente> listaClientes = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });


        listaClientes.add(new Cliente("Pedro", "1",2));
        listaClientes.add(new Cliente("Luis", "2",24));
        listaClientes.add(new Cliente("Ana", "3",10));
        listaClientes.add(new Cliente("Mario", "4",50));

        for (Cliente aux : listaClientes) {
            System.out.println(aux.getNombre());
        }

        Set<Jugador> listaClientes1 = new TreeSet<>();
        listaClientes1.add(new Delantero());

        for(Jugador aux : listaClientes1){
            System.out.println(aux.toString());
        }

        //Collections.sort(listaClientes1, new Comparator<>());

        Set<Cliente> listaClientes2 = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getIdentificacion().compareTo(o2.getIdentificacion());
            }
        });

        listaClientes2.add(new Cliente("Nicolas", "12",12));
        listaClientes2.add(new Cliente("Laura", "23",20));
        listaClientes2.add(new Cliente("Andres", "13",17));

        for (Cliente aux : listaClientes2) {
            System.out.println(aux.getIdentificacion());
        }
    }
}
