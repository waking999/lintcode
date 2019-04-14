package easy.e1565modernludoi;

public class Solution {
    public int modernLudo(int length, int[][] connections) {
        // Write your code here
        if (length <= 7) {
            return 1;
        }
        int []f = new int[length + 1];
        int []dp = new int[length + 1];
        for (int i = 1; i <= length; ++i) {
            f[i] = i;
            dp[i] = Integer.MAX_VALUE;
        }
        dp[1] = 0;
        for (int[] connection : connections) {
            f[connection[0]] = Math.max(connection[1], f[connection[0]]);
        }
        for (int i = 2; i <= length; ++i) {
            if (i - 6 < 1) {
                dp[i] = 1;
            } else {
                for (int j = i-1; j > i-7; j--) {
                    dp[i] = Math.min(dp[j]+1, dp[i]);
                }
            }
            dp[f[i]] = Math.min(dp[i], dp[f[i]]);
        }
        return dp[length];
    }
}
