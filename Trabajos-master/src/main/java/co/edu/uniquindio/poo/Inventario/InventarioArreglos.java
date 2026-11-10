package co.edu.uniquindio.poo.Inventario;
import java.util.Arrays;

public class InventarioArreglos {

    public static void main(String[] args) {

        String[] productos = new String[5];
        double[] precios = new double[5];

        productos[0] = "Manzana";
        productos[1] = "Leche";
        productos[2] = "Pan";
        productos[3] = "Arroz";
        productos[4] = "Huevos";

        precios[0] = 1500.0;
        precios[1] = 3200.0;
        precios[2] = 2000.0;
        precios[3] = 4500.0;
        precios[4] = 8000.0;


        System.out.println("INVENTARIO DE TIENDA");

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i] + " ; Precio: $" + precios[i]);
        }

        String buscar = "Arroz";
        System.out.println("\nBuscar: " + buscar + " ");
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equals(buscar)) {
                System.out.println("Encontrado en posición " + i + " ; Precio: $" + precios[i]);
            }
        }


        System.out.println("\nPrecios ordenados");
        double[] preciosOrdenados = precios.clone();
        Arrays.sort(preciosOrdenados);
        System.out.println(Arrays.toString(preciosOrdenados));
    }

}
