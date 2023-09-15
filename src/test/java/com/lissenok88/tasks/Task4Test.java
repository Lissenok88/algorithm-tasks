package com.lissenok88.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void amountDollarsWhenResultTrue() {
        boolean actual = Task4.isStole(5, new int[]{1, 1, 2, 2});
        assertTrue(actual);
    }

    @Test
    void amountDollarsWhenResultFalse() {
        boolean actual = Task4.isStole(7, new int[]{1, 1, 2, 2});
        assertFalse(actual);
    }
}