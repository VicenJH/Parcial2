package co.edu.uniquindio.poo.VentasDiarias;

import java.util.*;

public class Main {

    static void main() {

        //Hashmap
        Map<String, Venta> ventasHash = new HashMap<>();

        Venta agregada = ventasHash.put("P103", new Venta("P103", "Arroz", 5, 12500));

        ventasHash.put("A250", new Venta("A250", "Aceite", 2, 18000));
        ventasHash.put("Z001", new Venta("Z001", "Sal", 10, 9000));
        ventasHash.put("M075", new Venta("M075", "Leche", 6, 21000));
        ventasHash.put("B310", new Venta("B310", "Azucar", 4, 14000));
        ventasHash.put("P011", new Venta("P011", "Pan", 8, 6400));


        Venta consultada = ventasHash.get("M075");
        if (consultada != null) {
            System.out.println("\nEncontrado: \n" + consultada);
        } else {
            System.out.println("No existe");
        }


        System.out.println("\nHashMap no tiene orden especifico\n");
        for (Map.Entry<String, Venta> entrada : ventasHash.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }


        //LinkedHashMap
        Map<String, Venta> ventasLinked = new LinkedHashMap<>();

        ventasLinked.put("P103", new Venta("P103", "Arroz", 5, 12500));
        ventasLinked.put("A250", new Venta("A250", "Aceite", 2, 18000));
        ventasLinked.put("Z001", new Venta("Z001", "Sal", 10, 9000));
        ventasLinked.put("M075", new Venta("M075", "Leche", 6, 21000));

        System.out.println("\nLinkedHashMap por orden de entrada\n");
        for (String key : ventasLinked.keySet()) {
            System.out.println(key + " = " + ventasLinked.get(key));
        }

        // TreeMap
        Map<String, Venta> ventasTree = new TreeMap<>();

        ventasTree.put("P103", new Venta("P103", "Arroz", 5, 12500));
        ventasTree.put("A250", new Venta("A250", "Aceite", 2, 18000));
        ventasTree.put("Z001", new Venta("Z001", "Sal", 10, 9000));
        ventasTree.put("M075", new Venta("M075", "Leche", 6, 21000));

        System.out.println("\nTreeMap en orden de código\n ");
        for (Venta v : ventasTree.values()) {
            System.out.println(v);
        }

        //Comparator
        Map<String, Venta> mapaBase = ventasTree;

        Map<String, Venta> ventasPorNombre = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String codigo1, String codigo2) {
                Venta v1 = mapaBase.get(codigo1);
                Venta v2 = mapaBase.get(codigo2);
                return v1.getNombre().compareTo(v2.getNombre());
            }
        });

        ventasPorNombre.putAll(mapaBase);

        System.out.println("\nTreeMap ordenado por nombre \n");
        for (Venta v : ventasPorNombre.values()) {
            System.out.println(v.getNombre() + " = " + v);
        }
    }

}
