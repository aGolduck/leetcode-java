// 7. Reverse Integer

package leetcode;

public class LC7 {
    public int solution1 (int x) {
        if (x == 0) return 0;
        var result = 0L;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }
        return (int)result;
    }
}
