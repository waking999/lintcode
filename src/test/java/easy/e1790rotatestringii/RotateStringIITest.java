package easy.e1790rotatestringii;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class RotateStringIITest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String str;
        int left;
        int right;
        String expect;
        String output;
        int seq=1;

        str ="abcdefg";
        left = 3;
        right = 1;
        expect="cdefgab" ;
        output=s.RotateString2(str,left,right);
        VerifyUtil.verify(expect,output,seq++);

        str="abcdefg";
        left = 0;
        right = 0;
        expect="abcdefg";
        output=s.RotateString2(str,left,right);
        VerifyUtil.verify(expect,output,seq++);

        str ="abcdefg";
        left = 1;
        right = 2;
        expect="gabcdef" ;
        output=s.RotateString2(str,left,right);
        VerifyUtil.verify(expect,output,seq++);


        str ="GCNJVIhHWPQWHIMIMUJqqLFNzULW";
        left = 3063;
        right = 9697;
        expect="NJVIhHWPQWHIMIMUJqqLFNzULWGC" ;
        output=s.RotateString2(str,left,right);
        VerifyUtil.verify(expect,output,seq++);
    }
}
