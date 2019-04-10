package easy.e0141sqrtx;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SqrtxTest {
    @Test

    public void test1(){
        Solution s=new Solution();

        int x;
        int expect;
        int output;
        int seq=1;

        x=1;
        expect=1;
        output=s.sqrt(x);
        VerifyUtil.verify(expect,output,seq++);

        x=4187;
        expect=64;
        output=s.sqrt(x);
        VerifyUtil.verify(expect,output,seq++);

        x=999999999;
        expect=31622;
        output=s.sqrt(x);
        VerifyUtil.verify(expect,output,seq++);

        x=2147483647;
        expect=46340;
        output=s.sqrt(x);
        VerifyUtil.verify(expect,output,seq++);
    }
}
