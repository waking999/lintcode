package easy.e0637validwordabbreviation;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ValidWordAbbreviationTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String word;
        String abbr;
        boolean expect;
        boolean output;
        int seq=1;

        word = "internationalization";
        abbr = "i12iz4n";
        expect=true;
        output=s.validWordAbbreviation(word,abbr);
        VerifyUtil.verify(expect,output,seq++);


        word = "apple";
        abbr = "a2e";
        expect=false;
        output=s.validWordAbbreviation(word,abbr);
        VerifyUtil.verify(expect,output,seq++);

        word = "a";
        abbr = "01";
        expect=false;
        output=s.validWordAbbreviation(word,abbr);
        VerifyUtil.verify(expect,output,seq++);
    }
}
