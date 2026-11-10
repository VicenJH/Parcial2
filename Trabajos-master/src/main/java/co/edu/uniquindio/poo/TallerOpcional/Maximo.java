package co.edu.uniquindio.poo.TallerOpcional;

import java.util.List;

public class Maximo {
    public static <T extends Comparable<? super T>> T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser null ni estar vacía");
        }
        T max = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }
}