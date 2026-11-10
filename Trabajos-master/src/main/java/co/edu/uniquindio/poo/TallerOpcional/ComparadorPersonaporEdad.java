package co.edu.uniquindio.poo.TallerOpcional;

public class ComparadorPersonaporEdad implements Comparador<Persona> {

    @Override
    public int comparar(Persona a, Persona b) {
        return Integer.compare(a.getEdad(), b.getEdad());
    }
}