package co.edu.uniquindio.poo.TallerOpcional;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class IteradorInverso<T> implements Iterator<T> {

    private final List<T> elementos;
    private int posicion;
    private int ultimoRetornado = -1;

    public IteradorInverso(List<T> elementos) {
        this.elementos = elementos;
        this.posicion = elementos.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return posicion >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más elementos");
        }
        ultimoRetornado = posicion;
        return elementos.get(posicion--);
    }

    @Override
    public void remove() {
        if (ultimoRetornado < 0) {
            throw new IllegalStateException("Debe llamar a next() antes de remove()");
        }
        elementos.remove(ultimoRetornado);
        ultimoRetornado = -1;
    }
}