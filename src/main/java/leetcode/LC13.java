// 13. Roman to Integer

package leetcode;

class LC13 {
    public int solution1(String s) {
        final var arabic = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final var roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        var result = 0;
        var iterator = 0;
        for (var i = 0; i < arabic.length; i++) {
            while (s.startsWith(roman[i], iterator)) {
                result += arabic[i];
                iterator += roman[i].length();
            }
        }
        return result;
    }
}
