package leetcode;

import org.junit.Test;

/**
 * @author jinsong.Liang
 * @date 2019/4/2 11:31
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int num:nums){
            if(sum>0){
                sum += num;
            }else{
                sum = num;
            }
            max = Math.max(max,sum);
        }
        return max;
    }

    @Test
    public void test(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

}
