package co.edu.uniquindio.poo.EjerciciosClase.Pilas;

import static co.edu.uniquindio.poo.EjerciciosClase.Pilas.Stack.esPalindromo;

public class Main {

    static void main() {
        Stack<Integer> pila1 = new Stack<>();
        pila1.push(6);
        pila1.push(7);
        pila1.push(8);
        pila1.push(9);
        pila1.push(10);


        Stack<Integer> pila2= new Stack<>();
        pila2.push(1);
        pila2.push(2);
        pila2.push(3);
        pila2.push(4);
        pila2.push(5);


        pila1.addAll(pila2);
        pila1.print();
        System.out.println(pila2.getSize()); // esperado: 5
        pila2.addAll(pila2);
        System.out.println(pila2.getSize()); // esperado: 10

        System.out.println(ConversorExpresiones.infijaAPostfija("(3+26-5)*2"));
        System.out.println(ConversorExpresiones.infijaAPostfija("a*(b+c)-d/e"));
        System.out.println(ConversorExpresiones.infijaAPostfija("2^3^2"));

        String infija = "(3+26-5)*2";
        String postfija = ConversorExpresiones.infijaAPostfija(infija);
        System.out.println(postfija);                                      // 3 26 + 5 - 2 *
        System.out.println(ConversorExpresiones.evaluarPostfija(postfija)); // 48.0

        System.out.println(ConversorExpresiones.evaluarPostfija("5 1 2 + 4 * + 3 -"));  // 14.0
        System.out.println(ConversorExpresiones.evaluarPostfija("2 3 2 ^ ^"));          // 512.0
        System.out.println(ConversorExpresiones.evaluarPostfija("2 3 /"));              // 0.6666...


        System.out.println(esPalindromo("ala"));                  // true
        System.out.println(esPalindromo("reco"));                 // false
        System.out.println(esPalindromo("Anita lava la tina"));   // true
        System.out.println(esPalindromo("Neuquén"));              // false o true, ver pregunta
        System.out.println(esPalindromo(""));                     // true

    }


}
