package co.edu.uniquindio.poo.VentasDiarias;

public class Venta {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double valorTotal;

    public Venta(String codigo, String nombre, int cantidad, double valorTotal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    //

    @Override
    public String toString() {
        return codigo + " - " + nombre +
                " (cantidad: " + cantidad + ", " +
                "total: $" + valorTotal + ")";
    }

}
