package co.edu.uniquindio.poo.EjerciciosClase.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Cart<T> implements Iterable<T>{

    private List<T> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    //Metodo para agregar un producto
    public boolean addItem(T item){

        if(item != null){
            this.cartItems.add(item);
            return true;
        }

        return false;
    }

    //Retorna el que tenga mayor valor
    public Optional<T> getHigherPrice(Function<T, Double> priceExtractor){

        if(cartItems.isEmpty()){
            return Optional.empty();
        }

        T mostExpensiveItem = cartItems.get(0);
        double mostExpensivePrice = priceExtractor.apply(mostExpensiveItem);

        for(T item : cartItems){

            double actualPrice = priceExtractor.apply(item);

            if(actualPrice > mostExpensivePrice){
                mostExpensiveItem = item;
                mostExpensivePrice = actualPrice;
            }
        }
        return Optional.of(mostExpensiveItem);

    }


    //elixir funciones de orden superior
    /**
     def main do
     operacion(&Modulo.dividir/2,3,4)
     end

     def operacion(operacion,a,b) do

     operacion.(a,b)
     end
     */

    //Retorna el precio total
    public Double getTotalPrice(Function<T, Double> priceExtractor){

        double totalPrice = 0.0;

        if(cartItems.isEmpty()){
            return totalPrice;
        }

        for (T item : cartItems) {
            totalPrice += priceExtractor.apply(item);
        }

        return totalPrice;

    }


    @Override
    public CarIterator<T> iterator() {
        return new CarIterator(cartItems);
    }
}