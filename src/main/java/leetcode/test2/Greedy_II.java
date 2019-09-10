package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/9 15:27
 */
public class Greedy_II {
    public int solution(int[] nums) {
        int left = 0;
        int right = 0;
        int step = 0;
        while (left <= right) {
            step++;
            int old_right = right;
            for (int i = left; i <= old_right; i++) {
                int new_right = nums[i] + i;
                if (new_right >= nums.length - 1) return step;
                if (new_right > right) right = new_right;
            }
            left = old_right + 1;
        }
        return 0;
    }

    @Test
    public void test() {
        System.out.println(solution(new int[] {2, 3, 1, 1, 4}));
    }
}
