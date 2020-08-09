package leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Test;

public class LC2Test {
    @Test public void soluction1Test() {
        var lc = new LC2();
        assertEquals(buildList(new int[]{0}), buildList(new int[]{0}));
        assertEquals(buildList(new int[]{0}),
                     lc.solution1(buildList(new int[]{0}), buildList(new int[]{0})));
        assertEquals(buildList(new int[]{9,9,9}),
                     lc.solution1(buildList(new int[]{0}), buildList(new int[]{9,9,9})));
        assertEquals(buildList(new int[]{0, 0, 0, 1}),
                     lc.solution1(buildList(new int[]{1}), buildList(new int[]{9,9,9})));
    }

    private LC2.ListNode buildList(int[] list) {
        // TODO use stream reduce
        // return Arrays.stream(list)
        //     .reduce((LC2.ListNode)null, (LC2.ListNode acc, Int item) -> {
        //         return new LC2.ListNode(item, acc);
        //     });
        var header = new LC2.ListNode();
        var cursor = header;
        for (var item : list) {
            cursor.next = new LC2.ListNode(item);
            cursor = cursor.next;
        }
        System.out.println(header.next);
        return header.next;
    }
}
