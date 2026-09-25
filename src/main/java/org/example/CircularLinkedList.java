package org.example;

public class CircularLinkedList <T> {
    private Node<T> dummy;

    public CircularLinkedList() {
        dummy = new Node<>(null);
        dummy.next = dummy;
    }
    public void addItem(T item) {
        Node<T> newNode = new Node<>(item);
        Node<T> cur = dummy;
        while (cur.next != dummy) {
            cur = cur.next;
        }
        newNode.next = dummy;
        cur.next = newNode;
    }
    public String showList() {
        StringBuilder sb = new StringBuilder();
        Node<T> cur = dummy.next;
        while (cur != dummy){
            sb.append(cur.data);
            cur = cur.next;
        }
        return sb.toString().trim();
    }
}
