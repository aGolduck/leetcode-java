// 8. String to Integer

package leetcode;

import java.util.Map;

public class LC8 {
    public int solution1(String str) {
        // var map = Map.of('0', 0, '1', 1, '2', 2, '3', 3, '4', 4,
        //        '5', 5, '6', 6, '7', 7, '8', 8, '9', 9);
        var i = 0;
        var negative = false;
        var result = 0L;
        while (i < str.length() && str.charAt(i) == ' ') i = i+1;
        if ( i == str.length()) {
            return 0;
        } else {
            if (str.charAt(i) == '+') {
                i = i+1;
            } else if (str.charAt(i) == '-') {
                negative = true;
                i = i + 1;
            }
            if (i == str.length()) {
                return 0;
            }
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            if (negative && 0L - result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (!negative && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i = i + 1;
        }

        return negative ? (int)(0L - result) : (int)result;
    }
}
