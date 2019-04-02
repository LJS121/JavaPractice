package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/4/2 13:45
 */
public class ClimbStairs {
    public int climb(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
    }

    @Test
    public void test(){
        System.out.println(climb(5));
    }
}
