package leetcode.test2;

import java.util.Random;

import org.junit.Test;

import leetcode.BubbleSort;
import leetcode.Tool;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/8/28 10:58
 */
public class Solution {
    @Test
    public void test() {
        int[] nums = new int[] {3, 1, 2, 5, 4};
        quickSort(nums, 0, nums.length - 1);
        Tool.printInt(nums);
    }

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
        int target = nums[left];
        while (start < end) {
            while (start < end && nums[end] > target) {
                end--;
            }
            while (start < end && nums[start] <= target) {
                start++;
            }
            Tool.swap(nums, start, end);
        }
        Tool.swap(nums, left, end);
        return end;
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
            total_count += count;
            Tool.printInt(nums);
        }
        System.out.println("是否全部排序?(全部排序好为0)" + total_count);
    }
}
