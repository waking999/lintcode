package easy.e0096partitionlist;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PartitionListTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        ListNode head;
        int x;
        int[] expect;
        ListNode outputNode;
        List<Integer> output;
        int seq=1;

        nums=new int[]{1,1};
        head=ListNode.constructListNode(nums);
        x=0;
        expect=new int[]{1,1};
        outputNode=s.partition(head,x);
        output=ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        nums=new int[]{1};
        head=ListNode.constructListNode(nums);
        x=0;
        expect=new int[]{1};
        outputNode=s.partition(head,x);
        output=ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        nums=new int[]{3,3,1,2,4};
        head=ListNode.constructListNode(nums);
        x=3;
        expect=new int[]{1,2,3,3,4};
        outputNode=s.partition(head,x);
        output=ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        nums=new int[]{1,2,0,3,1,2,1,0,2,2,2,1,0,2};
        head=ListNode.constructListNode(nums);
        x=2;
        expect=new int[]{1,0,1,1,0,1,0,2,3,2,2,2,2,2};
        outputNode=s.partition(head,x);
        output=ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
