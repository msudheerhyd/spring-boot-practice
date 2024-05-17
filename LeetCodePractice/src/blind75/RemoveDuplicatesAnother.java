package blind75;

import java.util.Arrays;
import java.util.List;

class ListNode1 {
    int val;
    ListNode1 next;

    public ListNode1() {

    }
    public ListNode1(int val) {
        this.val = val;
    }

    public ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }

}

public class RemoveDuplicatesAnother {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode sHead = new ListNode(), node = head;
        ListNode sTail = sHead;

        while(node!=null) {
            while(node.next!=null && node.val == node.next.val) {
                node = node.next;
            }
            sTail.next = node;
            sTail = sTail.next;
            node = node.next;
        }
        return sHead.next;
    }

    public static void main(String[] args) {
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(1);
        ListNode m3 = new ListNode(3);

        m1.next = m2;
        m2.next = m3;

        ListNode k = deleteDuplicates(m1);
        printList(k);
    }

    public static void printList(ListNode head) {
        while(head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

