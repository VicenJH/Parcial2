package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    private String nombre;
    private String identificacion;
    private int edad;

    public Cliente(String nombre, String identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return edad == cliente.edad && Objects.equals(nombre, cliente.nombre) && Objects.equals(identificacion, cliente.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, identificacion, edad);
    }

    @Override
    public int compareTo(Cliente o) {
        //0 son iguales
        //+ si es mayor
        //- si es menor

        if(o.getEdad()== o.getEdad()){
            return this.getNombre().compareTo(o.getNombre());
        }
        return Integer.compare(this.edad, o.getEdad());

        //return this.nombre.compareTo(o.getNombre());
        //return this.edad - o.getEdad();
    }
}
