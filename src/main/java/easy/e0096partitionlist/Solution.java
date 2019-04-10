package easy.e0096partitionlist;

import common.ListNode;

public class Solution {
    /**
     * @param head: The first node of linked list
     * @param x: An integer
     * @return A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head==null){
            return null;
        }
        ListNode p=head;
        while(p.next!=null){
            p=p.next;
        }
        if(p==head){
            return head;
        }

        ListNode tail=p;
        ListNode originalTail=tail;

        ListNode d=new ListNode(-1);
        d.next=head;
        p=d;

        while(p.next!=null&&p.next!=originalTail){
            if(p.next.val>=x){
                ListNode p2=p.next;
                p.next=p2.next;
                p2.next=null;
                tail.next=p2;
                tail=tail.next;
            }else {
                p = p.next;
            }
        }
        assert p.next != null;
        if(p.next.val>=x){
            ListNode p2=p.next;
            p.next=p2.next;
            p2.next=null;
            tail.next=p2;
            tail=tail.next;
        }



        return d.next;
    }
}
