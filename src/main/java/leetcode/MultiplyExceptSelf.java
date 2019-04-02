package leetcode;

import org.junit.Test;

/**
 *方法很巧妙 要求时间复杂度 O(n)   建议先不看
 * @author jinsong.Liang
 * @date 2019/4/2 14:05
 */
public class MultiplyExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int len = nums.length;
        int[] output = new int[len];
        for(int i=0;i<len;i++){
            output[i] = left;
            left *= nums[i];
        }
        for(int j=len-1;j>=0;j--){
            output[j] *= right;
            right *= nums[j];
        }
        return output;
    }
    @Test
    public void test(){
        int[] nums = {1,2,3,4};
        int[] ints = productExceptSelf(nums);
        for(int i:ints){
            System.out.print(i+" ");
        }
    }
}
