// https://leetcode.com/problems/add-two-numbers/

package leetcode;

public class LC2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(final int val) { this.val = val; }
        ListNode(final int val, final ListNode next) { this.val = val; this.next = next; }
		@Override
		public boolean equals(final Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final ListNode other = (ListNode) obj;
			if (val != other.val)
				return false;
                        if (next == null && other.next == null) return true;
			return next.equals(other.next);
		}
		@Override
		public String toString() {
                    return String.valueOf(val) + (next == null ? "." : "-" + next.toString());
		}
    }

    public ListNode solution1(final ListNode l1, final ListNode l2) {
        // final var sum = l1.val + l2.val;
        // final var hasCarry = sum >= 10;
        // return new ListNode(
        //                 (hasCarry?sum:sum-10),
        //                 solution1Helper(l1.next, l2.next, (hasCarry?1:0)));
        return solution1Helper(l1, l2, 0);
    }

    private ListNode solution1Helper(final ListNode l1, final ListNode l2, final int carry) {
        // System.out.println("-------------------------------------------");
        // System.out.println(l1);
        // System.out.println(l2);
        // System.out.println(carry);
        // System.out.println("-------------------------------------------");
        if (l1 != null && l2 != null) {
            final var sum = l1.val + l2.val + carry;
            if (sum < 10) {
                return new ListNode(sum, solution1Helper(l1.next, l2.next, 0));
            } else {
                return new ListNode(sum - 10, solution1Helper(l1.next, l2.next, 1));
            }
        } else if (l1 != null && l2 == null) {
            final var sum = l1.val + carry;
            if (sum < 10) {
                return new ListNode(sum, l1.next);
            } else {
                return new ListNode(sum - 10, solution1Helper(l1.next, null, 1));
            }
        } else if (l1 == null && l2 != null){
            return solution1Helper(l2, l1, carry);
        } else {
            // l1 == null && l2 == null
            if (carry == 0) {
                return null;
            } else {
                return new ListNode(1);
            }
        }
    }
}
