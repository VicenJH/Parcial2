package co.edu.uniquindio.poo.TallerOpcional;

public class Auto extends Vehiculo {

    private final int numeroPuertas;

    public Auto(String placa, String marca, int numeroPuertas) {
        super(placa, marca);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() { return numeroPuertas; }

    @Override
    public void alquilar() {
        System.out.println("Alquilando AUTO " + getMarca() + " [" + getPlaca() + "] de "
                + numeroPuertas + " puertas");
    }
}