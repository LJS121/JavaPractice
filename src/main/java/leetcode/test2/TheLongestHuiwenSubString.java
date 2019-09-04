package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/30 14:04
 */
public class TheLongestHuiwenSubString {
    public String theLongestHuiwenSubString(String supply) {
        String result = null;
        boolean[][] dp = new boolean[supply.length()][supply.length()];
        for (int i = supply.length() - 1; i >= 0; i--) {
            for (int j = i; j < supply.length(); j++) {
                dp[i][j] = supply.charAt(i) == supply.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && (result == null || j - i + 1 > result.length())) {
                    result = supply.substring(i, j + 1);
                }
            }
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(theLongestHuiwenSubString("fafadabcbafdfdfas"));
    }
}
