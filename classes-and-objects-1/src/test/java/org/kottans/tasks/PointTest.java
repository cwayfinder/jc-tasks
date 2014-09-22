package org.kottans.tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void testToString() throws Exception {
        assertEquals("{\"x\": 4, \"y\": 7}", new Point(4, 7).toString());
        assertEquals("{\"x\": 1, \"y\": 1}", new Point(1, 1).toString());
        assertEquals("{\"x\": 122, \"y\": 12}", new Point(122, 12).toString());
    }
}
