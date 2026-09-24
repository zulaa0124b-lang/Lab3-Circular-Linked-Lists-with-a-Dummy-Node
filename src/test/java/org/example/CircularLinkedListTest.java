package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {

        @Test
        void newListIsEmpty() {
            CircularLinkedList<Integer> list = new CircularLinkedList<>();
            assertEquals("", list.showList());
        }
    }