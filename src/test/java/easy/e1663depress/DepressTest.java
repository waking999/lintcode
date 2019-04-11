package easy.e1663depress;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class DepressTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int m;
        int k;
        int[] arr;
        String expect;
        String output;
        int seq = 1;

        m = 7;
        k = 3;
        arr = new int[]{5, 3, 4, 2, 1};
        expect = "yes";
        output = s.depress(m, k, arr);
        VerifyUtil.verify(expect, output, seq++);

        m = 3;
        k = 3;
        arr = new int[]{5, 1, 1, 2, 3, 1};
        expect = "no";
        output = s.depress(m, k, arr);
        VerifyUtil.verify(expect, output, seq++);


    }
}
