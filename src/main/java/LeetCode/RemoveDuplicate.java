package LeetCode;
/**
 *
 */

import com.google.common.primitives.Ints;

import java.util.*;

/**
 * given a sorted array nums
 */
public class RemoveDuplicate {
    public Integer[] removeDuplicates(int[] nums) {
        List<Integer> list = Ints.asList(nums);
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        Integer[] ints = (Integer[]) (new ArrayList(set).toArray());
        Arrays.sort(ints);
        return ints;
    }

}
