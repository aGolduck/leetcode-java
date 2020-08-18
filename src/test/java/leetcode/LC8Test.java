package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LC8Test {
    @Test
    public void solution1Test() {
        var lc = new LC8();
        assertEquals(42, lc.solution1("42"));
        assertEquals(-42, lc.solution1("-42"));
        assertEquals(-42, lc.solution1("   -42"));
        assertEquals(4193, lc.solution1("4193 with words"));
        assertEquals(0, lc.solution1("words and 987"));
        assertEquals(-2147483648, lc.solution1("-91283472332"));
    }
}
