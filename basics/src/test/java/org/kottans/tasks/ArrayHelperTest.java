package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ArrayHelperTest {

    @Test
    public void testLast() {
        ArrayHelper helper = new ArrayHelper();

        assertNull(helper.last(new int[]{}));

        assertEquals(1, helper.last(new int[]{1}));
        assertEquals(5, helper.last(new int[]{4, 5}));
        assertEquals(5, helper.last(new int[]{3, 4, 5}));
        assertEquals(5, helper.last(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testSplit() {
        ArrayHelper helper = new ArrayHelper();

        assertArrayEquals(new int[]{1, 2, 3}, helper.split(123));
        assertArrayEquals(new int[]{1}, helper.split(1));
        assertArrayEquals(new int[]{8, 6, 7, 5, 3, 0, 9}, helper.split(8675309));
    }

    /**
     * Write a method that returns all of the sublists of an Array.
     */
    @Test
    public void testSubArrays() {
        ArrayHelper helper = new ArrayHelper();

        assertArrayEquals(new int[][]{
                new int[]{},
                new int[]{1}}, helper.subArrays(new int[]{1}));

        assertArrayEquals(new int[][]{
                new int[]{},
                new int[]{1},
                new int[]{2},
                new int[]{1, 2},
                new int[]{3},
                new int[]{1, 3},
                new int[]{2, 3},
                new int[]{1, 2, 3}}, helper.subArrays(new int[]{1, 2, 3}));
    }

    @Test
    public void testFilterPositive() {
        ArrayHelper helper = new ArrayHelper();

        assertArrayEquals(new int[]{1, 5, 6}, helper.filterPositive(new int[]{1, 5, 6}));
        assertArrayEquals(new int[]{4, 0}, helper.filterPositive(new int[]{-2, -4, -7, 4, 0}));
        assertArrayEquals(new int[]{0}, helper.filterPositive(new int[]{-2, -4, -7, 0}));
        assertArrayEquals(new int[]{1, 4, 5, 6}, helper.filterPositive(new int[]{1, -1, 4, -4, -3, -4, 5, 6}));
        assertArrayEquals(new int[]{1, 4, 3, 4, 5, 6}, helper.filterPositive(new int[]{1, -1, 4, -4, 3, 4, 5, 6}));
    }
}
