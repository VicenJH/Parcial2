package co.edu.uniquindio.poo.EjerciciosClase.Colas;

public class Main {

    static void main(){
        /*
        Cola<String> cola1 = new Cola<>();
        cola1.encolar("Juan");
        cola1.encolar("Pedro");
        cola1.encolar("Laura");
        cola1.encolar("Luis");

        String p1 = cola1.desencolar();
        System.out.println(p1);

        Cola<Cliente> clientes = new Cola<>();
        clientes.encolar(new Cliente("Maria", 23));
        clientes.encolar(new Cliente("Pedro", 53));
        clientes.encolar(new Cliente("Luis", 34));
        clientes.encolar(new Cliente("Juan", 25));
        clientes.encolar(new Cliente("Nicol", 17));

        Cliente cliente = clientes.desencolar();
        System.out.println(cliente);

        Cola<Integer> c = new Cola<>();
        c.encolar(1); c.encolar(2); c.encolar(3);

        Cola<Integer> copia = c.clonarCola();
        c.desencolar();

        System.out.println(copia.getSize());
        System.out.println(c.getSize());
        System.out.println(new Cola<Integer>().clonarCola().getSize());
        */

        Cola<Integer> c = new Cola<>();
        c.encolarFinal(2);
        c.encolarFinal(3);
        c.encolarInicio(1);

        System.out.println(c.desencolar());   // esperado: 1
        System.out.println(c.desencolar());   // esperado: 2
        System.out.println(c.desencolar());   // esperado: 3

        c.encolarInicio(7);                   // cola vacía de nuevo
        c.encolar(8);
        System.out.println(c.desencolar());   // esperado: 7
        System.out.println(c.desencolar());   // esperado: 8
    }


    public static Cola<Cliente> sacarMayoresDe30(Cola<Cliente> original) {
        Cola<Cliente> mayores = new Cola<>();   // los que salen (edad > 30)
        Cola<Cliente> quedan = new Cola<>();    // los que se quedan

        while (!original.isEmpty()) {
            Cliente c = original.desencolar();
            if (c.getEdad() > 30) {
                mayores.encolar(c);
            } else {
                quedan.encolar(c);
            }
        }

        while (!quedan.isEmpty()) {
            original.encolar(quedan.desencolar());
        }
        return mayores;
    }

    private static void eliminarClientes30(Cola<Cliente> clientes) {
        Cola<Cliente> cola1 = new Cola<>();
        while (!clientes.isEmpty()) {
            Cliente p = clientes.desencolar();
            if (p.getEdad() <= 30) {
                cola1.encolar(p);
            }
        }
        while (!cola1.isEmpty()) {
            clientes.encolar(cola1.desencolar());
        }
    }


}
