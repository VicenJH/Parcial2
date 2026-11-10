package co.edu.uniquindio.poo.EjerciciosClase.Generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Cart<Product> products = new Cart<>();

        Product product1 = new Product("Laptop",5000.0);
        Product product2 = new Product("Iphone",2000.0);
        Product product3 = new Product("Keyboard",200.0);
        products.addItem(product1);
        products.addItem(product2);
        products.addItem(product3);
        System.out.println("Most expensive product ---> "+ products.getHigherPrice(Product::getProductPrice));
        System.out.println("Total: ---> " + products.getTotalPrice(Product::getProductPrice));

        Cart<Automovil> cars = new Cart<>();
        Automovil auto1 = new Automovil("Aveo 2018", 9000.00);
        Automovil auto2 = new Automovil("Spark lite 2000", 1000.00);
        Automovil auto3 = new Automovil("Tracker 2022", 12000.00);
        cars.addItem(auto1);
        cars.addItem(auto2);
        cars.addItem(auto3);
        System.out.println("\nAUTOMOVILES\nPrecio total: " + cars.getTotalPrice(Automovil::demeLaPlata));
        System.out.println("Most expensive car: " + cars.getHigherPrice(Automovil::demeLaPlata));

        CarIterator<Automovil> carIterator = cars.iterator();

        while(carIterator.hasNext()){
            carIterator.next();
        }

        ArrayList<Product> products1 = new ArrayList<>();

        for(Product p :products1){

        }
        ListIterator<Product> productListIterator = products1.listIterator();


    }

}