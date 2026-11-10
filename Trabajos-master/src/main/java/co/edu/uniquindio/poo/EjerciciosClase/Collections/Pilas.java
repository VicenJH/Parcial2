package co.edu.uniquindio.poo.EjerciciosClase.Collections;

import java.util.Stack;

public class Pilas {

    static void main(){

        Stack<String> pila1 = new Stack<>();

        pila1.push("Ana");
        pila1.push("Maria");
        pila1.push("Luis");
        pila1.push("Lucho");
        pila1.push("Carlos");

        System.out.println(pila1);
        pila1.pop();
        System.out.println(pila1);

        String peek = pila1.peek();
        System.out.println("quien es la cima?: "+peek);
        System.out.println(pila1);

    }
}
