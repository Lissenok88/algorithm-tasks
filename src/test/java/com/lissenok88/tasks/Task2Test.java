package com.lissenok88.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void maxWordCountWhenResultTwo() {
        int actual = Task2.maxWordCount("sheriff", "fheriherffazfszkisrrs");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void maxWordCountWhenResultOne() {
        int actual = Task2.maxWordCount("sheriff", "rifftratatashe");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void maxWordCountWhenResultZero() {
        int actual = Task2.maxWordCount("sheriff", "thegorillaiswhatching");
        int expected = 0;
        assertEquals(expected, actual);
    }
}