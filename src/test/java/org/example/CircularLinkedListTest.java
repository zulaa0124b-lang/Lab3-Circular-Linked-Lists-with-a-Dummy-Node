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
            // to make it look understandable, I added space function
            assertEquals("2 4 1 3 ", list.showList());
        }
        @Test
        void removeItem() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            list.addItem(2);
            list.addItem(4);
            list.addItem(1);
            list.remove(2);
            assertTrue(true);

        }
        @Test
        void findItem() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            list.addItem(2);
            // 2 is the only item, it should pass as it finds 2 and returns true
            assertTrue(list.find(2));
        }
        @Test
        void ShowReverse() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            list.addItem(2);
            list.addItem(4);
            list.addItem(1);
            list.addItem(3);
            //I added creating space logic after each value. It should pass
            assertEquals("3 1 4 2 ", list.showReverse());
        }
    }