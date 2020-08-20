// 10. Regular Expression Matching

package leetcode;

class LC10 {
    public boolean recursive(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        var firstMatch = !s.isEmpty()
            && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return recursive(s, p.substring(2))
                || (firstMatch & recursive(s.substring(1), p));
        } else {
            return firstMatch && recursive(s.substring(1), p.substring(1));
        }
    }

    public boolean dynamicProgramming(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[s.length()][p.length()] = true;
        for (int i = s.length(); i >= 0; i--) {
            for (int j = s.length() - 1; j >= 0; j--) {
                boolean first_match = i < p.length()
                    && p.charAt(j) == s.charAt(i)
                    || p.charAt(j) == '*';
                if (j + 1 < p.length() && p.charAt(j+1) == '*') {
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }
}
