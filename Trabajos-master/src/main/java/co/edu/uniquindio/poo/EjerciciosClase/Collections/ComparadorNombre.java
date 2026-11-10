package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }

}
