// 3Sum
package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class LC15 {
    public List<List<Integer>> solution1(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> mapping = new HashMap<>();
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> uniqueNums = new ArrayList<>();

        var i = 0;
        while (i < nums.length) {
            var j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) {
                j += 1;
            }
            mapping.put(nums[i], i);
            i = j;
        }

        i = 0;
        while (i < nums.length) {
            uniqueNums.add(nums[i]);
            var j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) {
                j += 1;
            }
            if (nums[i] == 0) {
                if (j - i >= 3) {
                    result.add(List.of(0, 0, 0));
                }
            } else {
                if (j - i >= 2) {
                    var third = 0 - nums[i] - nums[i];
                    if (mapping.get(third) != null) {
                        result.add(List.of(nums[i], nums[i], third));
                    }
                }
            }
            i = j;
        }

        for (i = 0; i < uniqueNums.size() - 1; i++) {
            for (var j = i + 1; j < uniqueNums.size(); j++) {
                var third = 0 - uniqueNums.get(i) - uniqueNums.get(j);
                if (uniqueNums.get(i) < third && uniqueNums.get(j) < third && mapping.get(third) != null) {
                    result.add(List.of(uniqueNums.get(i), uniqueNums.get(j), third));
                }
            }
        }

        return result;
    }
}

