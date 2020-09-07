// 12. Integer to Roman

package leetcode;

class LC12 {
    public String solution1(int num) {
        final var arabic = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final var roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final var result = new StringBuilder();
        for (int i = 0; i < arabic.length; i++) {
            while (num >= arabic[i]) {
                result.append(roman[i]);
                num -= arabic[i];
            }
        }
        return result.toString();
    }
}
