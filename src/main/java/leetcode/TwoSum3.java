package leetcode;
/**
 * 肯定比 双层for循环 快 求 TwoSum的 3.0 版本
 */

import java.util.Arrays;

public class TwoSum3 {
    public int[] twoSum(int[] num,int target){
        int i = 0;
        int j = num.length-1;
        Arrays.sort(num);
        while(i<j){
            int sum = num[i]+num[j];
            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }else{
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}
