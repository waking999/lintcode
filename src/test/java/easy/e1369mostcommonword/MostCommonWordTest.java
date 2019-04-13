package easy.e1369mostcommonword;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MostCommonWordTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String paragraph;
        String[] banned;
        String expect;
        String output;
        int seq=1;

        paragraph = "Bob hit a ball, the hit BALL flew far after it was hit." ;
        banned = new String[]{"hit"};
        expect="ball";
        output=s.mostCommonWord(paragraph,banned);
        VerifyUtil.verify(expect,output,seq++);

    }
}
