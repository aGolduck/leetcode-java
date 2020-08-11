package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LC4Test {
    @Test public void solution1TCest() {
        var lc = new LC4();

        assertEquals(0.0, lc.solution1(new int [] {0, 0}, new int []{0, 0}), 1e-10);
        assertEquals(0.0, lc.solution1(new int [] {0, 0}, new int []{0, 0, 0}), 1e-10);
        assertEquals(3.0, lc.solution1(new int[]{1, 2}, new int[] {3,4,5}), 1e-10);
        assertEquals(2.5, lc.solution1(new int[]{1, 2}, new int[] {3,4}), 1e-10);
        assertEquals(2.5, lc.solution1(new int[]{1, 3}, new int[]{2, 4}), 1e-10);
        assertEquals(3.0, lc.solution1(new int[]{1}, new int[]{2,3,4,5}), 1e-10);
    }
}
