package co.edu.uniquindio.poo.TallerOpcional;

public class Vehiculo {

    private final String placa;
    private final String marca;

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa; }
    public String getMarca() {
        return marca; }

    public void alquilar() {
        System.out.println("Alquilando vehículo " + marca + " [" + placa + "]");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + marca + " [" + placa + "]";
    }
}