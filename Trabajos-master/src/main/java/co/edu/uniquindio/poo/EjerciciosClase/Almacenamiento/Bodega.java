package co.edu.uniquindio.poo.EjerciciosClase.Almacenamiento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bodega<T extends Producto> {

    private List<T> lista = new ArrayList<>();

    public Bodega(){

    }
    public List<T> getLista() {
        return Collections.unmodifiableList(lista);
    }
    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public void guardar(T t){
        lista.add(t);
    }

    public T sacar(int i)  {
        if(i < 0 || i >= lista.size()){
            throw  new RuntimeException("No existe un elemento en esa posicion");
        }
        T t = lista.get(i);
        return t;
    }

    public T obtener_mayor_peso(){
        T mayor = lista.get(0);
        double pesoMayor = mayor.getPeso();

        for (T t : lista){
            double actual = t.getPeso();
            if(actual > pesoMayor) {
                pesoMayor = actual;
                mayor = t;
            }
        }
        return mayor;
    }

    public double precioTotal(){
        double precioTotal = 0;
        for (T t:lista){
            precioTotal += t.getPrecio();
        }
        return precioTotal;
    }

    public double precioTotal2(){
        return lista.stream().map(Producto::getPrecio).reduce(BigDecimal.ZERO.doubleValue(),Double::sum);
    }

}