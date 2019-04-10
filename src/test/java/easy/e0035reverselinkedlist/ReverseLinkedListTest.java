package easy.e0035reverselinkedlist;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ReverseLinkedListTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        ListNode head;
        int[] expect;
        ListNode outputNode;
        List<Integer> output;
        int seq=1;

        nums=new int[]{0,1};
        head=ListNode.constructListNode(nums);
        expect=new int[]{1,0};
        outputNode=s.reverse(head);
        output=ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
