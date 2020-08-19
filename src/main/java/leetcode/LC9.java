package leetcode;

public class LC9 {
    public boolean solution1 (int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        // leading 0
        if (x % 10 == 0) return false;
        var reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            if (x == reverse) return true;
            x = x / 10;
            if (x == reverse) return true;
        }
        return false;
    }
}
