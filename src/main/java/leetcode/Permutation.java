package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author jinsong.Liang
 * @date 2019/4/1 18:35
 */
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result, nums, 0);
        return result;
    }

    public void permute(List<List<Integer>> result, int[] nums, int index) {
        if (index == nums.length - 1) {
//            System.out.println(Ints.asList(nums));
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            result.add(temp);
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            permute(result, nums, index + 1);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> permute = permute(nums);
        permute.forEach(vo -> System.out.println(vo));
    }
}
