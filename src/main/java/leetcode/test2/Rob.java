package leetcode.test2;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/28 14:22
 */
public class Rob {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 2];
        if (n < 1)
            return 0;
        dp[0] = nums[0];
        if (n == 1)
            return dp[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[n - 1];
    }
}
