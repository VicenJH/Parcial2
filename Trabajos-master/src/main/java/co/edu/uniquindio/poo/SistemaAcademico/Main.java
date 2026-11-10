package co.edu.uniquindio.poo.SistemaAcademico;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // El documento (String) es la clave: no puede haber dos estudiantes con el mismo
    private static Map<String, Estudiante> estudiantes = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1 -> crearEstudiante();
                case 2 -> consultarEstudiante();
                case 3 -> listarEstudiantes();
                case 4 -> actualizarEstudiante();
                case 5 -> eliminarEstudiante();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida, intenta de nuevo.");
            }

        } while (opcion != 6);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n===== CRUD ESTUDIANTES =====");
        System.out.println("1. Registrar estudiante (Create)");
        System.out.println("2. Consultar estudiante por documento (Read)");
        System.out.println("3. Listar todos los estudiantes (Read)");
        System.out.println("4. Actualizar estudiante (Update)");
        System.out.println("5. Eliminar estudiante (Delete)");
        System.out.println("6. Salir");
        System.out.print("Elige una opcion: ");
    }

    private static int leerOpcion() {
        try {
            int op = Integer.parseInt(sc.nextLine());
            return op;
        } catch (NumberFormatException e) {
            return -1; // opcion invalida, cae en el default del switch
        }
    }

    // ---------- CREATE ----------
    private static void crearEstudiante() {
        System.out.print("Documento: ");
        String documento = sc.nextLine();

        if (estudiantes.containsKey(documento)) {
            System.out.println("Ya existe un estudiante con ese documento.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        Estudiante nuevo = new Estudiante(documento, nombre, edad, carrera);
        estudiantes.put(documento, nuevo);

        System.out.println("Estudiante registrado con exito.");
    }

    // ---------- READ (uno) ----------
    private static void consultarEstudiante() {
        System.out.print("Documento a consultar: ");
        String documento = sc.nextLine();

        Estudiante encontrado = estudiantes.get(documento);

        if (encontrado == null) {
            System.out.println("No existe un estudiante con ese documento.");
        } else {
            System.out.println(encontrado);
        }
    }

    // ---------- READ (todos) ----------
    private static void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("--- Lista de estudiantes ---");
        for (Estudiante e : estudiantes.values()) {
            System.out.println(e);
        }
    }

    // ---------- UPDATE ----------
    private static void actualizarEstudiante() {
        System.out.print("Documento del estudiante a actualizar: ");
        String documento = sc.nextLine();

        Estudiante existente = estudiantes.get(documento);

        if (existente == null) {
            System.out.println("No existe un estudiante con ese documento.");
            return;
        }

        System.out.print("Nuevo nombre (" + existente.getNombre() + "): ");
        String nombre = sc.nextLine();
        if (!nombre.isBlank()) {
            existente.setNombre(nombre);
        }

        System.out.print("Nueva edad (" + existente.getEdad() + "): ");
        String edadTexto = sc.nextLine();
        if (!edadTexto.isBlank()) {
            existente.setEdad(Integer.parseInt(edadTexto));
        }

        System.out.print("Nueva carrera (" + existente.getCarrera() + "): ");
        String carrera = sc.nextLine();
        if (!carrera.isBlank()) {
            existente.setCarrera(carrera);
        }
        System.out.println("Estudiante actualizado:");
        System.out.println(existente);
    }


    private static void eliminarEstudiante() {
        System.out.print("Documento del estudiante a eliminar: ");
        String documento = sc.nextLine();

        Estudiante eliminado = estudiantes.remove(documento);

        if (eliminado == null) {
            System.out.println("No existe un estudiante con ese documento.");
        } else {
            System.out.println("Estudiante eliminado: " + eliminado);
        }
    }
}
