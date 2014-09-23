package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testNumber() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Object[] array = fizzBuzz.generate();
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(8, array[7]);
        assertEquals(16, array[15]);
    }

    @Test
    public void testFizz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Object[] array = fizzBuzz.generate();
        assertEquals("Should be \"Fizz\"  because 3 is divisible by 3", "Fizz", array[2]);
        assertEquals("Should be \"Fizz\"  because 9 is divisible by 3", "Fizz", array[8]);
        assertEquals("Should be \"Fizz\"  because 51 is divisible by 3", "Fizz", array[50]);
    }

    @Test
    public void testBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Object[] array = fizzBuzz.generate();
        assertEquals("Should be \"Buzz\"  because 5 is divisible by 5", "Buzz", array[4]);
        assertEquals("Should be \"Buzz\"  because 35 is divisible by 5", "Buzz", array[34]);
        assertEquals("Should be \"Buzz\"  because 65 is divisible by 5", "Buzz", array[64]);
    }

    @Test
    public void testFizzBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Object[] array = fizzBuzz.generate();
        assertEquals(16, array[15]);
        assertEquals("Should be \"FizzBuzz\"  because 15 is divisible by 3 and 5", "FizzBuzz", array[14]);
        assertEquals("Should be \"FizzBuzz\"  because 30 is divisible by 3 and 5", "FizzBuzz", array[29]);
        assertEquals("Should be \"FizzBuzz\"  because 45 is divisible by 3 and 5", "FizzBuzz", array[44]);
    }
}
