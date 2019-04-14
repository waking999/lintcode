package easy.e0604windowsum;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class WIndowSumTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int k;
        int[] expect;
        int[] output;
        int seq = 1;

        nums = new int[]{1, 2, 7, 8, 5};
        k = 3;
        expect = new int[]{10, 17, 20};
        output = s.winSum(nums, k);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
