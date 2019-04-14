package medium.m0599insertintoacyclicsortedlist;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InsertintoaCyclicSortedListTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        ListNode node;
        ListNode p;
        int x;
        int[] expect;
        ListNode outputNode;
        List<Integer> output;
        int seq=1;


        nums=new int[]{3,5,1};
        node=ListNode.constructCyclicListNode(nums);
        p=node;
        x=4;
        expect=new int[]{4,5,1,3};
        outputNode=s.insert(node,x);
        output=ListNode.unConstructListNode(outputNode,true);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        nums=new int[]{2,2,2};
        node=ListNode.constructCyclicListNode(nums);
        p=node;
        x=3;
        expect=new int[]{3,2,2,2};
        outputNode=s.insert(node,x);
        output=ListNode.unConstructListNode(outputNode,true);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
