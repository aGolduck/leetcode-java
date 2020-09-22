// 3Sum

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

public class LC15 {
    public List<List<Integer>> solution1(int @NotNull [] nums) {
        Arrays.sort(nums);
        Map<Integer, List<Integer>> mapping = new HashMap<>();
        List<List<Integer>> result = new LinkedList<>();

        var threeZerosOrMore = false;
        for (var i = 0; i < nums.length; i++) {
            var indexes = mapping.get(nums[i]);
            if (indexes == null) {
                var newIndexes = new LinkedList<Integer>();
                newIndexes.add(i);
                mapping.put(nums[i], newIndexes);
            } else {
                if (nums[i] == 0 && indexes.size() == 2) {
                    threeZerosOrMore = true;
                } else if (indexes.size() < 2){
                    indexes.add(i);
                }
            }
        }
        if (threeZerosOrMore) {
            result.add(List.of(0, 0, 0));
        }

        for (var i = 0; i < nums.length - 2; i++) {
            var firstLocations = mapping.get(nums[i]);
            if (firstLocations.get(0) != i) {
                break;
            } else {
                for (var j = i + 1; j < nums.length - 1; j++) {
                    var secondLocations = mapping.get(nums[j]);
                    if (nums[i] == nums[j]) {
                        if (firstLocations.get(1) != j) break;
                    } else {
                        if (secondLocations.get(0) != j) break;
                    }
                    var third = -nums[i] - nums[j];
                    if (third == nums[i]) {
                        if (firstLocations.get(1) <= j) break;
                    } else if (third == nums[j]) {
                        if (secondLocations.get(1) <= j) break;
                    } else {
                        var thirdLocations = mapping.get(third);
                        if (thirdLocations == null) break;
                        var thirdLoc = thirdLocations.get(0);
                        if (thirdLoc <= j) break;;
                    }
                    result.add(List.of(nums[i], nums[j], third));
                }
            }
        }

        return result;
    }
}
