// 4. Median of Two Sorted Arrays

package leetcode;

public class LC4 {
    public double solution1(final int[] nums1, final int[] nums2) {
        final var length = nums1.length + nums2.length;
        final var half = length >> 1;
        final var cursors = new int[] {0, 0};
        final var nums = new int[][] {nums1, nums2};
        var source = 0;
        for (var i = 0; i < half; i++) {
            source = nextSource(nums, cursors);
            cursors[source] += 1;
        }
        if (half + half != length) {
            source = nextSource(nums, cursors);
            return nums[source][cursors[source]];
        } else {
            final var target1 = nums[source][cursors[source] - 1];
            final var secondSource = nextSource(nums, cursors);
            final var target2 = nums[secondSource][cursors[secondSource]];
            return (target1 + target2) / 2.0;
        }
    }

    private int nextSource(final int[][] nums, final int[] cursors) {
        if (cursors[0] >= nums[0].length && cursors[1] >= nums[1].length) return -1;
        if (cursors[0] >= nums[0].length) return 1;
        if (cursors[1] >= nums[1].length) return 0;
        if (nums[0][cursors[0]] < nums[1][cursors[1]]) {
            return 0;
        } else {
            return 1;
        }
    }
}
