package p2_add_two_numbers;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public int[] asIntArray() {
        List<Integer> list = new ArrayList<Integer>();
        ListNode node = this;
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
