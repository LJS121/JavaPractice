package LeetCode;
/**
 * 给定一个整数数组 给定目标值
 * 求出所有满足 四个加在一起等于 target的列表集合
 */

import org.junit.Test;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums,int target){
        if(nums.length<4){
            Collections.emptyList();
        }
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k = j+1;
                int m = nums.length-1;
                while(k<m){
                    int sum = nums[i]+nums[j]+nums[k]+nums[m];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k++],nums[m--]));
                    }
                    if(sum>target){
                        m--;
                    }
                    if(sum<target){
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    @Test
    public void fourSumTest(){
        int[] num = {1,2,3,4,5,84,10};
        List<List<Integer>> lists = fourSum(num,100);
        for (List<Integer> list:lists
        ) {
            for (int i:list
            ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
