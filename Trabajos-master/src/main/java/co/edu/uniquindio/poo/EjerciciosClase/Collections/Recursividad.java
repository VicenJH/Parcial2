package co.edu.uniquindio.poo.EjerciciosClase.Collections;

public class Recursividad {

    static void main() {

        int arreglo[] = {1,2,3,4,5};
        //recorrerArreglo(arreglo);
        //recorrerArregloRecursivo(arreglo,0);

        //System.out.println(buscar(arreglo,0,3));

        //int mayor = encontrarMayor(arreglo, 0);
        //System.out.println("El número mayor es: " + mayor);

        //int mayor = mayorRecursivo(arreglo,0,0);
        //System.out.println("El número mayor es: " + mayor);

        //int mayor = mayorRecursivo2(arreglo,0);
        //System.out.println("El número mayor es: " + mayor);

        int sumar = sumar(arreglo,0);
        System.out.println("La suma de los numeros del arreglo es: " + sumar);

        int pares = contarPares(arreglo,0,0);
        System.out.println("La pares del arreglo es: " + pares);
    }

    /*
    //Metodos para recorrer un arreglo
    private static void recorrerArreglo(int[] arreglo) {
        //1. Valor inicial ok
        //2. Condicion parada ok
        //3. dar paso -avanzar-incremento
        //4. El ciclo
        //5. Las instrucciones que se repiten
        for( ; ; ){
            System.out.println(arreglo[0]);
        }
    }

    private static void recorrerArregloRecursivo(int[] arreglo, int i) {

        if(i==arreglo.length) return;
        System.out.println(arreglo[i]);
        recorrerArregloRecursivo(arreglo, i+1);
        System.out.println(arreglo[i]);
    }
    */

    //Metodo recursivo que retorne si existe un numero en un arreglo
    /*
    private static boolean buscar(int[] arreglo, int i, int numero) {
        if(i==arreglo.length) return false;

        if(arreglo[i]== numero){
            return true;
        }
        return buscar(arreglo, i+1, numero);
    }
    */

    /*
    //Metodo recursivo que retorne el numero mayor
    public static int encontrarMayor(int[] arreglo, int indice) {
        if (indice == arreglo.length - 1) {
            return arreglo[indice];
        }

        int mayorDelResto = encontrarMayor(arreglo, indice + 1);

        if (arreglo[indice] > mayorDelResto) {
            return arreglo[indice];
        } else {
            return mayorDelResto;
        }
    }

    private static int mayor (int[] arreglo) {

        int mayor = 0;
        for (int i=0; i <arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }


    private static int mayorRecursivo (int[] arreglo, int i, int mayor) {

        if (i == arreglo.length) return mayor;
        if (arreglo[i] > mayor) {
            mayor = arreglo[i];
        }

        return mayorRecursivo(arreglo, i + 1, mayor);
    }

    private static int mayorRecursivo2 (int[] arreglo, int i) {

        if (i == arreglo.length-1) return arreglo[i];
        int mayor = mayorRecursivo2(arreglo, i + 1);

        return arreglo [i] > mayor ? arreglo[i]: mayor;
    }
    */

    //Metodo recursivo que sume los numeros del arreglo
    //Recursividad de cola
    private static int sumar (int[] arreglo, int i) {

        if (i == arreglo.length-1) return arreglo[i];

        return arreglo[i] + sumar(arreglo, i+1); //n + sumar (n-1)
    }

    // Cuantos numeros pares en arreglo de forma recursiva
    //Recursividad de cola
    public static int contarPares(int[] arreglo, int i, int pares) {

        if (i == arreglo.length - 1) return arreglo[i] % 2 == 0 ? pares + 1 : pares;
        if (arreglo[i] % 2 == 0) {
            return contarPares(arreglo, i+1, pares + 1);
        } else return contarPares(arreglo, i+1, pares);
    }

    public static int contarPares2(int[] arreglo, int i) {

        if (i == arreglo.length) return 0;
        if (arreglo[i] % 2 == 0) {
            return 1 + contarPares2(arreglo, i+1);
        } else return contarPares2(arreglo, i+1);
    }

    public static int SumaDivide(int[] arreglo, int inicio, int fin) {

        if (inicio == fin) {
            return arreglo[inicio];
        }
        int mitad = (inicio + fin) / 2;

        int sumIzq = SumaDivide(arreglo, inicio, mitad);
        int sumDer = SumaDivide(arreglo, mitad + 1, fin);

        return  sumIzq + sumDer;
    }

    public static int binarySearch(int[] arreglo, int inicio, int fin, int buscado) {
        if(inicio > fin){
            return -1;
        }

        int mitad = (inicio + fin) / 2;

        int sumIzq = SumaDivide(arreglo, inicio, mitad);
        int sumDer = SumaDivide(arreglo, inicio + 1, fin);
        return sumIzq + sumDer;
    }


    public static int binarySearch1(int[] arreglo, int inicio, int fin, int buscado) {
        if(inicio > fin){
            return -1;
        }

        int mitad = (inicio + fin) / 2;

        if(arreglo[mitad] == buscado){
            return mitad;
        }

        if(buscado > arreglo[mitad]){
            return binarySearch1(arreglo, mitad + 1, fin, buscado);
        }else return binarySearch1(arreglo, inicio, mitad - 1, buscado);
    }

    public static int binarySearch2(int[] arreglo, int inicio, int fin, int buscado) {
        if(inicio > fin){
            return -1;
        }

        int mitad = (inicio + fin) / 2;

        if(arreglo[mitad] == buscado){
            return mitad;
        }

        return (buscado > arreglo[mitad])
                ?binarySearch(arreglo, mitad+1, fin, buscado)
                :binarySearch(arreglo, inicio, mitad - 1, buscado);

    }


}
