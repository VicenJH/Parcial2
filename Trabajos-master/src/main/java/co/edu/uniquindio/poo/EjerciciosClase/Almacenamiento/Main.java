package co.edu.uniquindio.poo.EjerciciosClase.Almacenamiento;

public class Main {

    static void main() {

        Bodega<Moto> bodegaMotos = new Bodega<Moto>();

        bodegaMotos.guardar(new Moto("CDe33",20000));
        bodegaMotos.guardar(new Moto("d32e32e",30000));
        bodegaMotos.guardar(new Moto("d32e32e",20000));
        bodegaMotos.guardar(new Moto("33edd",50000));
        bodegaMotos.guardar(new Moto("dqwde23",40000));

        Moto moto = bodegaMotos.obtener_mayor_peso();
        BodegaFrutas bodegaFrutas = new BodegaFrutas();

        Moto moto1 = bodegaMotos.sacar(2);
        Moto moto2 = bodegaMotos.sacar(3);
    }
}