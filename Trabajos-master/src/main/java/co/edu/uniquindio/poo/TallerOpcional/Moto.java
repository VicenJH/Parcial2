package co.edu.uniquindio.poo.TallerOpcional;

public class Moto extends Vehiculo {

    private final int cilindraje;

    public Moto(String placa, String marca, int cilindraje) {
        super(placa, marca);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() { return cilindraje; }

    @Override
    public void alquilar() {
        System.out.println("Alquilando MOTO " + getMarca() + " [" + getPlaca() + "] de "
                + cilindraje + " cc");
    }

    public void conducir() {
        System.out.println("Conduciendo la moto " + getMarca() + " [" + getPlaca() + "]");
    }
}