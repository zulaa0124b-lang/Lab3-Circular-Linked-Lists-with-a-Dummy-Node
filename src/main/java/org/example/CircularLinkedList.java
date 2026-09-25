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
        return sb.toString();
    }

    public String showReverse(){
        StringBuilder sb = new StringBuilder();
        reverseHelper (dummy.next, sb);
        return sb.toString();
    }

    private void reverseHelper(Node<T> cur, StringBuilder sb) {
        if (cur == dummy) {
            return;
        }

        reverseHelper (cur.next, sb);
        sb.append(cur.data);
    }

    public boolean find(T value){
        Node<T> cur = dummy.next;
        while (cur != dummy){
            if (cur.data.equals(value)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public boolean remove(T value){
        Node<T> prev = dummy;
        Node<T> cur = dummy.next;
        while (cur != dummy){
            if (cur.data.equals(value)){
                prev.next = cur.next;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }
}
