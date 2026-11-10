package co.edu.uniquindio.poo.SistemaAcademico;

public class Estudiante {

    private String documento;
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String documento, String nombre, int edad, String carrera) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Documento: " + documento +
                " | Nombre: " + nombre +
                " | Edad: " + edad +
                " | Carrera: " + carrera;
    }
}
