package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The Hamming Distance is a measure of similarity between two strings of equal length.
 * Complete the function so that it returns the number of positions where the input strings do not match.
 * http://en.wikipedia.org/wiki/Hamming_distance
 */
public class HammingDistanceTest {

    @Test
    public void testEqualStrings() throws Exception {
        HammingDistance hd = new HammingDistance();

        assertEquals(0, hd.count("Java", "Java"));
        assertEquals(0, hd.count("11111", "11111"));
    }

    @Test
    public void test() throws Exception {
        HammingDistance hd = new HammingDistance();

        assertEquals(3, hd.count("karolin", "kathrin"));
        assertEquals(3, hd.count("I like turtles", "I like turkeys"));
    }
}
