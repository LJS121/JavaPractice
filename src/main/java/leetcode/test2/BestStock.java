package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description 股票的最佳买入时间 只能进行一次买卖
 * 找到股票最低和最高的时间点。要满足 最低的发生在最高之前
 * @date 2019/9/4 17:28
 */
public class BestStock {
    public int bestStock(int[] nums) {
        int buyIn = nums[0];
        int maxProfit = 0;
        for (int price : nums) {
            maxProfit = Math.max(maxProfit, price - buyIn);
            buyIn = Math.min(buyIn, price);
        }
        return maxProfit;
    }

    @Test
    public void test() {
        System.out.println(bestStock(new int[] {7, 1, 5, 3, 6, 4}));
    }
}
