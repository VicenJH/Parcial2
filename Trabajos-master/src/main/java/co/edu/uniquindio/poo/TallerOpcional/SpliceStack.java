package co.edu.uniquindio.poo.TallerOpcional;

import java.util.Stack;

public class SpliceStack {
    public static Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
        if (i < 0 || j > s.size() || i > j) {
            throw new IllegalArgumentException("Posiciones inválidas: i=" + i + ", j=" + j);
        }

        Stack<Integer> arriba = new Stack<>();      // elementos de las posiciones j .. fin
        Stack<Integer> segmento = new Stack<>();    // elementos de las posiciones i .. j-1
        Stack<Integer> resultado = new Stack<>();   // segmento en el orden correcto

        // 1. Sacar los elementos que están por encima de la posición j-1
        int porEncima = s.size() - j;
        for (int k = 0; k < porEncima; k++) {
            arriba.push(s.pop());
        }

        // 2. Sacar el segmento a eliminar; queda invertido
        int largo = j - i;
        for (int k = 0; k < largo; k++) {
            segmento.push(s.pop());
        }

        while (!segmento.isEmpty()) {
            resultado.push(segmento.pop());
        }

        while (!arriba.isEmpty()) {
            s.push(arriba.pop());
        }

        return resultado;
    }

}