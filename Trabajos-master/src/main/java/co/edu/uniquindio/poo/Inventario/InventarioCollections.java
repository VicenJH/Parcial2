package co.edu.uniquindio.poo.Inventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class InventarioCollections {
    public static void main(String[] args) {

        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto("Manzana", 1500.0));
        inventario.add(new Producto("Leche",   3200.0));
        inventario.add(new Producto("Pan",     2000.0));
        inventario.add(new Producto("Arroz",   4500.0));
        inventario.add(new Producto("Huevos",  8000.0));

        System.out.println("INVENTARIO");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(inventario.get(i));
        }

        inventario.add(new Producto("Jugo", 2500.0));
        System.out.println("\nProducto agregado. Total: " + inventario.size() + " productos");
        inventario.remove(0); // elimina "Manzana"
        System.out.println("Manzana eliminada. Total ahora: " + inventario.size());

        String buscar = "Pan";
        System.out.println("\nBuscando: " + buscar + " ");
        for (Producto p : inventario) {
            if (p.nombre.equals(buscar)) {
                System.out.println("Encontrado " + p);
            }
        }

        System.out.println("\nProductos ordenados por precio\n");
        Collections.sort(inventario, Comparator.comparingDouble(p -> p.precio));
        for (Producto p : inventario) {
            System.out.println(p);
        }

        Producto masBarato  = Collections.min(inventario, Comparator.comparingDouble(p -> p.precio));
        Producto masCaro    = Collections.max(inventario, Comparator.comparingDouble(p -> p.precio));
        System.out.println("\nMás barato  -> " + masBarato);
        System.out.println("Más caro    -> " + masCaro);
    }
}