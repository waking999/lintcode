package medium.m0599insertintoacyclicsortedlist;

import common.ListNode;

public class Solution {



    public ListNode insert(ListNode node, int x) {
        // write your code here
        ListNode xNode=new ListNode(x);
        if(node==null){
            xNode.next=xNode;
            return xNode;
        }
        ListNode p1=node;
        ListNode p2=node.next;
        while(p2!=node){
             if(p1.val<=x && p2.val>=x){
                 break;
             }
             if(p1.val>p2.val&&(p1.val<x||p2.val>x)){
                 break;
             }
             p1=p1.next;
             p2=p2.next;
        }
        p1.next=xNode;
        xNode.next=p2;

        return xNode;
     }
}
