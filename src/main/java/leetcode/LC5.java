// 5. Longest Palindromic Substring

package leetcode;

public class LC5 {
    public String dynamicProgramming(final String s) {
        if (s.length() == 0) return "";
        var result = s.substring(0, 1);
        final var table = new int[s.length()][s.length()];
        // length = 1;
        for (int left = 0, right = 0; left < s.length(); left++, right++) {
            table[left][right] = 1;
        }
        // length = 2;
        for (int left = 0, right = 1; left + 1< s.length(); left++, right++) {
            if (s.charAt(left) == s.charAt(left+1)) {
                table[left][right] = 2;
                result = s.substring(left, right + 1);
            } else {
                table[left][right] = 0;
            }
        }
        for (var length = 3; length <= s.length(); length++) {
            // right < s.length()
            for (int left = 0, right = length - 1; right < s.length(); left++, right++) {
                final var innerLeft = left + 1;
                final var innerRight = right - 1;
                if (table[innerLeft][innerRight] == 0) {
                    table[left][right] = 0;
                } else {
                    table[left][right]
                        = s.charAt(left) == s.charAt(right)
                        ? table[innerLeft][innerRight] + 2
                        : 0;
                    if (table[left][right] > result.length()) {
                        result = s.substring(left, right + 1);
                    }
                }
            }
        }
        return result;
    }

    public String expandAroundCenter(final String s) {
        if (s.length() == 0) return "";
        var result = s.substring(0, 1);
        for (var i = 1; i < s.length()-1; i++) {
            final var left = i;
            final var right = i;
            final var localLongest = expand(s, left, right);
            if (localLongest.length() > result.length()) result = localLongest;
        }
        for (var i = 0; i < s.length()-1; i++) {
            final var left = i;
            final var right = left + 1;
            if (s.charAt(left) != s.charAt(right)) continue;
            final var localLongest = expand(s, left, right);
            if (localLongest.length() > result.length()) result = localLongest;
        }
        return result;
    }

    private String expand(final String string, int left, int right) {
        while (left - 1>= 0
               && right + 1 < string.length()
               && string.charAt(left - 1) == string.charAt(right + 1)) {
            left = left - 1;
            right = right + 1;
        }
        return string.substring(left, right+1);
    }
}
