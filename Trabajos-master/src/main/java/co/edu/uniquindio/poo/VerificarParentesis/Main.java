package co.edu.uniquindio.poo.VerificarParentesis;

public class Main {
    public static void main(String[] args) {

        String[] expresiones = {
                "(a+b)",
                "{[a+b]*(c-d)}",
                "(a+b]",
                "((a+b)",
                "{h-y(d+})"
        };

        for (String expresion : expresiones) {
            boolean valida = VerificadorParentesis.esValida(expresion);
            String resultado = valida ? "Expresión valida" : "Expresión invalida";
            System.out.println(expresion + "  ->  " + resultado);
        }
    }
}
