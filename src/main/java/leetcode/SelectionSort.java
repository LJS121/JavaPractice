package leetcode;

import java.util.Random;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/9/10 16:01
 */
public class SelectionSort {
    public void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[k] > nums[j]) {
                    k = j;
                }
            }
            Tool.swap(nums, k, i);
        }
    }

    @Test
    public void test() {
        int times = 20;
        int total_count = 0;
        for (int i = 0; i < times; i++) {
            int size = new Random().nextInt(10);
            int[] nums = new int[size];
            for (int j = 0; j < size; j++) {
                nums[j] = new Random().nextInt(100);
            }
            selectionSort(nums);
            int count = BubbleSort.bubbleSort(nums);
            total_count += count;
            Tool.printInt(nums);
        }
        String str = total_count == 0 ? "成功" : "失败";
        System.out.println("排序算法:" + str);
    }


    @Test
    public void test2(){
        int[] nums = new int[]{31,1,74,2,17,44,86,96};
        selectionSort(nums);
    }
}
