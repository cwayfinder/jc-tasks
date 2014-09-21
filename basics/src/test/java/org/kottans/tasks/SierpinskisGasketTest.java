package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SierpinskisGasketTest {

    /**
     * Write a function that takes an integer n and returns the nth iteration of the fractal known as Sierpinski's Gasket.
     * http://en.wikipedia.org/wiki/Sierpinski_triangle
     *
     * The fractal is composed entirely of L and white-space characters; each character has one space between it and the next (or a newline).
     */
    @Test
    public void test() {
        SierpinskisGasket gasket = new SierpinskisGasket();

        assertArrayEquals(new String[]{"L"}, gasket.build(0));

        assertArrayEquals(new String[]{"L", "L L"}, gasket.build(1));

        assertArrayEquals(new String[]{
                "L",
                "L L",
                "L   L",
                "L L L L"}, gasket.build(2));

        assertArrayEquals(new String[]{
                "L",
                "L L",
                "L   L",
                "L L L L",
                "L       L",
                "L L     L L",
                "L   L   L   L",
                "L L L L L L L L"}, gasket.build(3));
    }
}
