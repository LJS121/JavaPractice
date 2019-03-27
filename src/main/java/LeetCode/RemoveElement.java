package LeetCode;

import org.junit.Test;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        for(int i=0; i<= nums.length-1; i++) if (nums[i] != val) nums[l++] = nums[i];
        return l;
    }
    @Test
    public void test(){
        int[] nums = {3,2,2,3};
        int len = removeElement(nums,2);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
