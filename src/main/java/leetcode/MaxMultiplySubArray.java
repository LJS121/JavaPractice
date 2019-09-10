package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/4/2 12:35
 */
public class MaxMultiplySubArray {
    public int maxProduct(int[] nums) {
        int a=1;
        int max=nums[0];

        for(int num:nums){
            a=a*num;
            if(max<a)max=a;
            if(num==0)a=1;
        }
        a=1;
        for (int i = nums.length-1; i >= 0; i--) {
            a=a*nums[i];
            if(max<a)max=a;
            if(nums[i]==0)a=1;
        }
        return max;
    }

    @Test
    public void test(){
        int[] nums = {2,0,3,-2,4,5};
        System.out.println(maxProduct(nums));
    }
}
