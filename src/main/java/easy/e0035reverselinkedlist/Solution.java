package easy.e0035reverselinkedlist;

import common.ListNode;

public class Solution {
    /**
     * @param head: n
     * @return The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null) {
            return head;
        }
        ListNode p = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
        }
        if (count == 1) {
            return head;
        }

        ListNode d = new ListNode(-1);
        d.next = head;
        p = head.next;
        while (p != null) {
            head.next = p.next;
            p.next = d.next;
            d.next = p;
            p = head.next;
        }
        return d.next;

    }
}
