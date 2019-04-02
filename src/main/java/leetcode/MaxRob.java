package leetcode;

import org.junit.Test;

/**
 * 抢劫问题和爬梯子问题很相似
 * @author jinsong.Liang
 * @date 2019/4/2 12:54
 */
public class MaxRob {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }

    @Test
    public void test(){
        int[] nums = {1,2};
        System.out.println(rob(nums));
    }
}
