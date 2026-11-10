package co.edu.uniquindio.poo.EjerciciosClase.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ShoppingCart<T extends Priceable> {
    private final List<T> items = new ArrayList<>();

    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("El producto no puede ser null");
        }
        items.add(item);
    }

    public Optional<T> getMostExpensive() {
        if (items.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(Collections.max(items, Comparator.comparingDouble(Priceable::getPrice)));
    }

    public double getTotal() {
        double total = 0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<T> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Automovil auto1) {

    }

    public T getTotalPrice(Object o) {
        return null;
    }

    public T getHigherPrice(Object o) {
        return null;
    }
}
