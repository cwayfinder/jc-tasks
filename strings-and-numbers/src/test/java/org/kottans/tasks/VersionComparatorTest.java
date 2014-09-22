package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VersionComparatorTest {

    @Test
    public void testEqualVersions() throws Exception {
        VersionComparator comparator = new VersionComparator();

        assertEquals(0, comparator.compare("11", "11"));
        assertEquals(0, comparator.compare("10.4.6", "10.4.6"));
    }

    @Test
    public void testGreaterThan() throws Exception {
        VersionComparator comparator = new VersionComparator();

        assertEquals(1, comparator.compare("11", "10"));
        assertEquals(1, comparator.compare("10.4.6", "10.4"));
    }

    @Test
    public void testLowerThan() throws Exception {
        VersionComparator comparator = new VersionComparator();

        assertEquals(-1, comparator.compare("10.4", "11"));
        assertEquals(-1, comparator.compare("10.4", "10.10"));
        assertEquals(-1, comparator.compare("10.4.9", "10.5"));
    }
}
