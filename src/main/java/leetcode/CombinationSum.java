package leetcode;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 20:36
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        if (candidates[0] > target) {
            return Collections.emptyList();
        }
        int index = candidates.length;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > target) {
                index = i;
                break;
            }
        }

        List<Integer> list1 = Ints.asList(candidates);
        for (int i = 0; i < index; i++) {
            int temp = candidates[i];
            if(target%temp==0){
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < target / temp; j++) {
                    list.add(temp);
                }
                result.add(list);
            }else{
                for (int j = 1; j <= target/temp-1; j++) {
                    List<Integer> list = new ArrayList<>();
                    if(list1.contains((target-j*temp))){
                        for (int k = 0; k < j; k++) {
                            list.add(temp);
                        }
                        list.add(target-j*temp);
                    }
                    result.add(list);
                }
            }
        }
        return Collections.emptyList();
    }

}
