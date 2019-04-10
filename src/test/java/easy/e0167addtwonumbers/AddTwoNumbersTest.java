package easy.e0167addtwonumbers;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddTwoNumbersTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums1;
        ListNode l1;
        int[] nums2;
        ListNode l2;
        int[] expect;
        ListNode outputNode;
        List<Integer> output;
        int seq=1;

        nums1=new int[]{3,1,5};
        l1=ListNode.constructListNode(nums1);
        nums2=new int[]{5,9,2};
        l2=ListNode.constructListNode(nums2);
        expect=new int[]{8,0,8};
        outputNode=s.addLists(l1,l2);
        output=ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        nums1=new int[]{0};
        l1=ListNode.constructListNode(nums1);
        nums2=new int[]{9,9};
        l2=ListNode.constructListNode(nums2);
        expect=new int[]{9,9};
        outputNode=s.addLists(l1,l2);
        output=ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
