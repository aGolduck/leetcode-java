package leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LC3Test {
    @Test public void solution1Test() {
        var lc = new LC3();
        assertEquals(1, lc.solution1("bbbbbbbb"));
        assertEquals(3, lc.solution1("abcabcbb"));
        assertEquals(3, lc.solution1("pwwkew"));
        assertEquals(2, lc.solution1("abba"));
    }
}
