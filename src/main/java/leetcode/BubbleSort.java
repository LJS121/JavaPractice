package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/9 18:57
 */
public class BubbleSort {
    public static int bubbleSort(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int add = 0;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    System.out.println("这个数组没有排序成功:"+Tool.numsToString(nums));
                    Tool.swap(nums, j, j + 1);
                    add ++;
                }
            }
            if (add == 0){
                return count;
            }
            count += add;
        }
        return count;
    }

    @Test
    public void test() {
        int[] nums = {8, 9, 1, 2, 3, 6, 4};
        int count = bubbleSort(nums);
        Tool.printInt(nums);
        System.out.println(count);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 4, 6, 8, 9};
        int count = bubbleSort(nums);
        Tool.printInt(nums);
    }
}
