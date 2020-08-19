package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LC9Test {
    @Test
    public void solution1Test() {
        var lc = new LC9();
        // assertEquals(true, lc.solution1(121));
        // assertEquals(true, lc.solution1(0));
        // assertEquals(false, lc.solution1(-121));
        assertEquals(false, lc.solution1(10));
    }
}
