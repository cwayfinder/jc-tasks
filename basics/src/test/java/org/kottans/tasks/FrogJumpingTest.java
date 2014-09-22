package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * You have an array of integers and have a frog that starts at the first position.
 * Every integer tells you the length of step that you have to make. The length is measured in number of indices.
 * Your objective is to find how many steps the frog needs to make to go out of array.
 * The function should return count of steps or -1 in any other case such as: the frog can't move out of the array.
 */
public class FrogJumpingTest {

    @Test
    public void testNormalCase() throws Exception {
        FrogJumping frogJumping = new FrogJumping();

        assertEquals(3, frogJumping.count(new int[]{1, 2, 1, 5}));  // 1 -> 2 -> 5 -> out  steps = 3
    }

    @Test
    public void testIndefiniteJumping() throws Exception {
        FrogJumping frogJumping = new FrogJumping();

        assertEquals(-1, frogJumping.count(new int[]{1, -1}));  // 1 -> -1 -> 1 -> -1 -> .... steps = -1
    }
}
