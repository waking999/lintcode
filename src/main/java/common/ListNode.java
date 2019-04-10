package common;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public String toString() {
        return Integer.toString(val);
    }

    public static ListNode constructListNode(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return null;
        } else if (n == 1) {
            return new ListNode(nums[0]);
        }

        ListNode start = new ListNode(nums[0]);
        ListNode tmp = new ListNode(nums[1]);
        start.next = tmp;
        ListNode current = tmp;
        for (int i = 2; i < n; i++) {
            tmp = new ListNode(nums[i]);
            current.next = tmp;
            current = tmp;

        }
        return start;
    }
    public static List<Integer> unConstructListNode(ListNode node) {
        return unConstructListNode( node, false);
    }

    public static List<Integer> unConstructListNode(ListNode node, boolean hasCycle) {
        if (!hasCycle) {
            List<Integer> ret = new ArrayList<>();
            if (node == null) {
                return ret;
            }
            while (node != null) {
                ret.add(node.val);
                node = node.next;
            }
            return ret;
        }else{
            ListNode newNode =  breakCycle(node);
            return unConstructListNode( newNode, false);
        }
    }

    private static ListNode breakCycle(ListNode node) {
        ListNode slow = node;
        ListNode fast = slow;

        int count=0;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if (slow == fast) {
                break;
            }
        }

        ListNode p=slow;
        while(p.next!=slow){
            p=p.next;
        }
        p.next=null;
        return slow;
    }
}
