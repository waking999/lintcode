package easy.e0167addtwonumbers;

import common.ListNode;

public class Solution {
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode p1 = new ListNode(-1);
        p1.next = l1;
        ListNode p2 = new ListNode(-1);
        p2.next = l2;

        int carrier = 0;
        while (p1.next != null && p2.next != null) {
            int a = p1.next.val;
            int b = p2.next.val;
            int s = a + b + carrier;
            if (s <= 9) {
                p1.next.val = s;
                carrier = 0;
            } else {
                s -= 10;
                p1.next.val = s;
                carrier = 1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        if (p1.next == null && p2.next == null) {

            if (carrier == 1) {
                p1.next = new ListNode(1);
                carrier = 0;
            }
        }

        if (p2.next != null) {
            while (p2.next != null) {
                int a = p2.next.val;
                int s = a + carrier;
                if (s <= 9) {
                    p1.next = new ListNode(s);
                    carrier = 0;
                } else {
                    s -= 10;
                    p1.next = new ListNode(s);
                    carrier = 1;
                }
                p1 = p1.next;
                p2 = p2.next;
            }


            if (carrier == 1) {
                p1.next = new ListNode(1);
                carrier = 0;
            }

        }


        if (p1.next != null) {
            while (p1.next != null) {
                int a = p1.next.val;
                int s = a + carrier;
                if (s <= 9) {
                    p1.next = new ListNode(s);
                    carrier = 0;
                } else {
                    s -= 10;
                    p1.next = new ListNode(s);
                    carrier = 1;
                }
                p1 = p1.next;
            }
            if (carrier == 1) {
                p1.next = new ListNode(1);
                carrier = 0;
            }

        }

        return l1;
    }
}
