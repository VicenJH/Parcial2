package co.edu.uniquindio.poo.EjerciciosClase.Almacenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BodegaMotos {

    private List<Moto> listamotos = new ArrayList<>();

    public BodegaMotos(){

    }
    public List<Moto> getListamotos() {
        return Collections.unmodifiableList(listamotos);
    }
    public void setListamotos(List<Moto> listamotos) {
        this.listamotos = listamotos;
    }

    public void guardarMoto(Moto moto){
        listamotos.add(moto);
    }

    public Moto sacar(int i)  {
        if(i < 0 || i >= listamotos.size()){
            throw  new RuntimeException("No existe un moto en esa posicion");
        }
        Moto moto = listamotos.get(i);
        return moto;
    }


}
