package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description 使用dp动态规划实现求子集的和
 * @date 2019/9/3 19:22
 */
public class SubSum {
    public boolean subSum(int[] nums, int target) {
        boolean[][] solution = new boolean[nums.length + 1][target + 1];
        for (int i = 0; i < solution.length; i++) {
            solution[0][i] = false;
            solution[i][0] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                solution[i][j] = solution[i - 1][j];
                if (!solution[i][j] && j >= nums[i - 1]) {
                    solution[i][j] = solution[i][j] || solution[i-1][j - nums[i - 1]];
                }
            }
        }
        return solution[nums.length][target];
    }

    @Test
    public void test(){
        System.out.println(subSum(new int[]{2,3,5,7,8},19));
    }
}
