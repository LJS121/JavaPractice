package leetcode.test2;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/9 14:46
 */
public class Greedy_I {
    /**
     * jump I
     */
    public boolean greedy(int[] nums) {
        int index = 0;
        while (index < nums.length && nums[index] != 0) {
            index = nums[index] + index;
        }
        return index >= nums.length - 1;
    }

    @Test
    public void test() {
        int[] nums = new int[] {2, 3, 1, 0, 4};
        System.out.println(greedy(nums));
    }
}
