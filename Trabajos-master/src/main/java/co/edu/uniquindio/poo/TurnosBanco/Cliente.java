package co.edu.uniquindio.poo.TurnosBanco;

public class Cliente {

    private int numeroTurno;
    private String nombre;

    public Cliente(int numeroTurno, String nombre) {
        this.numeroTurno = numeroTurno;
        this.nombre = nombre;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Turno #" + numeroTurno + " - " + nombre;
    }
}