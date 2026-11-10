package co.edu.uniquindio.poo.TallerOpcional;

import java.util.Stack;

public class SplitStack {
    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s1, int i) {
        if (i < 0 || i > s1.size()) {
            throw new IllegalArgumentException("Posición inválida: " + i);
        }

        Stack<Integer> auxiliar = new Stack<>();
        Stack<Integer> primera = new Stack<>();
        Stack<Integer> segunda = new Stack<>();

        int cantidadSegunda = s1.size() - i;
        for (int k = 0; k < cantidadSegunda; k++) {
            auxiliar.push(s1.pop());
        }

        while (!auxiliar.isEmpty()) {
            segunda.push(auxiliar.pop());
        }

        while (!s1.isEmpty()) {
            auxiliar.push(s1.pop());
        }

        while (!auxiliar.isEmpty()) {
            primera.push(auxiliar.pop());
        }

        return new Pair<>(primera, segunda);
    }
}
