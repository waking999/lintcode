package easy.e0956datasegmentation;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class DataSegmentationTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        String[] expect;
        String[] output;
        int seq = 1;

        str = "(hi (i am)bye)";
        expect = new String[]{"(", "hi", "(", "i", "am", ")", "bye", ")"};
        output = s.dataSegmentation(str);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        str = "a";
        expect = new String[]{"a"};
        output = s.dataSegmentation(str);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        str = "    ";
        expect = new String[]{};
        output = s.dataSegmentation(str);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        str = "#ok   yes";
        expect = new String[]{"#","ok","yes"};
        output = s.dataSegmentation(str);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
