package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LC6Test {
    @Test public void solution1Test() {
        final var lc = new LC6();

        // assertEquals("a", lc.solution1("a", 1));
        // assertEquals("ab", lc.solution1("ab", 2));
        // assertEquals("acbd", lc.solution1("abcd", 2));
        // assertEquals("acebd", lc.solution1("abcde", 2));
        assertEquals("aebdfhcg", lc.solution1("abcdefgh", 3));
    }
}
