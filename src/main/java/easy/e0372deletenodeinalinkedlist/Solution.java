package easy.e0372deletenodeinalinkedlist;

import common.ListNode;

public class Solution {

    public void deleteNode(ListNode node) {
        // write your code here
        if(node==null){
            return ;
        }



        ListNode s=node;
        ListNode f=node;

        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode p=node;

        while(p!=null&&p.next!=s){
            p=p.next;
        }
        assert p != null;
        p.next=p.next.next;

    }
}
