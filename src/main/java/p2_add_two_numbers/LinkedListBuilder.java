package p2_add_two_numbers;

public class LinkedListBuilder {
    public ListNode Build(int[] values) {
        ListNode prev = null;
        for (int i = values.length - 1; i >= 0; i--) {
            ListNode node = new ListNode(values[i]);
            node.next = prev;
            prev = node;
        }

        return prev;
    }
}
