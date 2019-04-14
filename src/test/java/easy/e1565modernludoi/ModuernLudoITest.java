package easy.e1565modernludoi;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ModuernLudoITest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[][] connections;
        int length;
        int expect;
        int output;
        int seq=1;

        connections=new int[][]{{2,10}};
        length=10;
        expect=1;
        output=s.modernLudo(length,connections);
        VerifyUtil.verify(expect,output,seq++);

        connections=new int[][]{{2,8},{6,9}};
        length=15;
        expect=2;
        output=s.modernLudo(length,connections);
        VerifyUtil.verify(expect,output,seq++);

        connections=new int[][]{{7,9},{8,14}};
        length=15;
        expect=2;
        output=s.modernLudo(length,connections);
        VerifyUtil.verify(expect,output,seq++);
    }
}
