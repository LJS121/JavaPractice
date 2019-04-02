package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combination(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        find(result, candidates, temp, target, 0);
        return result;
    }

    private void find(List<List<Integer>> result, int[] candidates, List<Integer> temp, int target, int i) {
        if (target == 0) {
            result.add(temp);
            return;
        }
        if (candidates[0] > target) {
            return;
        }
        for (int j = i; j < candidates.length&&candidates[j]<=target; j++) {
            List<Integer> list = new ArrayList<>(temp);
            list.add(candidates[j]);
            find(result,candidates,list,target-candidates[j],j);
        }
    }

    @Test
    public void test(){
        int[] nums = {2,3,6,7};
        List<List<Integer>> combination = combination(nums, 7);
        combination.forEach(vo-> System.out.println(vo));
    }
}
