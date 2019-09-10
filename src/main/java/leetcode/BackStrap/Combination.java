package leetcode.BackStrap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jinsong.Liang
 * @Description
 * @date 2019/4/4 11:30
 */
public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new LinkedList<>();
        dsf(ans, new LinkedList<>(), 1, n+1, k);
        return ans;
    }
    private static void dsf(List<List<Integer>> ans, LinkedList<Integer> item, int index, int n, int k) {
        if (item.size() == k) {
            ans.add(new ArrayList<>(item));
            System.out.println(Arrays.deepToString(item.toArray()));
            return;
        }

        if (n - index < (k - item.size())) {
            return;
        }
        item.add(index);
        dsf(ans, item, index + 1, n, k);
        item.removeLast();
        dsf(ans, item, index + 1, n, k);
    }

    @Test
    public void test() {
        List<List<Integer>> combine = combine(4, 3);
    }
}
