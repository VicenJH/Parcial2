package co.edu.uniquindio.poo.TallerOpcional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repositorio<T> implements Iterable<T> {

    private final List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        return elementos.get(indice);
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    /** Recorrido normal: del primer elemento al último. */
    @Override
    public Iterator<T> iterator() {
        return elementos.iterator();
    }


    public Iterable<T> enReversa() {
        return () -> new IteradorInverso<>(elementos);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}