package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.Arrays;

public class NReinas {
    static int N = 16; // Cambia N para diferentes tamaños de tablero

    public static void main(String[] args) {
        int[][] tablero = new int[N][N];
        if (resolverNReinas(tablero, 0)) {
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solución.");
        }
    }

    // Función principal para resolver el problema
    static boolean resolverNReinas(int[][] tablero, int fila) {
        if (fila == N) return true; // Si colocamos todas las reinas, retornamos éxito

        for (int columna = 0; columna < N; columna++) {
            if (esSeguro(tablero, fila, columna)) {
                tablero[fila][columna] = 1; // Colocamos la reina
                if (resolverNReinas(tablero, fila + 1)) {
                    return true;
                }
                tablero[fila][columna] = 0; // Retrocedemos si no funciona
            }
        }
        return false;
    }

    // Verifica si una reina puede colocarse en tablero[fila][columna]
    static boolean esSeguro(int[][] tablero, int fila, int columna) {
        // Revisar la misma columna
        for (int i = 0; i < fila; i++) {
            if (tablero[i][columna] == 1) return false;
        }
        // Revisar diagonal izquierda
        for (int i = fila, j = columna; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) return false;
        }
        // Revisar diagonal derecha
        for (int i = fila, j = columna; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) return false;
        }
        return true;
    }

    // Imprimir el tablero
    static void imprimirTablero(int[][] tablero) {
        for (int[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }
    }
}


