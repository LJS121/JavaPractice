package leetcode;

import java.util.Random;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/9 18:43
 */
public class QuickSort {
    public void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int partition = partition(nums, left, right);
            quickSort(nums, left, partition - 1);
            quickSort(nums, partition + 1, right);
        }
    }

    public int partition(int[] nums, int left, int right) {
        int start = left;
        int end = right;
        int target = nums[right];
        while (start < end) {
            while (start < end && nums[start] <= target) {
                start++;
            }
            while (start < end && nums[end] >= target) {
                end--;
            }
            swap(nums, start, end);
        }
        swap(nums, right, start);
        return start;
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    @Test
    public void test() {
        int[] nums = {6, 1, 2, 7, 9};
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    @Test
    public void test2() {
        int[] nums = {8, 9, 1, 2, 3, 6, 4};
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
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
            quickSort(nums, 0, nums.length - 1);
            int count = BubbleSort.bubbleSort(nums);
            Tool.printInt(nums);
        }
        System.out.println("是否全部排序?(全部排序好为0)" + total_count);
    }

}
