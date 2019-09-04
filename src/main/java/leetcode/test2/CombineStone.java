package leetcode.test2;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/28 14:56
 */
public class CombineStone {
    public int combineStone_2() {
        int[] nums = new int[] {4, 4, 5, 9};
        int len = nums.length;
        int[][] dp = new int[len][len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k <= j - 1; k++) {
                        int temp = dp[i][k] + dp[k + 1][j] + sum(nums, i, j);
                        if (temp < dp[i][j])
                            dp[i][j] = temp;
                    }
                }
            }
        }
        return dp[0][len - 1];
    }

    public int combineStone() {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        int index = 0;
        while (len-- > 0 && scanner.hasNext()) {
            nums[index++] = scanner.nextInt();
        }
        len = nums.length;
        int[][] dp = new int[len][len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                if (i == j) {
                    dp[i][j] = 0;
                } else {
                    for (int k = i; k < j - 1; k++) {
                        int temp = dp[i][k] + dp[k + 1][j] + sum(nums, i, j);
                        if (temp < dp[i][j])
                            dp[i][j] = temp;
                    }
                }
            }
        }
        return dp[0][len - 1];
    }

    private int sum(int[] nums, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new CombineStone().combineStone_2());
    }

    @Test
    public void test(){
        System.out.println(new CombineStone().combineStone_2());
    }
}
