package co.edu.uniquindio.poo.DivideyVenceras;

public class MayorArreglo{

    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 19, 15};

        int resultado = mayorDe(numeros, 0, numeros.length - 1);
        System.out.println("El mayor es: " + resultado); // 19
    }

    private static int mayorDe(int[] arreglo, int inicio, int fin) {
        if (inicio == fin) return arreglo[inicio];

        int mitad = (inicio + fin) / 2;
        int izq = mayorDe(arreglo, inicio, mitad);
        int der = mayorDe(arreglo, mitad + 1, fin);

        if (izq > der) return izq;
        else return der;
    }
}
