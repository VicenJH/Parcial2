package co.edu.uniquindio.poo.EjerciciosClase.ArbolBinario;

public class RunArboles {
    static void main() {
        ArbolBinario<Integer> arbol = new ArbolBinario<>();
        for (int x : new int[]{5, 3, 4, 6, 2}) {
            arbol.insertar(x);
        }

        arbol.recorrerInorden();
        System.out.println();
        System.out.println(arbol.existe(4));
        System.out.println(arbol.existe(9));
        System.out.println(arbol.obtenerPeso());

        arbol.eliminar(3);
        arbol.recorrerInorden();
    }
}
