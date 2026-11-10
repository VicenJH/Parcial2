package co.edu.uniquindio.poo.EjerciciosClase.ArbolBinario;

public class Main {
    static void main(){
        ArbolBinario<String> arbol = new ArbolBinario<>();
        NodeArbol<String> a = new NodeArbol<>("A");
        NodeArbol<String> b = new NodeArbol<>("B", a);
        NodeArbol<String> c = new NodeArbol<>("C", a);
        NodeArbol<String> d = new NodeArbol<>("D", b);
        NodeArbol<String> e = new NodeArbol<>("E", b);
        NodeArbol<String> f = new NodeArbol<>("F", c);

        arbol.setRaiz(a);
        a.setIzquierdo(b);  a.setDerecho(c);
        b.setIzquierdo(d);  b.setDerecho(e);
        c.setDerecho(f);

        arbol.recorridoAmplitud();   // A B C D E F
    }
}
