package easy.e0372deletenodeinalinkedlist;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DeleteNodeinaLinkedListTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        ListNode node;
        int[] expect;
        List<Integer> output;
        int seq=1;

        nums=new int[]{1,2,3,4};
        node=ListNode.constructListNode(nums);
        s.deleteNode(node);
        expect=new int[]{1,2,4};
        output=ListNode.unConstructListNode(node);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        nums=new int[]{1,3,5};
        node=ListNode.constructListNode(nums);
        s.deleteNode(node);
        expect=new int[]{1,5};
        output=ListNode.unConstructListNode(node);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
