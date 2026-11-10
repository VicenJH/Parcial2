package co.edu.uniquindio.poo.TallerOpcional;

import java.util.List;
public class SistemaAlquiler {

    private SistemaAlquiler() { }   // clase de utilidades: no se instancia

    public static void alquilarVehiculos(List<? extends Vehiculo> vehiculos) {
        if (vehiculos == null || vehiculos.isEmpty()) {
            System.out.println("No hay vehículos para alquilar");
            return;
        }
        for (Vehiculo v : vehiculos) {
            v.alquilar();
        }
    }
}