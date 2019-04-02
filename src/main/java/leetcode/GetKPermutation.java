package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/4/2 15:15
 */
public class GetKPermutation {
    public String getPermutation(int n, int k) {
        List<String> result = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        permutate(result,nums,0);
        Collections.sort(result);
        return result.get(k-1);
    }
    public void permutate(List<String> result,int[] nums,int index) {
        if (index == nums.length - 1) {
            String temp = new String();
            for (int num : nums) {
                temp += num;
            }
            result.add(temp);
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums,index,i);
            permutate(result,nums,index+1);
            swap(nums,index,i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Test
    public void test(){
        System.out.println(getPermutation(9,17223));
    }

}
