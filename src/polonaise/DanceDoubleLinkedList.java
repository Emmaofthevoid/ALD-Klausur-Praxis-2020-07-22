package polonaise;

public class DanceDoubleLinkedList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // Methode, um eine(n) neue(n) TaenzerIn an erster/vorderster Position
    // der Polonaise einzufügen
    public void insertDancerAtFirstPos(String name) {
        Node newNode = new Node(name);
        // Fall: liste ist noch leer
        if (first == null) {
            first = newNode;
            last = newNode;
        }

        else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }


    }
}
