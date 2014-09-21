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


        generator.setWhiteSymbol('w');
        generator.setBlackSymbol('=');

        assertArrayEquals(new String[]{
                "[w][=][w][=][w][=][w][=]",
                "[=][w][=][w][=][w][=][w]",
                "[w][=][w][=][w][=][w][=]",
                "[=][w][=][w][=][w][=][w]",
                "[w][=][w][=][w][=][w][=]",
                "[=][w][=][w][=][w][=][w]",
                "[w][=][w][=][w][=][w][=]",
                "[=][w][=][w][=][w][=][w]"}, generator.generate(8));

        generator.setBorders(false);
        generator.setWhiteSymbol('O');

        assertArrayEquals(new String[]{
                " O  =  O  =  O  =  O  = ",
                " =  O  =  O  =  O  =  O ",
                " O  =  O  =  O  =  O  = ",
                " =  O  =  O  =  O  =  O ",
                " O  =  O  =  O  =  O  = ",
                " =  O  =  O  =  O  =  O ",
                " O  =  O  =  O  =  O  = ",
                " =  O  =  O  =  O  =  O "}, generator.generate(8));
    }
}
