package leetcode.test2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jinsong.Liang
 * @Description 使用dp动态规划
 * 如果使用贪心算法  [1,99,100] 396 就会返回 -1  100 + 100 + 100 + ? 不存在
 * 但是用dp 求得正确结果 ： 99+99+99+99
 * @date 2019/9/4 16:50
 */
public class CoinsChange {
    public int coinsChange(int[] coins, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, target + 1);
        dp[0] = 0;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[target] > target ? -1 : dp[target];
    }

    @Test
    public void test(){
        System.out.println(coinsChange(new int[]{1,99,100},396));
        System.out.println(coinsChange(new int[]{1,2,5},11));
    }
}
