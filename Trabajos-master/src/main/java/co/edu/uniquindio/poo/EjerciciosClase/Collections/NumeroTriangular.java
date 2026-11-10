package co.edu.uniquindio.poo.EjerciciosClase.Collections;
import javax.swing.JOptionPane;

public class NumeroTriangular {

    public static boolean esTriangular(long T) {
        double discriminante = 1 + 8.0 * T;
        double raiz = Math.sqrt(discriminante);
        double n = (-1 + raiz) / 2;
        return n == Math.floor(n) && n > 0;
    }

    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog("Ingresa un número (0 para salir):");

            if (input == null) break; // Si cierra la ventana

            long num = Long.parseLong(input.trim());

            if (num == 0) break;

            if (esTriangular(num)) {
                JOptionPane.showMessageDialog(null, "YES");
            } else {
                JOptionPane.showMessageDialog(null, "NO");
            }
        }
    }
}
