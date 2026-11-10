package co.edu.uniquindio.poo.TallerOpcional;

public class Camion extends Vehiculo {

    private final double capacidadToneladas;

    public Camion(String placa, String marca, double capacidadToneladas) {
        super(placa, marca);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() { return capacidadToneladas; }

    @Override
    public void alquilar() {
        System.out.println("Alquilando CAMIÓN " + getMarca() + " [" + getPlaca() + "] con capacidad de "
                + capacidadToneladas + " toneladas");
    }

    public void cargar() {
        System.out.println("Cargando el camión " + getMarca() + " [" + getPlaca() + "]");
    }
}