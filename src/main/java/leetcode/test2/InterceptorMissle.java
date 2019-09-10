package leetcode.test2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jinsong.Liang
 * @Description  类似于最长递减子序列
 * @date 2019/8/29 14:49
 */
public class InterceptorMissle {
    public int interceptorMissle(int[] missle) {
        int[] dp = new int[missle.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (missle[j] > missle[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                max = dp[i] > max ? dp[i] : max;
            }
        }
        return max;
    }

    @Test
    public void test() {
        System.out.println(interceptorMissle(new int[] {5, 7, 1, 8, 3, 5, 7, 9}));
        System.out.println(interceptorMissle(new int[] {2, 1, 5, 3, 6, 4, 8, 9, 7}));
    }
}
