package com.lissenok88.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void searchMaxPriceWhenResultSomeNumber() {
        int actual = Task1.searchMaxPrice(5, 13, new int[]{3, 10, 300, 15, 3});
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void searchMaxPriceWhenResultZero() {
        int actual = Task1.searchMaxPrice(3, 4, new int[]{5, 12, 10});
        int expected = 0;
        assertEquals(expected, actual);
    }
}