package co.edu.uniquindio.poo.TurnosBanco;

import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {

    private Queue<Cliente> fila;
    private int contadorTurnos;

    public FilaBanco() {
        this.fila = new LinkedList<>();
        this.contadorTurnos = 0;
    }

    public Cliente registrarCliente(String nombre) {
        contadorTurnos++;
        Cliente cliente = new Cliente(contadorTurnos, nombre);
        fila.offer(cliente);
        System.out.println("Se registró: " + cliente);
        return cliente;
    }

    public Cliente atenderCliente() {
        if (estaVacia()) {
            System.out.println("No se puede atender: la fila está vacía.");
            return null;
        }
        Cliente atendido = fila.poll();
        System.out.println("Atendiendo a: " + atendido);
        return atendido;
    }

    public Cliente verProximoCliente() {
        Cliente proximo = fila.peek();
        if (proximo == null) {
            System.out.println("No hay clientes esperando.");
        } else {
            System.out.println("Próximo a atender: " + proximo);
        }
        return proximo;
    }

    public int cantidadEnEspera() {
        return fila.size();
    }

    public boolean estaVacia() {
        return fila.isEmpty();
    }
}