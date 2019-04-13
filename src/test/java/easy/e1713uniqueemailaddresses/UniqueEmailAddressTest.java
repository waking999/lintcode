package easy.e1713uniqueemailaddresses;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class UniqueEmailAddressTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String[] emails;
        int expect;
        int output;
        int seq=1;

        emails=new String[]{"test.email+alex@lintcode.com","test.e.mail+bob.cathy@lintcode.com","testemail+david@lin.tcode.com"};
        expect=2;
        output=s.numUniqueEmails(emails);
        VerifyUtil.verify(expect,output,seq++);
    }
}
