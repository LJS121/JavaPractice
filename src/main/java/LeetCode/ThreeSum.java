package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j){
                    continue;
                }
                for (int k = 0; k < nums.length; k++) {
                    if(k==i||k==j){
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[k]==0){

                    }
                }
            }
        }
    }
}
