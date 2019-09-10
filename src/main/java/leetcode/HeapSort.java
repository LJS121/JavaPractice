package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/10 10:38
 */
public class HeapSort {
    public void heapSort_II(int[] nums) {
        int count = 0;
        heapSort(nums, count);
    }

    public void heapSort(int[] nums, int count) {
        if (nums.length - count == 1) return;
        int root = (nums.length - count - 1) % 2 == 0 ? (nums.length - count - 3) / 2 : (nums.length - count - 1) / 2;
        for (int i = root; i >= 0; i--) {
            if (2 * i + 2 <= nums.length - count - 1 && nums[i] < Math.max(nums[2 * i + 1], nums[2 * i + 2])) {
                Tool.swap(nums, i, nums[2 * i + 1] > nums[2 * i + 2] ? 2 * i + 1 : 2 * i + 2);
            }
            if (nums[i] < nums[2 * i + 1]) {
                Tool.swap(nums, i, 2 * i + 1);
            }
        }
        Tool.swap(nums, 0, nums.length - count - 1);
        heapSort(nums, ++count);
    }

    @Test
    public void test() {
        int[] nums = new int[] {2, 3, 1, 5, 4};
        heapSort_II(nums);
        Tool.printInt(nums);
    }

    @Test
    public void test2() {
        int[] nums = {8, 9, 1, 2, 3, 6, 4};
        heapSort_II(nums);
        Tool.printInt(nums);
    }
}
