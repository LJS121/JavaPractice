package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/9 19:23
 */
public class Cocktail {
    public int cocktail(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            for (int i = left; i <= right - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    Tool.swap(nums, i, i + 1);
                    count++;
                }
            }
            right--;
            for (int i = right - 1; i >= left; i--) {
                if (nums[i + 1] < nums[i]) {
                    Tool.swap(nums, i, i + 1);
                    count++;
                }
            }
            left++;
        }
        return count;
    }

    @Test
    public void test() {
        int[] nums = new int[] {8, 9, 1, 2, 3, 6, 4};
        int cocktail = cocktail(nums);
        Tool.printInt(nums);
        System.out.println(cocktail);
    }
}
