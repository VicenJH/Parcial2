package co.edu.uniquindio.poo.EjerciciosClase.Colas;

public class Persona {
    private String nombre;
    private int edad;
    private Genero genero;

    public Persona(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public Genero getGenero() { return genero; }

    @Override
    public String toString() {
        return nombre + " (" + edad + ", " + genero + ")";
    }
}
