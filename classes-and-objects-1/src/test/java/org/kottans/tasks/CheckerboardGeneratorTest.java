package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Write a method which takes an integer size and returns a checkerboard of dimensions size x size.
 * There are two colored squares on the checkerboard.
 */
public class CheckerboardGeneratorTest {

    @Test
    public void testOne() throws Exception {
        CheckerboardGenerator generator = new CheckerboardGenerator();

        assertArrayEquals(new String[]{"[ ]"}, generator.generate(1));
    }

    @Test
    public void testFive() throws Exception {
        CheckerboardGenerator generator = new CheckerboardGenerator();

        assertArrayEquals(new String[]{
                "[ ][b][ ][b][ ]",
                "[b][ ][b][ ][b]",
                "[ ][b][ ][b][ ]",
                "[b][ ][b][ ][b]",
                "[ ][b][ ][b][ ]"}, generator.generate(5));
    }

    @Test
    public void testEightWithCustomCellSymbols() throws Exception {
        CheckerboardGenerator generator = new CheckerboardGenerator();

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
    }

    @Test
    public void testEightWithCustomCellSymbolAndWithoutBorders() throws Exception {
        CheckerboardGenerator generator = new CheckerboardGenerator();

        generator.setWhiteSymbol('O');
        generator.setBlackSymbol('=');
        generator.setBorders(false);

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
