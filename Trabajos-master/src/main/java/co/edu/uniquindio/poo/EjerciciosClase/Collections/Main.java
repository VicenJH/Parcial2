package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void ejercisio1() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 1");
        System.out.println("========================================\n");

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }


    public static void ejercisio2() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 2");
        System.out.println("========================================\n");

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }


    public static void ejercisio3() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 3");
        System.out.println("========================================\n");

        for (int i = 2; i < 21; i += 2) {
            System.out.println(i);
        }
    }


    public static void ejercisio4() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 4");
        System.out.println("========================================\n");

        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }


    public static void ejercisio5() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 5");
        System.out.println("========================================\n");
        System.out.print("Ingrese un número PARA LA TABLA: ");

        int numero = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            int producto = numero * i;
            System.out.println(numero + " x " + i + " = " + producto);

        }
    }


    public static void ejercisio6() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 6");
        System.out.println("========================================\n");
        System.out.print("Ingrese un número para escribir en secuencia: ");

        int numero = teclado.nextInt();
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i++;

        }
    }


    public static void ejercisio7() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 7");
        System.out.println("========================================\n");
        System.out.println("INGRESE UN NUMERO Ó (0 PARA SALIR: ");

        int numero = teclado.nextInt();
        while (numero != 0) {
            System.out.println("El número ingresado es: " + numero);
            System.out.println("INGRESE UN NUMERO Ó (0 PARA SALIR)");
            numero = teclado.nextInt();
        }
    }


    public static void ejercisio8() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 8");
        System.out.println("========================================\n");
        String entrada = "123.vicen";
        System.out.println("INGRESE la contraseña para acceder al sistema: ");

        teclado.nextLine();
        String salida = teclado.nextLine();
        while (!entrada.equals(salida)) {
            System.out.println("Acceso denegado, intente nuevamente");
            salida = teclado.nextLine();
        }
        System.out.println("Acceso permitido");
    }


    public static void ejercisio9() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 9");
        System.out.println("========================================\n");
        System.out.println("INGRESE numeros positivos o negativos (0 para salir): ");

        int numero = teclado.nextInt();
        int contadorposi = 0;
        int contadorneg = 0;
        while (numero != 0) {

            if (numero > 0) {
                contadorposi++;
            } else {
                contadorneg++;
            }
            numero = teclado.nextInt();
        }
        System.out.println("Cantidad de números positivos: " + contadorposi);
        System.out.println("Cantidad de números negativos: " + contadorneg);
    }


    public static void ejercisio10() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 10");
        System.out.println("========================================\n");
        System.out.println("ingrese el numero del cual quiere el factorial: ");

        int numero = teclado.nextInt();
        int numeroOriginal = numero; // Guardar el valor original de numero
        int factorial = 1;
        while (numero > 0) {
            factorial *= numero;
            numero--;
        }
        while (numero < 0) {
            factorial *= numero;
            numero++;
        }
        System.out.println("El factorial de " + numeroOriginal + " es " + factorial);
    }


    public static void ejercisio11() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 11");
        System.out.println("========================================\n");
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS QUE DESEA INGRESAR: ");

        int cantidad = teclado.nextInt();
        int masgrande = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("INGRESE EL NUMERO " + i + ": ");
            int numeroingresado = teclado.nextInt();
            if (i == 1) {
                masgrande = numeroingresado;
            }
            if (numeroingresado > masgrande) {
                masgrande = numeroingresado;
            }
        }
        System.out.println("Este es el Número más grande: " + masgrande);
    }


    public static void ejercisio12() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 12");
        System.out.println("========================================\n");
        System.out.println("INGRESE un número y le diremos si es primo: ");

        int talvez = teclado.nextInt();
        int primo = 2;
        int contar = 0;
        for (int i = 1; i <= talvez; i++) {
            if (talvez % i == 0) {
                contar++;
            }
        }
        if (contar == primo) {
            System.out.println("El número " + talvez + " es primo");
        } else {
            System.out.println("El número " + talvez + " no es primo");
        }
    }


    public static void ejercisio13() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 13");
        System.out.println("========================================\n");
        System.out.println("INGRESE un número y lo obtendra al revez: ");

        int normal = teclado.nextInt();
        int revez = 0;
        while (normal > 0) {
            int digito = normal % 10;
            revez = revez * 10 + digito;
            normal /= 10;
        }
        System.out.println("Este es el número al revez: " + revez);
    }

    public static void ejercisio14() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 14");
        System.out.println("========================================\n");
        System.out.println("INGRESE un número secreto: ");

        int ingresado = teclado.nextInt();
        int secreto = 38;
        while (ingresado != secreto) {
            if (ingresado > secreto) {
                System.out.println("el numero es menor: ");
            } else {
                System.out.println("el numero es mayor: ");
            }
            ingresado = teclado.nextInt();
        }
        System.out.println("Ha encontrado el número secreto: ");
    }

    public static void ejercisio15() {
        System.out.println("\n========================================");
        System.out.println("             EJERCICIO 15");
        System.out.println("========================================\n");
        System.out.println("INGRESE un número: ");

        int piramide = teclado.nextInt();
        for (int i = 1; i <= piramide; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    int numero = 5;

    public static void matrioshka(int numero) {
        if (numero == 0) {
            return;
        }
        System.out.println("abriendo matrioshka" + numero);
        matrioshka(numero - 1);
        System.out.println("cerrando matrioshka" + numero);
    }

    public static boolean recorrerArregloRecur(int[] arreglo, int numero, int i) {

        // Caso base
        if (i == arreglo.length) {
            return false;
        }

        // Comparamos el elemento actual
        if (arreglo[i] == numero) {
            return true;
        }

        // Recursividad
        return recorrerArregloRecur(arreglo, numero, i + 1);
    }

    public static int mayorArregloRecur(int[] arreglo2, int i) {


        if (i == arreglo2.length - 1) {
            return arreglo2[i];
        }

        int mayor = mayorArregloRecur(arreglo2, i + 1);

        if (arreglo2[i] > mayor) {
            return arreglo2[i];

        } else {
            return mayor;
        }
    }

    public static int sumarArregloRecur(int[] arreglo3, int i) {

        if (i == arreglo3.length) {
            return 0;
        }

        return arreglo3[i] + sumarArregloRecur(arreglo3, i + 1);
    }

    public static int sumarArregloRecudiviyvence2(int inicio, int fin, int[] arreglo4){
        if (inicio == fin){
            return arreglo4[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x =sumarArregloRecudiviyvence2(inicio, mitad, arreglo4);
            int y =sumarArregloRecudiviyvence2(mitad +1, fin, arreglo4);

            return y+x;

        }
    }

    public static int contarPares(int[] arreglo5, int i) {

        if (i == arreglo5.length) {
            return 0;
        }

        if (arreglo5[i] % 2 == 0) {
            return 1 + contarPares(arreglo5, i + 1);
        }

        return contarPares(arreglo5, i + 1);
    }

    public static int mayordivven(int inicio, int fin, int[] arreglo6){
        if (inicio == fin){
            return arreglo6[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x =mayordivven(inicio, mitad, arreglo6);
            int y =mayordivven(mitad +1, fin, arreglo6);

            if(x>y){
                return x;
            } else{
                return y;
            }

        }
    }
    /*
    public static int econtrarburbuja(int inicio, int fin, int[] arreglo7, int buscado){
        if (inicio > fin){
            return -1;

        int mitad = (inicio + fin) / 2;

        if(arreglo7[mitad] == buscado){
            return mitad;
        }

        return buscado > arreglo7[mitad]
                ?bynarySearch(arreglo7, mitad+1, fin, buscado)
                :bynarySearch(arreglo7, mitad-1, fin, buscado);


    }
     */

    public static void eliminarJo(ArrayList<String> lista) {

        for (int i = lista.size() - 1; i >= 0; i--) {

            if (lista.get(i).startsWith("Jo")) {
                lista.remove(i);
            }
        }
    }

    public static void eliminarJos(ArrayList<String> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {

            if (lista.get(i).startsWith("Jo")) {

            }
        }
    }




    public static void main(String[] args) {
    /*  ejercisio1();
        ejercisio2();
        ejercisio3();
        ejercisio4();
        ejercisio5();
        ejercisio6();
        ejercisio7();
        ejercisio8();
        ejercisio9();
        ejercisio10();


        ejercisio11();
        ejercisio12();
        ejercisio13();
        ejercisio14();

        ejercisio15();
     */
        matrioshka(5);

        int arreglo[] = {1, 2, 3, 4, 5};

        System.out.println("Ingrese numero a buscar:");

        int numeroarreglo = teclado.nextInt();

        if (recorrerArregloRecur(arreglo, numeroarreglo, 0)) {

            System.out.println("El numero esta en el arreglo");

        } else {

            System.out.println("El numero NO esta en el arreglo");
        }


        int arreglo2[] = {1, 8, 3, 15, 5, 2};

        int mayor = mayorArregloRecur(arreglo2, 0);

        System.out.println("El mayor es: " + mayor);


        int arreglo3[] = {1, 2, 3, 4, 5};

        int suma = sumarArregloRecur(arreglo3, 0);

        System.out.println("La suma es: " + suma);


        int arreglo4[] = {1, 2, 3, 4, 5,6};
        int sumadiviven = sumarArregloRecudiviyvence2(0, arreglo4.length - 1, arreglo4);

        System.out.println("la suma de la tarea es " + sumadiviven);



        int[] arreglo5 = {4, 7, 10, 3, 8, 5};

        int cantidad = contarPares(arreglo5, 0);

        System.out.println("Cantidad de números pares: " + cantidad);


        int arreglo6[] = {1, 2, 3, 4, 5,10};
        int mayordiv = mayordivven(0, arreglo4.length - 1, arreglo6);

        System.out.println("el mayor es " + mayordiv);


        ArrayList<String> lista = new ArrayList<>();
        lista.add("juan");
        lista.add("Jose");
        lista.add("julian");
        lista.add("jose");
        lista.add("juliana");

        eliminarJo(lista);

        System.out.println(lista);
    }
}
