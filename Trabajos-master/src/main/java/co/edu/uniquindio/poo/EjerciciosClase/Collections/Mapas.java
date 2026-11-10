package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.*;

public class Mapas {

    static void main(){

        //mapas

        //Map<Estudiante, Integer> estudiantes1=new HashMap<>();//O(1) agregar y obtener
        Map<Estudiante, ArrayList<Estudiante>> estudiantes1=new HashMap<>();//O(1) agregar y obtener


        Estudiante estudiante1 = new Estudiante("Juan", "12345", 1);
        Estudiante estudiante2 = new Estudiante("Pedro", "89999",2);
        Estudiante estudiante3 = new Estudiante("Luis", "45679",3);
        Estudiante estudiante4 = new Estudiante("Sandra", "3456",2);
        Estudiante estudiante5 = new Estudiante("Juan", "99999",4);

        /*
        estudiantes1.put(estudiante1, 3);
        estudiantes1.put(estudiante2, 3);
        estudiantes1.put(estudiante3, 3);
        estudiantes1.put(estudiante4, 4);
        estudiantes1.put(estudiante5, 4);
        */

        ArrayList<Estudiante> grupo1 =new ArrayList<>();
        grupo1.add(estudiante1);
        grupo1.add(estudiante2);
        grupo1.add(estudiante3);
        grupo1.add(estudiante4);
        estudiantes1.put(estudiante1, grupo1);

        ArrayList<Estudiante> grupo2 =new ArrayList<>();
        grupo2.add(estudiante3);
        grupo2.add(estudiante4);
        grupo2.add(estudiante5);
        estudiantes1.put(estudiante2, grupo2);
        estudiantes1.remove("Luis");

        ArrayList<Estudiante> nota = estudiantes1.get(estudiante2);
        estudiantes1.containsKey("Luis");
        estudiantes1.containsValue(3);

        Map<String, Integer> estudiantes = new HashMap<>();//O(1) agregar y obtener

        estudiantes.put("Juan", 3);
        estudiantes.put("Marco", 2);
        estudiantes.put("Pedro", 1);
        estudiantes.put("Rafael", 1);

        estudiantes.remove("Pedro");

        Integer nota1 = estudiantes.get("Marco");
        estudiantes.containsKey("Pedro");
        estudiantes.containsValue(1);

        for(Map.Entry<Estudiante, ArrayList<Estudiante>> entry : estudiantes1.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        LinkedHashMap<Estudiante, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(estudiante1, 3);
        linkedHashMap.put(estudiante2, 3);

        for(Map.Entry<Estudiante, Integer> entry : linkedHashMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (Map.Entry<String, Integer> entry : estudiantes.entrySet()){
            Integer value = entry.getValue();
            String key = entry.getKey();
        }

        for (String key : estudiantes.keySet()) {
            Integer value = estudiantes.get(key);
        }

        TreeMap<Estudiante, Integer> treeMap = new TreeMap<>(new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

        Queue<Estudiante> cola1 = new LinkedList<>();

        cola1.offer(estudiante1);
        cola1.offer(estudiante2);
        cola1.offer(estudiante3);
        cola1.offer(estudiante4);

        Estudiante poll = cola1.poll();
        Estudiante poll1 = cola1.poll();

        cola1.peek();

        if(!cola1.isEmpty()){

        }

        Queue<Estudiante> cola2 = new PriorityQueue<>();

        estudiante1.setPrioridad(10);
        estudiante2.setPrioridad(10);
        estudiante3.setPrioridad(20);

        cola2.add(estudiante1);

        TreeSet<Estudiante> estudiantes2 = new TreeSet<>();

        ArrayList<Estudiante> lista = new ArrayList<>();

        estudiante1.setPrioridad(10);
        estudiante2.setPrioridad(5);
        estudiante3.setPrioridad(8);

        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(estudiante3);

        Estudiante estudiante = desencolar(lista);

        cola2.poll();
        
    }

    private static Estudiante desencolar(ArrayList<Estudiante> lista) {
        Collections.sort(lista);
        return lista.get(0);
    }

}
