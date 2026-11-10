package co.edu.uniquindio.poo.TallerOpcional;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MergeQueues {
    private MergeQueues() { }
    public static <T> Queue<T> mergeQueues(Queue<T> q1, Queue<T> q2) {
        if (q1 == null || q2 == null) {
            throw new IllegalArgumentException("Las colas no pueden ser null");
        }

        Queue<T> resultado = new LinkedList<>();
        Iterator<T> it1 = q1.iterator();
        Iterator<T> it2 = q2.iterator();

        while (it1.hasNext() || it2.hasNext()) {
            if (it1.hasNext()) {
                resultado.offer(it1.next());
            }
            if (it2.hasNext()) {
                resultado.offer(it2.next());
            }
        }
        return resultado;
    }
}