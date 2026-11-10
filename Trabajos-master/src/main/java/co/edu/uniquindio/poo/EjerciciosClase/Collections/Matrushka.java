package co.edu.uniquindio.poo.EjerciciosClase.Collections;

public class Matrushka {

    public static void imprimirMatruska(int n) {
        if (n > 0) {
            System.out.println("Abriendo Matruska " + n);
            imprimirMatruska(n - 1);
            System.out.println("Cerrando Matruska " + n);
        }
    }

    public static void main(String[] args) {
        imprimirMatruska(5);
    }
}