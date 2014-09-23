package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddEvenTest {

    @Test
    public void testOdd() throws Exception {
        OddEven oddEven = new OddEven();

        assertEquals("Odd", oddEven.get(1));
        assertEquals("Odd", oddEven.get(3));
        assertEquals("Odd", oddEven.get(4));
        assertEquals("Odd", oddEven.get(-7));
        assertEquals("Odd", oddEven.get(9));
        assertEquals("Odd", oddEven.get(-31));
    }

    @Test
    public void testEven() throws Exception {
        OddEven oddEven = new OddEven();

        assertEquals("Even", oddEven.get(0));
        assertEquals("Even", oddEven.get(2));
        assertEquals("Even", oddEven.get(60));
        assertEquals("Even", oddEven.get(8));
    }
}
