package com.lissenok88.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void isWinningSequenceWhenResultYes() {
        String actual = Task3.isWinningSequence(new int[]{4, 4, 1, 7, 5, 3, 8}, new int[]{4, 1, 4, 5, 7, 3, 8});
        String expected = "YES";
        assertEquals(expected, actual);
    }

    @Test
    void isWinningSequenceWhenResultNo() {
        String actual = Task3.isWinningSequence(new int[]{4, 1, 2}, new int[]{4, 1, 7});
        String expected = "NO";
        assertEquals(expected, actual);
    }
}