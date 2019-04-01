package leetcode;
/**
 * 头一次提交beat 100% 纪念下 hhhh
 */

import org.junit.Test;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int x = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = target - sum;
                if (diff > 0) {
                    if (diff < x) {
                        x = diff;
                        result = sum;
                    }
                    j++;
                } else if (diff < 0) {
                    if (-diff < x) {
                        x = Math.abs(diff);
                        result = sum;
                    }
                    k--;
                } else {
                    return target;
                }
            }
        }
        return result;
    }

    @Test
    public void test() {
        int[] arr = {1, 1, 1, 0};
        System.out.println(threeSumClosest(arr, -100));
    }

}
