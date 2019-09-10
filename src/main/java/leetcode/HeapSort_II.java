package leetcode;

import org.junit.Test;

import java.util.Random;

/**
 * @author jinsong.Liang
 * @Description
 * 选择排序和插入排序
 * @date 2019/9/10 14:23
 */
public class HeapSort_II {
    @Test
    public void test() {
        int[] nums = {8, 9, 1, 2, 3, 6, 4};
        heapSort(nums);
        Tool.printInt(nums);
    }

    public void heapSort(int[] nums) {
        // 建堆
        for (int i = (nums.length - 2) / 2; i >= 0; i--) {
            shiftDown(nums, nums.length, i);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            Tool.swap(nums, 0, i);
            shiftDown(nums, i, 0);
        }
    }

    public void shiftDown(int[] nums, int count, int current) {
        while (2 * current + 1 < count) {
            int max = 2 * current + 1;
            if (max + 1 < count && nums[max] < nums[max + 1]) {
                max = max + 1;
            }
            if (nums[current] < nums[max]) {
                Tool.swap(nums, current, max);
            }
            current = max;
        }
    }

    @Test
    public void testN() {
        int times = 20;
        int total_count = 0;
        for (int i = 0; i < times; i++) {
            int size = new Random().nextInt(100);
            int[] nums = new int[size];
            for (int j = 0; j < size; j++) {
                nums[j] = new Random().nextInt(100);
            }
            heapSort(nums);
            int count = BubbleSort.bubbleSort(nums);
            total_count += count;
            Tool.printInt(nums);
        }
        System.out.println("是否全部排序?(全部排序好为0)" + total_count);
    }
}
