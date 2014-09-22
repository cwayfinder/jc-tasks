package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringHelperTest {

    @Test
    public void testEmptyString() {
        StringHelper helper = new StringHelper();

        assertNull(helper.lastChar(""));
    }

    @Test
    public void testNotEmptyString() {
        StringHelper helper = new StringHelper();

        assertEquals('z', helper.lastChar("xyz"));
        assertEquals('4', helper.lastChar("1234"));
        assertEquals('\n', helper.lastChar("something\n"));
    }
}
