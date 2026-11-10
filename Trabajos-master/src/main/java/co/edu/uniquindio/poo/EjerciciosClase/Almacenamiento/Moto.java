package co.edu.uniquindio.poo.EjerciciosClase.Almacenamiento;

public class Moto implements Producto {

    private String placa;
    private double valor;

    public Moto(String placa, double valor) {
        this.placa = placa;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getPeso() {
        return 200;
    }

    @Override
    public double getPrecio() {
        return valor;
    }
}