package leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import leetcode.LC2.ListNode;

public class LC2Test {
    @Test public void soluction1Test() {
        var lc = new LC2();
        assertEquals(buildList(new int[]{0}), buildList(new int[]{0}));
        assertEquals(buildList(new int[]{0}),
                     lc.solution1(buildList(new int[]{0}), buildList(new int[]{0})));
        assertEquals(buildList(new int[]{9,9,9}),
                     lc.solution1(buildList(new int[]{0}), buildList(new int[]{9,9,9})));
        assertEquals(buildList(new int[]{0, 0, 0, 1}),
                     lc.solution1(buildList(new int[]{2}), buildList(new int[]{8,9,9})));
    }

    private LC2.ListNode buildList(int[] list) {
        var header = new LC2.ListNode();
        var pointer = header;
        Arrays.stream(list).boxed()
            .reduce(
                    pointer,
                    (LC2.ListNode acc, Integer item) -> {
                        acc.next = new ListNode(item);
                        return acc.next;
                    },
                    (a, b) -> {return a;}
                    );
        // System.out.println(header.next);
        return header.next;
        // var header = new LC2.ListNode();
        // var cursor = header;
        // for (var item : list) {
        //     cursor.next = new LC2.ListNode(item);
        //     cursor = cursor.next;
        // }
        // System.out.println(header.next);
        // return header.next;
    }
}
