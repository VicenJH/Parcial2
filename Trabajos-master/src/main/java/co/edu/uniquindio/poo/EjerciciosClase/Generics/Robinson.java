package co.edu.uniquindio.poo.EjerciciosClase.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Robinson<T,R> implements Function<T,R>{

    private List<R> lista = new ArrayList<>();

    @Override
    public R apply(T t) {
        //logica
        return  lista.get(0);
    }
}
