package leetcode;

import org.junit.Test;

import java.util.*;

public class CombinationSum4 {
    public List<List<Integer>> combination(int[] candidates,int target){
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        find(candidates,target,result,temp,0);
        return new ArrayList<>(result);
    }
    public void find(int[] candidates,int target,Set<List<Integer>> result,List<Integer> temp,int index){
        if(target==0){
            result.add(temp);
            return;
        }
        if(target<candidates[0]){
            return;
        }
        for (int j = index; j < candidates.length&&target>=candidates[j]; j++) {
            List<Integer> list = new ArrayList<>(temp);
            list.add(candidates[j]);
            find(candidates,target-candidates[j],result,list,j+1);
        }
    }
    @Test
    public void test(){
        int[] nums = {10,1,2,7,6,1,5};
        List<List<Integer>> combination = combination(nums, 8);
        combination.forEach(vo-> System.out.println(vo));
    }
}
