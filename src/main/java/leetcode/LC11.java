// 11. Container With Most Water

package leetcode;

class LC11 {
    public int solution1(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            boolean leftIsShorter = height[left] < height[right];
            int shorter = leftIsShorter ? height[left] : height[right];
            int area = shorter * (right - left);
            if (area > maxArea) maxArea = area;
            if (leftIsShorter) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
