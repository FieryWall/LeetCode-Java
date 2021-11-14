package p2_add_two_numbers;

public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return step(l1, l2, 0);
    }

    private ListNode step(ListNode l1, ListNode l2, int c) {
        if(l1 == null && l2 == null && c == 0) return null;
        ListNode n = l1 != null ? l1 : (l2 != null ? l2 : new ListNode(0));
        n.val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + c;
        c = n.val / 10;
        n.val %= 10;
        n.next = step(l1 == null ? null : l1.next, l2 == null ? null : l2.next, c);
        return n;
    }
}