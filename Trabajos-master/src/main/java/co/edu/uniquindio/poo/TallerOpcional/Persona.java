package co.edu.uniquindio.poo.TallerOpcional;

public class Persona implements  Comparable<Persona>{

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);   // se compara por edad
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}