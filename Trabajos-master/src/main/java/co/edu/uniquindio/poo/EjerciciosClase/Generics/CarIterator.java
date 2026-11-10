package co.edu.uniquindio.poo.EjerciciosClase.Generics;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarIterator<T> implements Iterator<T> {

    private List<T> cartItems;
    int indice = 0;

    public CarIterator(List<T> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public boolean hasNext() {
        return indice < cartItems.size();
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException("No hay elementos");
        }
        T t = cartItems.get(indice);
        indice++;
        return t;
    }

    public boolean tieneAtras(){
        return indice >= 0;
    }

    public T moverAtras(){
        if(!tieneAtras()){
            throw new NoSuchElementException("No hay elementos");
        }
        T t = cartItems.get(indice);
        indice--;
        return t;
    }

    public T saltar(){
        if(!tieneSaltar()){
            throw new NoSuchElementException("No hay elementos");
        }
        T t = cartItems.get(indice);
        indice+=2;
        return t;
    }

    private boolean tieneSaltar() {

        if(indice + 2 < cartItems.size()){
            return true;
        }else return false;
    }


}