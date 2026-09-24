package org.example;

public class CircularLinkedList <T> {
    private Node<T> dummy;

    public CircularLinkedList() {
        dummy = new Node<>(null);
        dummy.next = dummy;
    }

    public String showList() {
        // start at dummy.next, walk until you're back at dummy
        return "";
    }
}
