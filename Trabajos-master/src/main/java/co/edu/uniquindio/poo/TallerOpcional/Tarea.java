package co.edu.uniquindio.poo.TallerOpcional;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarea<T> implements Comparable<Tarea<T>> {

    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;
    private T categoria;

    public Tarea(String descripcion, int prioridad, Date fechaVencimiento, T categoria) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.categoria = categoria;
    }

    public String getDescripcion() { return descripcion; }
    public int getPrioridad() { return prioridad; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
    public T getCategoria() { return categoria; }

    @Override
    public int compareTo(Tarea<T> otra) {
        return this.fechaVencimiento.compareTo(otra.fechaVencimiento);
    }

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return "[" + categoria + "] " + descripcion
                + " | Prioridad: " + prioridad
                + " | Vence: " + f.format(fechaVencimiento);
    }
}