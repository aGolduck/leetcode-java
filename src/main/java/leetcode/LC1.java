// https://leetcode.com/problems/two-sum/

package leetcode;

import java.util.*;

public class LC1 {
    public int[] solution1(int[] nums, int target) {
        // // hash
        // 以值为键，以索引为值建立 HashMap

        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // TODO use stream each?
        for (int i = 0; i < nums.length; i++) {
            var match = target - nums[i];
            var matchIndex = map.get(match);
            if (matchIndex != null && i != matchIndex) {
                return new int[] {i, matchIndex};
            }
        }
        assert(false);
        return new int[]{0, 0};
    }
    // // sort
    // 快排
    // 循环去头去尾直至数组长度不再变化
    // 循环使用二分查找法查找结果
    // public int [] solution2(int[] nums, int target) {
    // }
}
