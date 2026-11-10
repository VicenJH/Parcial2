package co.edu.uniquindio.poo.EjerciciosClase.Listas.SimpleList;

public class Main {

    static void main() {

        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.addFirst(5);
        simpleLinkedList.addLast(4);
        simpleLinkedList.addLast(3);
        simpleLinkedList.addLast(2);
        simpleLinkedList.addLast(1);


        simpleLinkedList.addInPosition(3, 4);
        simpleLinkedList.deleteFirst();
        simpleLinkedList.deleteLast();
        simpleLinkedList.remove(4);
        simpleLinkedList.print();
    }
}