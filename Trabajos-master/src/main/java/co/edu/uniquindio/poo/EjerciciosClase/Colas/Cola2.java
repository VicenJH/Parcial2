package co.edu.uniquindio.poo.EjerciciosClase.Colas;

import java.util.ArrayList;

public class Cola2<T> {
    private final ArrayList<T> lista;
    private int size;
    private NodeSimple <T> firstNode;
    private NodeSimple <T> lastNode;

    
    public Cola2() {
        size = 0;
        lista = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    private boolean isEmpty() {
        return lista.size() == 0;
    }

    public void encolarFinal(T data) {
        lista.add(data);
        size++;
    }

    public T desencolar() {
        if(isEmpty()){
            throw new RuntimeException("La cola esta vacia");
        }else{
            T data = lista.get(0);
            lista.remove(0);
            size--;
            return data;
        }
    }


}
