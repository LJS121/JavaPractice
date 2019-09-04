package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/28 10:58
 */
public class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i][j] = piles[j];
                } else {
                    dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1] > 0;
    }

    @Test
    public void test() {
        System.out.println(stoneGame(new int[] {2, 3, 4, 5}));
        System.out.println(stoneGame(new int[] {2, 3, 4}));
        System.out.println(stoneGame(new int[] {2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
