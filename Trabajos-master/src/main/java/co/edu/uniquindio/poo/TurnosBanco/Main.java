package co.edu.uniquindio.poo.TurnosBanco;

public class Main {
    public static void main(String[] args) {

        FilaBanco banco = new FilaBanco();

        System.out.println("- Fila vacía al inicio: ");
        System.out.println("¿Está vacía? " + banco.estaVacia());
        System.out.println("En espera: " + banco.cantidadEnEspera());

        System.out.println("\n- Intentar atender sin clientes");
        banco.atenderCliente();

        System.out.println("\n- Registrando clientes: ");
        banco.registrarCliente("Juan");
        banco.registrarCliente("Maria");
        banco.registrarCliente("Pedro");
        banco.registrarCliente("Sandra");

        System.out.println("\n- Estado de la fila");
        System.out.println("En espera: " + banco.cantidadEnEspera());
        banco.verProximoCliente();

        System.out.println("\n- Atendiendo clientes en orden FIFO");
        banco.atenderCliente();
        banco.atenderCliente();

        System.out.println("\n- Estado después de atender 2");
        System.out.println("En espera: " + banco.cantidadEnEspera());
        banco.verProximoCliente();

        System.out.println("\n- Terminar de atender");
        banco.atenderCliente();
        banco.atenderCliente();
        System.out.println("¿Está vacía? " + banco.estaVacia());

        System.out.println("\n- Intentar atender con la fila ya vacía");
        banco.atenderCliente();
    }
}
