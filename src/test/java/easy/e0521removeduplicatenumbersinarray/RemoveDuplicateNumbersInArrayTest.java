package easy.e0521removeduplicatenumbersinarray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateNumbersInArrayTest {
    @Test
    public void test1(){
         Solution s=new Solution();

         int[] nums;
         int expect;
         int output;
         int seq=1;


        nums = new int[]{1,3,1,4,4,2};
        expect=4;
        output=s.deduplication(nums);
        VerifyUtil.verify(expect,output,seq++);

    }
}
