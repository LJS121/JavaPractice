package leetcode;
/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用一次。
 */

import java.util.*;

public class CombinationSumII {
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
        for (int i = index; i < candidates.length&&candidates[i]<=target; i++) {
            List<Integer> list = new ArrayList<>(temp);
            list.add(candidates[i]);
            find(candidates,target-candidates[i],result,list,i);
        }
    }
}
