package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {

        @Test
        void newListIsEmpty() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            assertEquals("", list.showList());
            assertEquals("", list.showReverse());
        }

        @Test
        void addItem() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            list.addItem(2);
            list.addItem(4);
            list.addItem(1);
            list.addItem(3);

            assertEquals("2413", list.showList());
        }
    }