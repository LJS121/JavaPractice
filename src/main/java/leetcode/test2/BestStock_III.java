package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description 可以进行两次交易 但是交易不能有交叉 求 最大获益 分别从左边和右边进行 dp 动态规划 然后
 *               left[i] + right[i] i = 0:prices.lenght-1
 * @date 2019/9/4 17:53
 */
public class BestStock_III {
    public int bestStock(int[] prices) {
        int len = prices.length;
        int profit = 0;
        int[] left = new int[len];
        int min = prices[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(left[i - 1], prices[i] - min);
            min = Math.min(prices[i], min);
        }
        int[] right = new int[len];
        int max = prices[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], max - prices[i]);
            max = Math.max(prices[i], max);
            profit = Math.max(profit, right[i] + left[i]);
        }
        return profit;
    }

    @Test
    public void test() {
        System.out.println(bestStock(new int[] {3, 3, 5, 0, 0, 3, 1, 4}));
        System.out.println(bestStock(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void test2(){
        System.out.println(9>>1);
    }
}
