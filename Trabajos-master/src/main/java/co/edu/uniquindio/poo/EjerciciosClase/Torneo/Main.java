package co.edu.uniquindio.poo.EjerciciosClase.Torneo;

public class Main {

    static void main() {

        EquipoFutbol equipoFutbol = new EquipoFutbol();

        Delantero cr7 = new Delantero();

        equipoFutbol.add(cr7);

        equipoFutbol.add(cr7);

        equipoFutbol.iniciarPartido();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
