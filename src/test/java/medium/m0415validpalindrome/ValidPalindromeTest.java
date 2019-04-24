package medium.m0415validpalindrome;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        boolean expect;
        boolean output;
        int seq = 1;

        str = "A man, a plan, a canal: Panama";
        expect = true;
        output = s.isPalindrome(str);
        VerifyUtil.verify(expect, output, seq++);
    }
}
