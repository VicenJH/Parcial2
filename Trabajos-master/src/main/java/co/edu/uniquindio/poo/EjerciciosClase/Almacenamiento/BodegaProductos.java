package co.edu.uniquindio.poo.EjerciciosClase.Almacenamiento;

import co.edu.uniquindio.poo.EjerciciosClase.Generics.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BodegaProductos {

    private List<Product> listafrutas = new ArrayList<>();

    public BodegaProductos(){

    }
    public List<Product> getListamotos() {
        return Collections.unmodifiableList(listafrutas);
    }
    public void setListamotos(List<Product> listamotos) {
        this.listafrutas = listamotos;
    }

    public void guardarMoto(Product moto){
        listafrutas.add(moto);
    }

    public Product sacar(int i)  {
        if(i < 0 || i >= listafrutas.size()){
            throw  new RuntimeException("No existe un moto en esa posicion");
        }
        Product moto = listafrutas.get(i);
        return moto;
    }


}
