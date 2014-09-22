package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Implement the get() method that returns a villain name based on the user's birthday.
 *
 * The first name will come from the month, and the last name will come from the last digit of the date.
 *
 * Month -> first name
 *
 * January -> "The Evil"
 * February -> "The Vile"
 * March -> "The Cruel"
 * April -> "The Trashy"
 * May -> "The Despicable"
 * June -> "The Embarrassing"
 * July -> "The Disreputable"
 * August -> "The Atrocious"
 * September -> "The Twirling"
 * October -> "The Orange"
 * November -> "The Terrifying"
 * December -> "The Awkward"
 *
 * Last digit of date -> last name
 *
 * 0 -> "Mustache"
 * 1 -> "Pickle"
 * 2 -> "Hood Ornament"
 * 3 -> "Raisin"
 * 4 -> "Recycling Bin"
 * 5 -> "Potato"
 * 6 -> "Tomato"
 * 7 -> "House Cat"
 * 8 -> "Teaspoon"
 * 9 -> "Laundry Basket"
 * The returned value should be a string in the form of "First Name Last Name".
 */
public class VillainNameTest {

    @Test
    public void test() throws Exception {
        VillainName name = new VillainName();

        assertEquals("The Terrifying Teaspoon", name.get("November 18"));
    }

    // TODO: add the rest of tests
}
