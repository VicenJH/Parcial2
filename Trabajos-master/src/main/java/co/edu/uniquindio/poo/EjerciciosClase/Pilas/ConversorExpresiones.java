package co.edu.uniquindio.poo.EjerciciosClase.Pilas;

public class ConversorExpresiones {

    private static int precedencia(char op) {
        switch (op) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
            default:  return 0;   // '(' u otro carácter
        }
    }

    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String infijaAPostfija(String expresion) {
        Stack<Character> pila = new Stack<>();
        StringBuilder salida = new StringBuilder();

        int i = 0;
        while (i < expresion.length()) {
            char c = expresion.charAt(i);

            if (c == ' ') {
                i++;                                   // ignoro espacios

            } else if (Character.isDigit(c)) {
                // acumulo TODOS los dígitos consecutivos como un solo número
                while (i < expresion.length() && Character.isDigit(expresion.charAt(i))) {
                    salida.append(expresion.charAt(i));
                    i++;
                }
                salida.append(' ');

            } else if (Character.isLetter(c)) {
                salida.append(c).append(' ');          // operando de una letra
                i++;

            } else if (c == '(') {
                pila.push(c);
                i++;

            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    salida.append(pila.pop()).append(' ');
                }
                if (pila.isEmpty()) {
                    throw new IllegalArgumentException("Falta un '(' de apertura");
                }
                pila.pop();                            // descarto el '('
                i++;

            } else if (esOperador(c)) {
                while (!pila.isEmpty() && pila.peek() != '('
                        && (precedencia(pila.peek()) > precedencia(c)
                        || (precedencia(pila.peek()) == precedencia(c) && c != '^'))) {
                    salida.append(pila.pop()).append(' ');
                }
                pila.push(c);
                i++;

            } else {
                throw new IllegalArgumentException("Carácter no válido: " + c);
            }
        }

        while (!pila.isEmpty()) {
            char op = pila.pop();
            if (op == '(') {
                throw new IllegalArgumentException("Falta un ')' de cierre");
            }
            salida.append(op).append(' ');
        }

        return salida.toString().trim();
    }

    public static double evaluarPostfija(String postfija) {
        if (postfija == null || postfija.trim().isEmpty()) {
            throw new IllegalArgumentException("La expresión está vacía");
        }

        Stack<Double> pila = new Stack<>();
        String[] tokens = postfija.trim().split("\\s+");   // separa por uno o más espacios

        for (String t : tokens) {
            if (t.length() == 1 && esOperador(t.charAt(0))) {
                if (pila.getSize() < 2) {
                    throw new IllegalArgumentException("Expresión mal formada: faltan operandos para '" + t + "'");
                }
                double b = pila.pop();     // operando DERECHO (sale primero)
                double a = pila.pop();     // operando IZQUIERDO

                switch (t.charAt(0)) {
                    case '+': pila.push(a + b); break;
                    case '-': pila.push(a - b); break;
                    case '*': pila.push(a * b); break;
                    case '/':
                        if (b == 0) {
                            throw new ArithmeticException("División por cero");
                        }
                        pila.push(a / b);
                        break;
                    case '^': pila.push(Math.pow(a, b)); break;
                }
            } else {
                try {
                    pila.push(Double.parseDouble(t));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Operando no numérico: " + t);
                }
            }
        }

        if (pila.getSize() != 1) {
            throw new IllegalArgumentException("Expresión mal formada: sobran operandos");
        }
        return pila.pop();
    }
}