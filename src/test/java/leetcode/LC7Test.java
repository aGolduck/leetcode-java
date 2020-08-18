package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LC7Test {
    @Test public void solution1Test() {
        final var lc = new LC7();

        assertEquals(321, lc.solution1(123));
        assertEquals(-321, lc.solution1(-123));
        assertEquals(21, lc.solution1(120));
        assertEquals(0, lc.solution1(1534236469));
    }
}
