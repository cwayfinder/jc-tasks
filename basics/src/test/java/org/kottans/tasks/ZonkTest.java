package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Zonk is addictive dice game. In each round player rolls 6 dice. Then (s)he composes combinations from them.
 * Each combination gives certain points. Your task is simple - just evaluate current roll.
 * <p/>
 * Combination                  Example roll    Points
 * Straight (1,2,3,4,5 and 6)   6 3 1 2 5 4     1000 points
 * Three pairs of any dice      2 2 4 4 1 1     750 points
 * Three of 1                   1 4 1 1         1000 points
 * Three of 2                   2 3 4 2 2       200 points
 * Three of 3                   3 4 3 6 3 2     300 points
 * Three of 4                   4 4 4           400 points
 * Three of 5                   2 5 5 5 4       500 points
 * Three of 6                   6 6 2 6         600 points
 * Four of a kind               1 1 1 1 4 6     2 × Three-of-a-kind score (in example, 2000 pts)
 * Five of a kind               5 5 5 4 5 5     3 × Three-of-a-kind score (in example, 1500 pts)
 * Six of a kind                4 4 4 4 4 4     4 × Three-of-a-kind score (in example, 1600 pts)
 * Every 1                      4 3 1 2 2       100 points
 * Every 5                      5 2 6           50 points
 */
public class ZonkTest {

    @Test
    public void test() {
        Zonk zonk = new Zonk();

        assertEquals(100, zonk.getScore(new int[]{1, 2, 3}));      // returns 100 = points from one 1
        assertEquals(250, zonk.getScore(new int[]{3,4,1,1,5}));    // returns 250 = points from two 1 and one 5
        assertEquals(500, zonk.getScore(new int[]{2,3,2,3,3,2}));  // returns 500 = three of 2 + three of 3
        assertEquals(3050, zonk.getScore(new int[]{1,1,1,1,1,5})); // returns 3050 = five 1 + one 5
        assertEquals(0, zonk.getScore(new int[]{2,3,4,3,6,6}));    // returns 0 = no combinations here
        assertEquals(400, zonk.getScore(new int[]{2,2,6,6,2,2}));  // returns 400 = four 2, this cannot be scored as three pairs
        assertEquals(750, zonk.getScore(new int[]{1,3,4,3,4,1}));  // returns 750 = three pairs
        assertEquals(600, zonk.getScore(new int[]{3,3,3,3}));      // returns 600 = four of 3
        assertEquals(150, zonk.getScore(new int[]{1,2,3,4,5}));    // returns 150 = it's not straight
    }
}
