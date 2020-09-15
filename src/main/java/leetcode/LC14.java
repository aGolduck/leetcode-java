// 14. Longest Common Prefix

package leetcode;

import java.util.stream.Stream;

class LC14 {
    public String solution1(final String[] strs) {
        if (strs.length == 0) return "";
        var i = 0;
        while (true) {
            final var ii = i;
            final var isSame = Stream.of(strs)
                .allMatch(s -> s.length() > ii && s.charAt(ii) == strs[0].charAt(ii));
            if (isSame) {
                i += 1;
            } else {
                break;
            }
        }

        return strs[0].substring(0, i);
    }
}
