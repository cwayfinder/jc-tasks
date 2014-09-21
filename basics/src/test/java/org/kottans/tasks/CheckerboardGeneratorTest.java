package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Write a method checkerboard which takes an integer size and returns a checkerboard of dimensions size x size.
 * There are two colored squares on the checkerboard.
 */
public class CheckerboardGeneratorTest {

    @Test
    public void test() {
        CheckerboardGenerator generator = new CheckerboardGenerator();

        assertArrayEquals(new String[]{"[ ]"}, generator.generate(1));

        assertArrayEquals(new String[]{
                "[ ][b][ ][b][ ]",
                "[b][ ][b][ ][b]",
                "[ ][b][ ][b][ ]",
                "[b][ ][b][ ][b]",
                "[ ][b][ ][b][ ]"}, generator.generate(5));

        assertArrayEquals(new String[]{
                "[ ][b][ ][b][ ][b][ ][b]",
                "[b][ ][b][ ][b][ ][b][ ]",
                "[ ][b][ ][b][ ][b][ ][b]",
                "[b][ ][b][ ][b][ ][b][ ]",
                "[ ][b][ ][b][ ][b][ ][b]",
                "[b][ ][b][ ][b][ ][b][ ]",
                "[ ][b][ ][b][ ][b][ ][b]",
                "[b][ ][b][ ][b][ ][b][ ]"}, generator.generate(8));
    }
}
