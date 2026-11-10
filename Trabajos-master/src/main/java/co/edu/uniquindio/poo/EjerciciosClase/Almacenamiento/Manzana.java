package co.edu.uniquindio.poo.EjerciciosClase.Almacenamiento;

public class Manzana implements Producto {

    private double peso;

    public Manzana(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getPrecio() {
        return 0;
    }
}
