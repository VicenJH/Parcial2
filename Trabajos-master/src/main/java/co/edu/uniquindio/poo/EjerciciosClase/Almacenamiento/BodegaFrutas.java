package co.edu.uniquindio.poo.EjerciciosClase.Almacenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BodegaFrutas {

    private List<Fruta> listafrutas = new ArrayList<>();

    public BodegaFrutas(){

    }
    public List<Fruta> getListamotos() {
        return Collections.unmodifiableList(listafrutas);
    }
    public void setListamotos(List<Fruta> listamotos) {
        this.listafrutas = listamotos;
    }

    public void guardarMoto(Fruta moto){
        listafrutas.add(moto);
    }

    public Fruta sacar(int i)  {
        if(i < 0 || i >= listafrutas.size()){
            throw  new RuntimeException("No existe un moto en esa posicion");
        }
        Fruta moto = listafrutas.get(i);
        return moto;
    }


}