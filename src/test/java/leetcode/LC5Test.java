package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LC5Test {
    @Test public void expandAroundCenterTest() {
        final var lc = new LC5();

        assertEquals("a", lc.expandAroundCenter("abc"));
        assertEquals("bb", lc.expandAroundCenter("abbc"));
        assertEquals("aba", lc.expandAroundCenter("ababc"));
        assertEquals("bcdcb", lc.expandAroundCenter("abcdcbe"));
        assertEquals("bccb", lc.expandAroundCenter("abccbd"));
    }

    @Test public void dynamicProgrammingTest() {
        final var lc = new LC5();

        assertEquals("a", lc.dynamicProgramming("abc"));
        assertEquals("bb", lc.dynamicProgramming("abbc"));
        assertEquals("aba", lc.dynamicProgramming("ababc"));
        assertEquals("bcdcb", lc.dynamicProgramming("abcdcbe"));
        assertEquals("bccb", lc.dynamicProgramming("abccbd"));
        assertEquals("ccc", lc.dynamicProgramming("ccc"));
    }
}
