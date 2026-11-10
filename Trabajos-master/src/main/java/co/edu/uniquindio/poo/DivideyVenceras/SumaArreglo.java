package co.edu.uniquindio.poo.DivideyVenceras;

import java.util.Arrays;

public class SumaArreglo {

    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 19, 15, 3};
        int suma = sumar(numeros, 0, numeros.length - 1);
        System.out.println("La suma del arreglo es: " + suma);

        int resultado = contarPares(numeros);
        System.out.println("Pares encontrados: " + resultado);
    }

    // Sumar numeros de un arreglo de forma recursiva con divide y venceras
    private static int sumar(int[] arreglo, int inicio, int fin) {

        if (inicio == fin) {
            return arreglo[inicio];
        }

        int medio = (inicio + fin) / 2;
        int izq = sumar(arreglo, inicio, medio);
        int der   = sumar(arreglo, medio + 1, fin);

        return izq + der;
    }

    // Cuantos numeros pares en arreglo de forma recursiva con divide y venceras

    private static int contarPares(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        if (arreglo.length == 1) return arreglo[0] % 2 == 0 ? 1 : 0;

        int mitad = arreglo.length / 2;
        int[] izq = Arrays.copyOfRange(arreglo, 0, mitad);
        int[] der = Arrays.copyOfRange(arreglo, mitad, arreglo.length);

        return contarPares(izq) + contarPares(der);
    }
}
