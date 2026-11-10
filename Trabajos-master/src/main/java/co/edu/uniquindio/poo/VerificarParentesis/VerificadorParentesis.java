package co.edu.uniquindio.poo.VerificarParentesis;

import java.util.Stack;

public class VerificadorParentesis {

    public static boolean esValida(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char simbolo : expresion.toCharArray()) {

            if (simbolo == '(' || simbolo == '{' || simbolo == '[') {
                pila.push(simbolo);
            }else
                if (simbolo == ')' || simbolo == '}' || simbolo == ']') {
                if (pila.isEmpty()) {
                    return false;
                }

                char apertura = pila.pop();

                if (!coinciden(apertura, simbolo)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean coinciden(char apertura, char cierre) {
        return  (apertura == '(' && cierre == ')') ||
                (apertura == '{' && cierre == '}') ||
                (apertura == '[' && cierre == ']');
    }
}