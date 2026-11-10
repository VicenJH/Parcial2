package co.edu.uniquindio.poo.TallerOpcional;

import java.util.List;
public class Comparaciones {

    private Comparaciones() { }

    public static <T> T mayor(T a, T b, Comparador<? super T> comparador) {
        return comparador.comparar(a, b) >= 0 ? a : b;
    }

    public static <T> void ordenar(List<T> lista, Comparador<? super T> comparador) {
        lista.sort((x, y) -> comparador.comparar(x, y));
    }
}