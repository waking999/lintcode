package easy.e1632countemailgroups;

import common.Util;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CountEmailGroupsTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String[] emailArray;
        List<String> emails;
        int expect;
        int output;
        int seq = 1;

        emailArray = new String[]{"ab.cd+cd@jiu.zhang.com", "ab.cd+cd@jiuzhang.com", "ab+cd.cd@jiuzhang.com"};
        emails = Util.convertArrayToList(emailArray);
        expect = 0;
        output = s.countGroups(emails);
        VerifyUtil.verify(expect, output, seq++);
    }
}
