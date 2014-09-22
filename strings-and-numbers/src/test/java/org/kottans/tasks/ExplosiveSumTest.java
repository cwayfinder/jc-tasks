package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * How many ways can you make the sum of a number?
 * From wikipedia: https://en.wikipedia.org/wiki/Partition_(number_theory)
 *
 * In number theory and combinatorics, a partition of a positive integer n, also called an integer partition,
 * is a way of writing n as a sum of positive integers. Two sums that differ only in the order of their summands
 * are considered the same partition. (If order matters, the sum becomes a composition.)
 * For example, 4 can be partitioned in five distinct ways:
 *
 * 4
 * 3 + 1
 * 2 + 2
 * 2 + 1 + 1
 * 1 + 1 + 1 + 1
 */
public class ExplosiveSumTest {

    @Test
    public void test() throws Exception {
        ExplosiveSum explosiveSum = new ExplosiveSum();

        assertArrayEquals(new int[][]{new int[]{1}}, explosiveSum.show(1));
        assertArrayEquals(new int[][]{
                new int[]{1, 1},
                new int[]{2}}, explosiveSum.show(2));
        assertArrayEquals(new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 2},
                new int[]{3}}, explosiveSum.show(3));
        assertArrayEquals(new int[][]{
                new int[]{1, 1, 1, 1},
                new int[]{1, 1, 2},
                new int[]{1, 3},
                new int[]{2, 2},
                new int[]{4}}, explosiveSum.show(4));
        assertArrayEquals(new int[][]{
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1, 2},
                new int[]{1, 1, 3},
                new int[]{1, 2, 2},
                new int[]{1, 4},
                new int[]{5}}, explosiveSum.show(5));

        assertEquals(1, explosiveSum.count(1));
        assertEquals(2, explosiveSum.count(2));
        assertEquals(3, explosiveSum.count(3));
        assertEquals(5, explosiveSum.count(4));
        assertEquals(7, explosiveSum.count(5));
        assertEquals(42, explosiveSum.count(10));
        assertEquals(204226, explosiveSum.count(50));
        assertEquals(15796476, explosiveSum.count(80));
        assertEquals(190569292, explosiveSum.count(100));
    }

    @Test
    public void testWithOnePredefinedPartition() throws Exception {
        ExplosiveSum explosiveSum = new ExplosiveSum(new int[]{1});

        assertArrayEquals(new int[][]{new int[]{1}}, explosiveSum.show(1));
        assertArrayEquals(new int[][]{new int[]{1, 1}}, explosiveSum.show(2));
        assertArrayEquals(new int[][]{new int[]{1, 1, 1}}, explosiveSum.show(3));
        assertArrayEquals(new int[][]{new int[]{1, 1, 1, 1}}, explosiveSum.show(4));
        assertArrayEquals(new int[][]{new int[]{1, 1, 1, 1, 1}}, explosiveSum.show(5));

        assertEquals(1, explosiveSum.count(1));
        assertEquals(1, explosiveSum.count(2));
        assertEquals(1, explosiveSum.count(4));
        assertEquals(1, explosiveSum.count(10));
        assertEquals(1, explosiveSum.count(100));
    }

    @Test
    public void testWithSeveralPredefinedPartitions() throws Exception {
        ExplosiveSum explosiveSum = new ExplosiveSum(new int[]{1, 2, 4});

        assertArrayEquals(new int[][]{new int[]{1}}, explosiveSum.show(1));
        assertArrayEquals(new int[][]{
                new int[]{1, 1},
                new int[]{2}}, explosiveSum.show(2));
        assertArrayEquals(new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 2}}, explosiveSum.show(3));
        assertArrayEquals(new int[][]{
                new int[]{1, 1, 1, 1},
                new int[]{1, 1, 2},
                new int[]{2, 2},
                new int[]{4}}, explosiveSum.show(4));
        assertArrayEquals(new int[][]{
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 1, 1, 2},
                new int[]{1, 2, 2},
                new int[]{1, 4}}, explosiveSum.show(5));

        assertEquals(1, explosiveSum.count(1));
        assertEquals(2, explosiveSum.count(2));
        assertEquals(2, explosiveSum.count(3));
        assertEquals(4, explosiveSum.count(4));
        assertEquals(4, explosiveSum.count(5));
    }
}
