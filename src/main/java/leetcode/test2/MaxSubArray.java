package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/28 16:51
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        for (int i = 0; i < len; i++) {
            int result = 0;
            for (int j = i; j < len; j++) {
                if (result + nums[j] > 0) {
                    result += nums[j];
                } else {
                    result = nums[j];
                }
                if (result > max)
                    max = result;
            }
        }
        return max;
    }

    public int maxSubArray_2(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int result = 0;
        for (int num : nums) {
            if (result > 0)
                result += num;
            result = num;
        }
        return result;
    }

    public int maxSubArray_3(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        if (len == 1)
            return dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            max = max < dp[i] ? dp[i] : max;
        }
        return max;
    }

    @Test
    public void test() {
        System.out.println(maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray_3(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
