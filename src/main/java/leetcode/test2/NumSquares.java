package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/3 16:33
 */
public class NumSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (i - j * j >= 0) {
                int temp = Math.min(dp[i - j * j] + 1, min);
                min = temp < min ? temp : min;
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
    }

    @Test
    public void test() {
        System.out.println(numSquares(4));
    }

}
