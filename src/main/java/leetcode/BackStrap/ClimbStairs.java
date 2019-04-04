package leetcode.BackStrap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * @author jinsong.Liang
     * @date 2019/4/1 15:03
     */
    public static class GenerateParenthesis {
        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            generateOneByOne("", result, n, n);
            return result;
        }

        private void generateOneByOne(String subList, List<String> result, int left, int right) {
            //退出条件
            if (left == 0 && right == 0) {
                result.add(subList);
                return;
            }
            if (left > 0) {
                generateOneByOne(subList, result, left - 1, right);
            }
            if (right > left) {
                generateOneByOne(subList, result, left, right - 1);
            }
        }

        @Test
        public void test() {
            List<String> strings = generateParenthesis(4);
            System.out.println(strings.size());
        }
    }
}
