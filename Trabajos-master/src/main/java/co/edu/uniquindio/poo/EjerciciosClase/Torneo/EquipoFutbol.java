package co.edu.uniquindio.poo.EjerciciosClase.Torneo;

import java.util.ArrayList;

public class EquipoFutbol {

    private ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public void addJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }

    public void iniciarPartido(){
        System.out.println("Inicio el partido");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        listaJugadores.get(0).hacerGoles();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        listaJugadores.get(1).hacerGoles();
    }

    public void add(Delantero cr7) {
        return;
    }
}
