package easy.e0060searchinsertposition;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        int target;
        int expect;
        int output;
        int seq=1;

        A=new int[]{-1,0,1,2};
        target=2;
        expect=3;
        output=s.searchInsert(A,target);
        VerifyUtil.verify(expect,output,seq++);

    }
}
