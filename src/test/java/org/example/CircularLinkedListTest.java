package org.example;

import org.junit.jupiter.api.Test;

import java.nio.channels.AsynchronousServerSocketChannel;

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

        assertTrue(list.remove(2));                 // did remove() work
        assertEquals("4 1 ", list.showList());   // is 2 actually gone
        assertFalse(list.find(2));              // sanity check via find, too

        }
        @Test
        void findItem() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            list.addItem(2);
            // 2 is the only item, it should pass as it finds 2 and returns true
            assertTrue(list.find(2));
            list.addItem(4);
            assertFalse(list.find(3));
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

        @Test
        void remove() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            list.addItem(2);
            assertFalse(list.remove(4)); // 4 is not existing

            assertEquals("2 ", list.showReverse());
            assertTrue(list.find(1)); //confirm 2 is still in the list and findable
        }
    @Test
    void addAndRemoveManyItems() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.addItem(i);
        }
        for (int i = 0; i < 100; i++) {
            assertTrue(list.remove(i));
        }
        assertEquals("", list.showList());
    }
    }