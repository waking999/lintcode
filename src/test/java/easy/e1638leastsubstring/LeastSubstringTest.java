package easy.e1638leastsubstring;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LeastSubstringTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String str;
        int k;
        int expect;
        int output;
        int seq=1;

        str="bbbcabcab";
        k=2;
        expect=8;
        output=s.getAns(str,k);
        VerifyUtil.verify(expect,output,seq++);

    }
}
