package easy.e1478closesttargetvalue;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ClosestTargetValueTest {
    @Test
    public void test1(){
        Solution s=new Solution();
        int target;
        int[] array;
        int expect;
        int output;
        int seq=1;

        target=-10;
        array=new int[]{ -12,-5,14,5,0,-16};
        expect=-11;
        output=s.closestTargetValue(target,array);
        VerifyUtil.verify(expect,output,seq++);

        target=6;
        array=new int[]{ -18,-4,-6,13,4,4,16,-8};
        expect=5;
        output=s.closestTargetValue(target,array);
        VerifyUtil.verify(expect,output,seq++);


    }
}
