package easy.e1187kdifpairsinanarray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class KdiffPairsinanArrayTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        int k;
        int expect;
        int output;
        int seq=1;

        nums=new int[]{3, 1, 4, 1, 5};
        k=2;
        expect=2;
        output=s.findPairs(nums,k);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{1, 3, 1, 5, 4};
        k=0;
        expect=1;
        output=s.findPairs(nums,k);
        VerifyUtil.verify(expect,output,seq++);
    }
}
