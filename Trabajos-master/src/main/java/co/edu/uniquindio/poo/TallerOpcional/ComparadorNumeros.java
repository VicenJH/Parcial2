package co.edu.uniquindio.poo.TallerOpcional;

public class ComparadorNumeros implements Comparador<Number> {

    @Override
    public int comparar(Number a, Number b) {
        return Double.compare(a.doubleValue(), b.doubleValue());
    }
}