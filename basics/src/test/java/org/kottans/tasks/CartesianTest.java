package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Given an array points (cartesian coordinates), return true if all of them can lie on a line.
 */
public class CartesianTest {

    @Test
    public void testPointsOnLine() {
        Cartesian cartesian = new Cartesian();

        assertTrue(cartesian.arePointOnLine(new int[][]{
                new int[]{1, 5},
                new int[]{3, 5},
                new int[]{22, 5}}));

        assertTrue(cartesian.arePointOnLine(new int[][]{
                new int[]{-1, -1},
                new int[]{2, 2},
                new int[]{7, 7}}));

        assertTrue(cartesian.arePointOnLine(new int[][]{
                new int[]{1, 2},
                new int[]{7, 4},
                new int[]{22, 9}}));

        assertFalse(cartesian.arePointOnLine(new int[][]{
                new int[]{1, 2},
                new int[]{-3, -14},
                new int[]{22, 9}}));
    }
}
