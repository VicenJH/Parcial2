package co.edu.uniquindio.poo.TallerOpcional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListaDeTareas<T extends Tarea<?>> implements Iterable<T> {

    private final List<T> tareas = new ArrayList<>();

    public void agregar(T tarea) {
        if (tarea == null) {
            throw new IllegalArgumentException("La tarea no puede ser null");
        }
        tareas.add(tarea);
    }

    public List<T> obtenerPorPrioridad(int prioridad) {
        List<T> resultado = new ArrayList<>();
        for (T t : tareas) {
            if (t.getPrioridad() == prioridad) {
                resultado.add(t);
            }
        }
        return resultado;
    }


    public List<T> obtenerOrdenadasPorFecha() {
        List<T> copia = new ArrayList<>(tareas);
        Collections.sort(copia, (a, b) -> a.getFechaVencimiento().compareTo(b.getFechaVencimiento()));
        return copia;
    }

    public void mostrarOrdenadasPorFecha() {
        imprimir(obtenerOrdenadasPorFecha());
    }

    public static void imprimir(List<? extends Tarea<?>> lista) {
        if (lista.isEmpty()) {
            System.out.println("  (sin tareas)");
            return;
        }
        for (Tarea<?> t : lista) {
            System.out.println("  " + t);
        }
    }

    public int size() { return tareas.size(); }

    @Override
    public Iterator<T> iterator() {
        return tareas.iterator();
    }
}