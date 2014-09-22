package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Write a method that takes an integer n and returns the nth iteration of the fractal known as Sierpinski's Gasket.
 * http://en.wikipedia.org/wiki/Sierpinski_triangle
 *
 * The fractal is composed entirely of L and white-space characters; each character has one space between it and the next (or a newline).
 */
public class SierpinskisGasketTest {

    @Test
    public void testZero() throws Exception {
        SierpinskisGasket gasket = new SierpinskisGasket();

        assertArrayEquals(new String[]{"L"}, gasket.build(0));
    }

    @Test
    public void testOne() throws Exception {
        SierpinskisGasket gasket = new SierpinskisGasket();

        assertArrayEquals(new String[]{"L", "L L"}, gasket.build(1));
    }

    @Test
    public void testTwo() throws Exception {
        SierpinskisGasket gasket = new SierpinskisGasket();

        assertArrayEquals(new String[]{
                "L",
                "L L",
                "L   L",
                "L L L L"}, gasket.build(2));
    }

    @Test
    public void testThree() throws Exception {
        SierpinskisGasket gasket = new SierpinskisGasket();

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
