package easy.e1639ksubstringwithkdifferentcharacters;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class KSubstringwithKdifferentcharactersTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String stringIn;
        int K;
        int expect;
        int output;
        int seq=1;

        stringIn="abcabc";
        K=3;
        expect=3;
        output=s.KSubstring(stringIn,K);
        VerifyUtil.verify(expect,output,seq++);

        stringIn="abacab";
        K=3;
        expect=2;
        output=s.KSubstring(stringIn,K);
        VerifyUtil.verify(expect,output,seq++);

        stringIn="ad";
        K=3;
        expect=0;
        output=s.KSubstring(stringIn,K);
        VerifyUtil.verify(expect,output,seq++);


    }
}
