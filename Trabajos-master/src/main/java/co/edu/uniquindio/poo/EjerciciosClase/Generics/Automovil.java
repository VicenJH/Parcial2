package co.edu.uniquindio.poo.EjerciciosClase.Generics;

public class Automovil {

    private String model;
    private double price;

    public Automovil(String model, double price) {
        this.model = model;
        this.price = price;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double demeLaPlata() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car: "+ this.model + "\nPrice: "+ this.price;
    }


    public String getProductName() {
        return "";
    }


    public Double getProductPrice() {
        return 0.0;
    }
}