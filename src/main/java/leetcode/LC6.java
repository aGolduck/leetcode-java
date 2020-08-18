// 6. ZigZag Conversion

package leetcode;

public class LC6 {
    public String solution1(final String s, final int numRows) {
        if (numRows == 1) return s;
        final var wordLength = numRows - 1;
        final var columnCount = s.length() / wordLength + (s.length() % wordLength > 0 ? 1 : 0);
        final var table = new String[columnCount];

        var row = 0;
        var isEvenRow = true;
        while (true) {
            final var start = row * wordLength;
            final var end = start + wordLength;
            final var segment = String.format("%-" + numRows + "s", s.substring(start, (end < s.length() ? end : s.length())));
            table[row] = isEvenRow ? segment : new StringBuilder(segment).reverse().toString();
            // System.out.println(table[row]);
            if (end >= s.length()) {
                break;
            } else {
                row = row + 1;
                isEvenRow = !isEvenRow;
            }
        }

        final var builder = new StringBuilder();
        for (var j = 0; j < numRows; j++) {
            for (var i = 0; i < columnCount; i++) {
                final var c = table[i].charAt(j);
                if (c != ' ') {
                    builder.append(c);
                }
            }
        }
        return builder.toString();
    }
}
