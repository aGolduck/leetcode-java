// 14. Longest Common Prefix

package leetcode;

import java.util.stream.Stream;

class LC14 {
    public String solution1(String[] strs) {
        if (strs.length == 0) return "";
        var i = 0;
        for (final var ii = i;
             Stream.of(strs).allMatch(s -> s.length() > ii
                                      && s.charAt(ii) == strs[0].charAt(ii));) {
            i++;
        }

        return strs[0].substring(0, i);
    }
}
