package co.edu.uniquindio.poo.EjerciciosClase.Torneo;

public class Delantero implements Jugador{

    private int numeroGoles;

    @Override
    public int hacerGoles() {
        System.out.println("Hice gol");
        return 3;
    }

    @Override
    public int compareTo(Jugador o) {
        return 0;
    }

}
