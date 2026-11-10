package co.edu.uniquindio.poo.TallerOpcional;

import java.util.Objects;

public class Par<K, V> {

    private final K clave;
    private final V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() { return clave; }
    public V getValor() { return valor; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Par)) return false;
        Par<?, ?> otro = (Par<?, ?>) o;
        return Objects.equals(clave, otro.clave) && Objects.equals(valor, otro.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clave, valor);
    }

    @Override
    public String toString() {
        return "(" + clave + ", " + valor + ")";
    }
}
