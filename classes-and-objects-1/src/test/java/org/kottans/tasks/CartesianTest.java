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

        assertTrue(cartesian.arePointOnLine(new Point[]{
                new Point(1, 5),
                new Point(3, 5),
                new Point(22, 5)}));

        assertTrue(cartesian.arePointOnLine(new Point[]{
                new Point(-1, -1),
                new Point(2, 2),
                new Point(7, 7)}));

        assertTrue(cartesian.arePointOnLine(new Point[]{
                new Point(1, 2),
                new Point(7, 4),
                new Point(22, 9)}));

        assertFalse(cartesian.arePointOnLine(new Point[]{
                new Point(1, 2),
                new Point(-3, -14),
                new Point(22, 9)}));
    }
}
