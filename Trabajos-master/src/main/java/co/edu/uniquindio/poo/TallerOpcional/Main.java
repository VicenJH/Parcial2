package co.edu.uniquindio.poo.TallerOpcional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static co.edu.uniquindio.poo.TallerOpcional.Maximo.maximo;
import static co.edu.uniquindio.poo.TallerOpcional.SpliceStack.spliceStack;


public class Main {

    public static void main(String[] args) {

        //1. Lista de Tareas
        System.out.println("\n1. LISTA DE TAREAS");
        ListaDeTareas<Tarea<String>> lista = new ListaDeTareas<>();

        lista.agregar(new Tarea<>("Entregar informe final", 1, fecha("15/11/2026"), "Trabajo"));
        lista.agregar(new Tarea<>("Estudiar Generics", 2, fecha("10/10/2026"), "Universidad"));
        lista.agregar(new Tarea<>("Pagar servicios", 1, fecha("05/11/2026"), "Hogar"));
        lista.agregar(new Tarea<>("Hacer mercado", 3, fecha("12/10/2026"), "Hogar"));
        lista.agregar(new Tarea<>("Taller de Collections", 2, fecha("20/10/2026"), "Universidad"));

        System.out.println("\n>Tareas ordenadas por fecha de vencimiento");
        lista.mostrarOrdenadasPorFecha();

        System.out.println("\n>Recorrido con for-each (orden de inserción)");
        for (Tarea<String> t : lista) {
            System.out.println("  " + t.getDescripcion());
        }

        //2. PairList
        System.out.println("\n2. PAIRLIST");
        PairList<String, Integer> notas = new PairList<>();

        notas.agregar("Ana", 45);
        notas.agregar("Ben", 30);
        notas.agregar("Brasil", 30);
        notas.agregar(new Par<>("Marta", 50));

        //4. Repositorio
        System.out.println("\n4. REPOSITORIO");
        Repositorio<String> repo = new Repositorio<>();
        repo.agregar("Java");
        repo.agregar("Python");
        repo.agregar("C++");
        repo.agregar("Kotlin");

        System.out.println("\nfor-each normal (adelante hacia atrás):");
        for (String s : repo) {
            System.out.println("  " + s);
        }

        System.out.println("\nfor-each inverso (atrás hacia adelante):");
        for (String s : repo.enReversa()) {
            System.out.println("  " + s);
        }

        //5. SpliceStack
        System.out.println("\n5. SPLICESTACK");
        Stack<Integer> s = new Stack<>();
        for (int n = 1; n <= 6; n++) {
            s.push(n);
        }
        System.out.println("\nPila original: " + s);

        Stack<Integer> removidos = spliceStack(s, 2, 5);
        System.out.println("Pila después:   " + s);
        System.out.println("Removidos:      " + removidos);
        System.out.println("i == j:         " + spliceStack(s, 1, 1) + "  -> s = " + s);

        //6. Maximo
        System.out.println("\n6. MAXIMO");
        List<Integer> numeros = Arrays.asList(12, 45, 7, 33, 21);
        System.out.println("\nMáximo de enteros: " + maximo(numeros));

        List<String> palabras = Arrays.asList("manzana", "pera", "uva", "kiwi");
        System.out.println("Máximo de Strings: " + maximo(palabras));

        List<Double> decimales = Arrays.asList(3.5, -1.2, 9.8, 4.4);
        System.out.println("Máximo de Doubles: " + maximo(decimales));

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 40));
        personas.add(new Persona("Marta", 31));
        System.out.println("Persona de mayor edad: " + maximo(personas));


        //7. Interfaz génerica comparador
        System.out.println("\n7. COMPARADOR");
        Comparador<Number> cn = new ComparadorNumeros();
        System.out.println("\ncomparar(5, 9) = " + cn.comparar(5, 9));

        Comparador<String> cc = new ComparadorCadenas();
        System.out.println("\ncomparar(\"gato\", \"perro\") = " + cc.comparar("gato", "perro"));
        System.out.println("Mayor entre uva y pera = " + Comparaciones.mayor("uva", "pera", cc));

        List<Persona> personas1 = new ArrayList<>();
        personas1.add(new Persona("Luis", 40));
        personas1.add(new Persona("Ana", 25));
        personas1.add(new Persona("Marta", 31));

        Comparaciones.ordenar(personas1, new ComparadorPersonaporEdad());
        System.out.println("\nPersonas ordenadas por edad: " + personas1);

        //8. SplitStack
        System.out.println("\n8. SPLITSTACK");
        Stack<Integer> s1 = new Stack<>();
        for (int n = 1; n <= 6; n++) {
            s1.push(n);
        }
        System.out.println("\nPila original: " + s1);

        Pair<Stack<Integer>, Stack<Integer>> resultado = SplitStack.splitStack(s1, 3);
        System.out.println("Primera pila:   " + resultado.getFirst());
        System.out.println("Segunda pila:   " + resultado.getSecond());
        System.out.println("Original ahora: " + s1);


        //9. Alquiler de vehiculos
        System.out.println("\n9. ALQUILER VEHICULOS");
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("GHI012", "Kia", 4));
        vehiculos.add(new Moto("MOT22B", "Honda", 200));
        vehiculos.add(new Camion("CAM345", "Hino", 12.0));
        System.out.println("\nVehiculos alquilados\n");
        SistemaAlquiler.alquilarVehiculos(vehiculos);

        //10. Queues
        System.out.println("\n10. QUEUES");
        Queue<Integer> cola1 = new LinkedList<>();
        cola1.offer(1); cola1.offer(3); cola1.offer(5);

        Queue<Integer> cola2 = new LinkedList<>();
        cola2.offer(2); cola2.offer(4); cola2.offer(6);

        System.out.println("\ncola1: " + cola1);
        System.out.println("cola2: " + cola2);
        System.out.println("Resultado: " + MergeQueues.mergeQueues(cola1, cola2));

    }


    private static Date fecha(String texto) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(texto);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Fecha inválida: " + texto);
        }
    }
}