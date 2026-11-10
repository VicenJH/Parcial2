package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.Comparator;

public class ComparadorIdentificacion implements Comparator<Cliente> {

    int tipo;
    public ComparadorIdentificacion(int tipo) {
        if(tipo==0){
            new ComparadorNombre();
        }
    }

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getIdentificacion().compareTo(o2.getIdentificacion());
    }
}
