package co.edu.uniquindio.poo.TallerOpcional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class PairList<K, V> implements Iterable<Par<K, V>> {

    private final List<Par<K, V>> pares = new ArrayList<>();

    public void agregar(K clave, V valor) {
        pares.add(new Par<>(clave, valor));
    }

    public void agregar(Par<K, V> par) {
        if (par == null) {
            throw new IllegalArgumentException("El par no puede ser null");
        }
        pares.add(par);
    }


    public boolean eliminar(K clave) {
        boolean eliminado = false;
        Iterator<Par<K, V>> it = pares.iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next().getClave(), clave)) {
                it.remove();
                eliminado = true;
            }
        }
        return eliminado;
    }

    public Par<K, V> eliminarEnPosicion(int indice) {
        return pares.remove(indice);
    }

    public Par<K, V> obtener(int indice) {
        return pares.get(indice);
    }


    public V obtenerValor(K clave) {
        for (Par<K, V> p : pares) {
            if (Objects.equals(p.getClave(), clave)) {
                return p.getValor();
            }
        }
        return null;
    }


    public List<V> obtenerValores(K clave) {
        List<V> valores = new ArrayList<>();
        for (Par<K, V> p : pares) {
            if (Objects.equals(p.getClave(), clave)) {
                valores.add(p.getValor());
            }
        }
        return valores;
    }

    public boolean contieneClave(K clave) {
        return obtenerPar(clave) != null;
    }

    private Par<K, V> obtenerPar(K clave) {
        for (Par<K, V> p : pares) {
            if (Objects.equals(p.getClave(), clave)) {
                return p;
            }
        }
        return null;
    }


    public int size() { return pares.size(); }

    public boolean isEmpty() { return pares.isEmpty(); }

    @Override
    public Iterator<Par<K, V>> iterator() {
        return pares.iterator();
    }

    @Override
    public String toString() {
        return pares.toString();
    }
}