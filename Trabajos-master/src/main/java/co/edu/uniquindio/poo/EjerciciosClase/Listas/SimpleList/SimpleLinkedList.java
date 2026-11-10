package co.edu.uniquindio.poo.EjerciciosClase.Listas.SimpleList;

public class SimpleLinkedList {

    private int size;
    private NodeSimple firstNode;

    public SimpleLinkedList() {
        this.size = 0;
        firstNode = null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(int data) {
        NodeSimple newNodeSimple = new NodeSimple(data);
        if(isEmpty()){
            firstNode = newNodeSimple;
        }else{
            newNodeSimple.setNext(firstNode);
            firstNode = newNodeSimple;
        }
        size++;
    }



    private boolean isEmpty() {
        return firstNode == null;
    }

    public void addLast(int data) {
        NodeSimple newNodeSimple = new  NodeSimple(data);
        if(isEmpty()){
            firstNode = newNodeSimple;
        }else{
            NodeSimple aux = firstNode;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNodeSimple);
        }
        size++;
    }

    public void print(){
        NodeSimple aux = firstNode;//Inicialización
        while(aux != null){//condición de parada, ciclo
            System.out.print(aux.getData()+"->");//instrucciones que se repiten
            aux = aux.getNext();//incremento
        }
    }

    public void print2(){
        //Inicialización, condición de parada, incremento, ciclo, instrucciones que se repiten
        for(NodeSimple aux = firstNode; aux != null; aux = aux.getNext()){
            System.out.print(aux.getData()+"->");
        }
    }

    public void print3(){
        NodeSimple aux = firstNode;//Inicialización
        print3(firstNode); //ciclo
    }
    private void print3(NodeSimple aux) {
        if(aux != null){//condición de parada
            System.out.print(aux.getData()+"->");//instrucciones que se repiten
            print3(aux.getNext());//ciclo, incremento
            System.out.print(aux.getData()+"->");//instrucciones que se repiten
        }
    }

    public void print4(){
        NodeSimple aux = firstNode;//Inicialización
        while(aux != null){//condición de parada, ciclo
            aux = aux.getNext();//incremento
        }
    }

    public void clear(){
        size = 0;
        firstNode = null;
    }

    public boolean addInPosition(int index, int data) {
        NodeSimple newNodeSimple = new NodeSimple(data);
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index== size) {
            addLast(data);
            return true;
        }

        NodeSimple aux = firstNode;
        for (int i = 0; i < index - 1; i++) {
            aux = aux.getNext();
        }
        newNodeSimple.setNext(aux.getNext());
        aux.setNext(newNodeSimple);
        size++;
        return true;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            return;
        }
        firstNode = firstNode.getNext();
        size--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            return;
        }
        if (firstNode.getNext() == null) {
            firstNode = null;
        } else {
            NodeSimple aux = firstNode;
            while (aux.getNext().getNext() != null) {//ciclo, incremento
                aux = aux.getNext();
            }
            aux.setNext(null);
        }
        size--;
    }

    public boolean remove(int data) {
        if (isEmpty()) {
            return false;
        }
        if (firstNode.getData() == data) {
            firstNode = firstNode.getNext();
            size--;
            return true;
        }

        NodeSimple aux = firstNode;
        while (aux.getNext() != null && aux.getNext().getData() != data) {
            aux = aux.getNext();
        }

        if (aux.getNext() == null) {
            return false;
        }

        aux.setNext(aux.getNext().getNext());
        size--;
        return true;
    }

    public int getNodeValue(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Posición inválida: " + position);
        }
        NodeSimple aux = firstNode;
        for (int i = 0; i < position; i++) {
            aux = aux.getNext();
        }
        return aux.getData();
    }

    public int getNodePosition(int data) {
        int position = 0;
        for (NodeSimple aux = firstNode; aux != null; aux = aux.getNext()) {
            if (aux.getData() == data) {
                return position;
            }
            position++;
        }
        return -1;
    }

    public boolean indexValid(int index) {
        return index >= 0 && index < size;
    }

    public boolean modifyNode(int index, int newValue) {
        if (!indexValid(index)) {
            return false;
        }
        NodeSimple aux = firstNode;
        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }
        aux.setData(newValue);
        return true;
    }

    public void ordenarLista() {
        if (isEmpty() || firstNode.getNext() == null) {
            return;
        }
        boolean huboCambio;
        do {
            huboCambio = false;
            for (NodeSimple aux = firstNode; aux.getNext() != null; aux = aux.getNext()) {
                if (aux.getData() > aux.getNext().getData()) {
                    int temp = aux.getData();
                    aux.setData(aux.getNext().getData());
                    aux.getNext().setData(temp);
                    huboCambio = true;
                }
            }
        } while (huboCambio);
    }

}